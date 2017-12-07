package ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation;

import java.util.List;

import javax.persistence.*;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;

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
/*	System.out.println("" + dt.size() + " persons:");
	for (DiaryText p : dt)
	System.out.println(p); */
}
	
}