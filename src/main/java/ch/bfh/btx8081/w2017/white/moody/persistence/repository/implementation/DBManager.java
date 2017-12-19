package ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation;

import java.util.List;

import javax.persistence.*;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;

public class DBManager {
	
private  EntityManager em;

private static final String PERSISTENCE_UNIT_NAME = "ch.bfh.btx8081.w2017.white";

public DBManager() {
	this.em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
}

public List<?> getResultSet(String queryText) {
	Query query = this.em.createQuery(queryText);
	return query.getResultList();
}

public void persistObject(Object object) {

	EntityTransaction entityTransaction = this.em.getTransaction();
	
	entityTransaction.begin();
	
	this.em.persist(object);
	this.em.flush();
	
	entityTransaction.commit();
	
}

public List<DiaryText> showd() {
	Query q = em.createQuery("select dt from DiaryText dt");
	 List<DiaryText> dt = q.getResultList();
	 return dt;

}

public List<Profile> showpr() {
	Query q = em.createQuery("select pr from Profile pr");
	 List<Profile> pr = q.getResultList();
	 return pr;

}


public List<Activity> showa() {
	Query q = em.createQuery("select a from Activity a");
	 List<Activity> a = q.getResultList();
	 return a;

}
public List<DiaryPic> showp() {
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