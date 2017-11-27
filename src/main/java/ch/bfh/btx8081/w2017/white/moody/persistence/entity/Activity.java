package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

/**
 * @author Moritz
 * expression of a diaryelement with an additional description of the activity
 * 
 */

public class Activity extends DiaryElement {
	
	private String description;

	public Activity(int id, String name,  String description, Date creationDate) {
		super(id, name,  creationDate);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	 @Override
	   public String toString() {
	       return "Activity{" +
	   
	               " id='" + id + '\'' +
	               ", name='" + name + '\'' +
	               ", description=" + description + '\'' +
	               ", creationDate=" + creationDate +
	               '}';
	   }


}
