package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Moritz
 * expression of a diaryelement with an additional note
 * 
 */
@Entity
@DiscriminatorValue(value = "TE")

public class DiaryText extends DiaryElement{
	
	private String note;

	public DiaryText(int id, String name,  String note, Date creationDate) {
		super(id, name, creationDate);
		this.note = note;
		
	}
	
	public DiaryText() {}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
   @Override
   public String toString() {
       return "Text Element{" +
   
               " id='" + getId() + '\'' +
               ", name='" + getName() + '\'' +
               ", note=" + getNote() + '\'' +
               ", creationDate=" + getCreationDate() +
               '}';
   }
	
	

}
