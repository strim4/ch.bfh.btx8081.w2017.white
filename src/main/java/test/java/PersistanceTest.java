package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;


import org.junit.jupiter.api.Test;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * Created by Moritz on 21.12.2017.
 */
class PersistanceTest {
	
	
	@Test
   public void persistDiaryTextElement() throws Exception {
		DBManager dbm = new DBManager();	
		
		DiaryText dte = new DiaryText();
		
		dte.setName("TestEntry");
		dte.setEntryDate("21.12.2017");
		dte.setCreationDate(new Date());
		dte.setNote("Ich bin ein Testeintrag");
		
		dbm.persistObject(dte);
		
		System.out.println(dbm.showd());
	

       
   }
}



