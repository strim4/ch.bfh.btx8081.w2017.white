package ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation;

import java.util.List;

/**
 *  @author Moritz 
 */

import javax.persistence.*;

import org.atmosphere.config.service.Singleton;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.SEntity;

public class DBManager {
	
	private static DBManager dbm = null;
	
	public static DBManager getInstance() {
		if(dbm == null) {
			dbm = new DBManager();
		}
		return dbm;
	}
	
private  EntityManager em;

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

public List<PushMessages> getPushMessages(String type){
	Query q = em.createQuery("select m from PushMessages m where m.type =:type");
	q.setParameter("type", type);
	return q.getResultList();
}


	
}