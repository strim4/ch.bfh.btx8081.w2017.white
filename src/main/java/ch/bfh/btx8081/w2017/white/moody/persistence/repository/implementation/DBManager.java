package ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation;

import java.util.List;
import javax.persistence.*;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsEmoji;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsYesNo;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.SEntity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.SchwellenwertUserReaktion;

/**
 *  @author Moritz 
 *  @author Sandra; habe alles angepasst für mich, damit es Daten aus dem Profil herausliest
 *  last Edit: 17.01.2018
 */

public class DBManager {

	private static DBManager dbm = null;

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

	public void persistObject(SEntity sentity) {

		EntityTransaction entityTransaction = this.em.getTransaction();

		entityTransaction.begin();

		this.em.persist(sentity);
		this.em.flush();

		entityTransaction.commit();
	}

	public List<DiaryText> getd() {
		Query q = em.createQuery("select dt from DiaryText dt");
		List<DiaryText> dt = q.getResultList();
		return dt;
	}

	public List<Profile> getpr() {
		Query q = em.createQuery("select pr from Profile pr");
		List<Profile> pr = q.getResultList();
		return pr;
	}
	
	public int getId() {
	Query q = em.createQuery("select id from Profile id");
	List<Profile> prid = q.getResultList();
	int id = prid.get(0).getId();
		return id;
	}

	public String getFirstName() {
		Query q = em.createQuery("select firstname from Profile firstname");
		List<Profile> prfirstname = q.getResultList();
		String firstname = prfirstname.get(0).getFirstName();
		return firstname;
	}

	public String getHouseDoctor() {
		Query q = em.createQuery("select housedoctor from Profile housedoctor");
		List<Profile> prhousedoctor = q.getResultList();
		String housedoctor = prhousedoctor.get(0).getHouseDoctor();
		return housedoctor;
	}

	public String getHouseDoctorPhone() {
		Query q = em.createQuery("select housedoctorphone from Profile housedoctorphone");
		List<Profile> prhousedoctorphone = q.getResultList();
		String housedoctorphone = prhousedoctorphone.get(0).getHouseDoctorPhone();
		return housedoctorphone;
	}

	public String getEmergencyContact() {
		Query q = em.createQuery("select emergencycontact from Profile emergencycontact");
		List<Profile> premergencycontact = q.getResultList();
		String emergencycontact = premergencycontact.get(0).getEmergencyContact();
		return emergencycontact;
	}

	public String getEmergencyContactPhone() {
		Query q = em.createQuery("select emergencycontactphone from Profile emergencycontactphone");
		List<Profile> premergencycontactphone = q.getResultList();
		String emergencycontactphone = premergencycontactphone.get(0).getEmergencyContactPhone();
		return emergencycontactphone;
	}
	
	public List<SchwellenwertUserReaktion> getsur() {
		Query q = em.createQuery("select sur from SchwellenwertUserReaktion sur");
		List<SchwellenwertUserReaktion> sur = q.getResultList();
		return sur;
	}

	public List<Activity> geta() {
		Query q = em.createQuery("select a from Activity a");
		List<Activity> a = q.getResultList();
		return a;
	}

	public List<DiaryPic> getp() {
		Query q = em.createQuery("select p from DiaryPic p");
		List<DiaryPic> p = q.getResultList();
		return p;
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