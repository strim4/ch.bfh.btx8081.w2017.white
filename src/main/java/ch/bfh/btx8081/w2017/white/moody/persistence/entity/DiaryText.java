package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

/**
 * @author Moritz
 * expression of a diaryelement with an additional note
 * 
 */

public class DiaryText extends DiaryElement{
	
	private String note;

	public DiaryText(int id, String name,  String note, Date creationDate) {
		super(id, name, creationDate);
		this.note = note;
		
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
   @Override
   public String toString() {
       return "Text Element{" +
   
               " id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", note=" + note + '\'' +
               ", creationDate=" + creationDate +
               '}';
   }
	
	

}
