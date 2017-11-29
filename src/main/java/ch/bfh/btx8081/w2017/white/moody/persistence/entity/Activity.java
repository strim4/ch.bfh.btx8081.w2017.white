package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Moritz
 * expression of a diaryelement with an additional description of the activity
 * 
 */
@Entity
@DiscriminatorValue(value = "AE")
public class Activity extends DiaryElement {
	
	private String description;

	public Activity(int id, String name,  String description, Date creationDate) {
		super(id, name,  creationDate);
		this.description = description;
	}
	
	public Activity() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	 @Override
	   public String toString() {
	       return "Activity{" +
	   
	               " id='" + getId() + '\'' +
	               ", name='" + getName() + '\'' +
	               ", description=" + getDescription() + '\'' +
	               ", creationDate=" + getCreationDate() +
	               '}';
	   }


}
