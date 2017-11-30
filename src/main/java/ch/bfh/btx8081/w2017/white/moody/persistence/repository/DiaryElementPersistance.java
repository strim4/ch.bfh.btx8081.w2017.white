package ch.bfh.btx8081.w2017.white.moody.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;

public class DiaryElementPersistance {

	private static final String PERSISTENCE_UNIT_NAME = "ch.bfh.btx8081.w2017.white";
	private EntityManager em;

	public DiaryElementPersistance() {
		em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	}

	public void setUp() {
		    // Begin a new local transaction so that we can persist a new entity
		    EntityTransaction transaction = em.getTransaction();
		   
		  

	
	

      DiaryText diarytext = new DiaryText();
      em.persist(diarytext);
     // diarytext.setId(2);
      diarytext.setName("Mein zweiter Eintrag");
      diarytext.setNote("Heute war ich im Zoo");
      transaction.begin();
      em.persist(diarytext);
      
      // Commit the transaction, which will cause the entity to be stored in the
      // database
      em.flush();
      transaction.commit();
      }
	
	
	 public void checkAvailableEntries() {
	    // Perform a simple query for all the Message entities
	    Query q = em.createQuery("select m from DiaryElement m");

	    // We should have 40 Persons in the database
	    System.out.println("Entries " + q.getResultList().size());
	  }
	 
	//namen aller Einträge ausgeben
	 public void getNames() {
		 Query q = em.createQuery("select dt from DiaryElement dt");
		 List<DiaryElement> d = q.getResultList();
		 System.out.println("" + d.size() + " Einträge:");
		 for (DiaryElement de : d)
		 System.out.println(de.getName());
	 }
	 
	//alle Einträge ausgeben
		 public void getEntries() {
			 Query q = em.createQuery("select dt from DiaryElement dt");
			 List<DiaryElement> d = q.getResultList();
			 System.out.println("" + d.size() + " Einträge:");
			 for (DiaryElement de : d)
			 System.out.println(de);
		 }
		 
		 //Name des Eintrags updaten 
		 public void updateEntry() {
			 
			 em.getTransaction().begin();
			 Query q = em.createQuery("select dt from DiaryElement dt where dt.id = " + 1);
			 DiaryElement dt = (DiaryElement) q.getResultList().get(0);
			 dt.setName("Antidepressiver Alkspaziergang");
			 em.getTransaction().commit();
		 }
		 
		 //Eintrag über seine ID löschen
		 public void deleteEntry() {
			 em.getTransaction().begin();
			 DiaryElement dt = em.find(DiaryElement.class, 1);
			 em.remove(dt);
			 em.getTransaction().commit();
		 }
		 
	 public static void main(String[] args) {
	    DiaryElementPersistance app = new DiaryElementPersistance();
	    //app.setUp();
	   // app.checkAvailableEntries;
	  //  app.getEntries();
	  //  app.getNames();
	     //app.close();
	   //app.updateEntry();
	    //app.deleteEntry();
	  }
    }
	

