package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;

/**
 * @author Moritz
 * expression of a diaryelement with an additional note
 * 
 */
@Entity
@DiscriminatorValue(value = "TE")

public class DiaryText extends DiaryElement implements Serializable{
	
	private String note;
private 	DiaryTextView view;

	public DiaryText(int id, String name,  String note, Date creationDate) {
		super(id, name, creationDate);
		this.note = view.getTFvalue();
		
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
