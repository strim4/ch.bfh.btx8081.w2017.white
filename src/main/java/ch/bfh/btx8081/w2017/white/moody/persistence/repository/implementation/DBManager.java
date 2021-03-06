package ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ActivityEntries;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsEmoji;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsYesNo;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.SEntity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ThresholdValueUserReaction;

/**
 * @author Moritz
 * @author Sandra last Edit: 17.01.2018
 */

public class DBManager {

	private static DBManager dbm = null;

	// singleton pattern for DB Manager
	public static DBManager getInstance() {
		if (dbm == null) {
			dbm = new DBManager();
		}
		return dbm;
	}

	private EntityManager em;

	private static final String PERSISTENCE_UNIT_NAME = "ch.bfh.btx8081.w2017.white";

	private DBManager() {
		this.em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	}

	/**
	 * 
	 * Methode to persist any kind of entity that implements the SEntity Interface
	 * 
	 */
	public void persistObject(SEntity sentity) {
		EntityTransaction entityTransaction = this.em.getTransaction();
		entityTransaction.begin();
		this.em.persist(sentity);
		this.em.flush();
		entityTransaction.commit();
	}

	/**
	 * 
	 * Method to select all diaryText Entries from the DB and returns a List
	 * containing all entries
	 * 
	 */
	public List<DiaryText> getd() {
		Query q = em.createQuery("select dt from DiaryText dt");
		List<DiaryText> dt = q.getResultList();
		return dt;
	}

	/**
	 * 
	 * Method to select all Profile Entries from the DB and returns a List
	 * containing all entries
	 * 
	 */
	public List<Profile> getpr() {
		Query q = em.createQuery("select pr from Profile pr");
		List<Profile> pr = q.getResultList();
		return pr;
	}

	/**
	 * 
	 * Method to return the name attributs from all activitiyEntries for the
	 * dropdown activityentries. Methode returns an ArrayList containing the entries
	 * 
	 */
	public List<String> ActivityName() {
		Query q = em.createQuery("select name from ActivityEntries name");
		List<ActivityEntries> name = q.getResultList();
		List<String> aname = new ArrayList();
		for (int i = 0; i < name.size(); i++) {
			String aaname = name.get(i).getName();
			aname.add(aaname);

		}
		return aname;
	}

	/**
	 * 
	 * Method to select all Activities Entries from the DB and returns a List
	 * containing all entries
	 * 
	 */
	public List<Activity> geta() {
		Query q = em.createQuery("select a from Activity a");
		List<Activity> a = q.getResultList();
		return a;
	}

	/**
	 * 
	 * Method to select all diaryPic Entries from the DB and returns a List
	 * containing all entries
	 * 
	 */
	public List<DiaryPic> getp() {
		Query q = em.createQuery("select p from DiaryPic p");
		List<DiaryPic> p = q.getResultList();
		return p;
	}

	public int getId() {
		Query q = em.createQuery("select id from Profile id");
		List<Profile> prid = q.getResultList();
		int id = prid.get(0).getId();
		return id;
	}

	/**
	 * 
	 * Method to return the firstName attribute
	 * 
	 */
	public String getFirstName() {
		Query q = em.createQuery("select firstname from Profile firstname");
		List<Profile> prfirstname = q.getResultList();
		String firstname = prfirstname.get(0).getFirstName();
		return firstname;
	}

	/**
	 * 
	 * Method to return the houseDoctor attribute
	 * 
	 */
	public String getHouseDoctor() {
		Query q = em.createQuery("select housedoctor from Profile housedoctor");
		List<Profile> prhousedoctor = q.getResultList();
		String housedoctor = prhousedoctor.get(0).getHouseDoctor();
		return housedoctor;
	}

	/**
	 * 
	 * Method to return the houseDoctorPhone attribute
	 * 
	 */
	public String getHouseDoctorPhone() {
		Query q = em.createQuery("select housedoctorphone from Profile housedoctorphone");
		List<Profile> prhousedoctorphone = q.getResultList();
		String housedoctorphone = prhousedoctorphone.get(0).getHouseDoctorPhone();
		return housedoctorphone;
	}

	/**
	 * 
	 * Method to return the emergrncyContact attribute
	 * 
	 */
	public String getEmergencyContact() {
		Query q = em.createQuery("select emergencycontact from Profile emergencycontact");
		List<Profile> premergencycontact = q.getResultList();
		String emergencycontact = premergencycontact.get(0).getEmergencyContact();
		return emergencycontact;
	}

	/**
	 * 
	 * Method to return the emergrncyContactPhone attribute
	 * 
	 */
	public String getEmergencyContactPhone() {
		Query q = em.createQuery("select emergencycontactphone from Profile emergencycontactphone");
		List<Profile> premergencycontactphone = q.getResultList();
		String emergencycontactphone = premergencycontactphone.get(0).getEmergencyContactPhone();
		return emergencycontactphone;
	}

	/**
	 * 
	 * Method to select all ThresholdValueUserReaction Entries from the DB and returns a List
	 * containing all entries
	 * 
	 */
	public List<ThresholdValueUserReaction> getsur() {
		Query q = em.createQuery("select sur from ThersholdValueUserReaction sur");
		List<ThresholdValueUserReaction> sur = q.getResultList();
		return sur;
	}

	public List<PushMessages> getPushMessages(String type) {
		Query q = em.createQuery("select m from PushMessages m where m.type =:type");
		q.setParameter("type", type);
		return q.getResultList();
	}

	public List<QuestionResultsYesNo> getQuestionResultsYesNo() {
		Query q = em.createQuery("select qryn from QuestionResultsYesNo qryn");
		List<QuestionResultsYesNo> qryn = q.getResultList();
		return qryn;
	}

	public List<QuestionResultsEmoji> getQuestionResultsEmoji() {
		Query q = em.createQuery("select qre from QuestionResultsEmoji qre");
		List<QuestionResultsEmoji> qre = q.getResultList();
		return qre;
	}

	public List<Question> getQuestion() {
		Query q = em.createQuery("select qe from Question qe");
		List<Question> qe = q.getResultList();
		return qe;
	}
}