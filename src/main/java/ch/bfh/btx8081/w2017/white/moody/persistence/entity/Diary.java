package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;


/**
 * @author Moritz
 * Diarylogic. Creates / deletes  diaryelements  and lists already stored elements
 * 
 */

public class Diary {
	

	
	
	public List<DiaryElement> diaryelements = new ArrayList<DiaryElement> ();

	
	
	/*public void createTextElement(int id, String name, String note, Date creationDate) {
		DiaryElement e = new DiaryText(id, name, note, creationDate);
		diaryelements.add(e);	
	}; */
	
	 public void addTextElement(DiaryText element) {
       this.diaryelements.add(element);
   }
	
	/*public void createPicElement(int id, String name, String description, BufferedImage image, Date creationDate) throws IOException {
		DiaryElement e = new DiaryPic(id, name, description, image,  creationDate);
		diaryelements.add(e);	
	}; */
	 
	 public void addPicElement(DiaryPic element) {
       this.diaryelements.add(element);
   }
	
	/*public void createActivityElement(int id, String name,  String date, String description, Date creationDate) {
		DiaryElement e = new DiaryText(id, name, description,  creationDate);
		diaryelements.add(e);	
	}; */
	 public void addActivity(Activity element) {
       this.diaryelements.add(element);
   }
	
	public List<DiaryElement> getElements() {
		return diaryelements;
	};
	
	
}
