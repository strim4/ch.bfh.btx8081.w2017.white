package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * @author Moritz
 * expression of a diaryelement with an additional description of the activity
 * 
 */
@Entity

public class Activity extends DiaryElement implements Serializable, SEntity {
	
	private String description;

	public Activity(String name,  String description, String entrydate , Date creationDate) {
		super(name,  creationDate, entrydate);
		this.description = description;
	}
	
	public Activity() {}
	
	
	
	public void creatAc(String name,  String description, String entrydate , Date creationDate) {

		Activity ac = new Activity(name, description, entrydate, new Date());
		DBManager dbm = DBManager.getInstance();
		dbm.persistObject(ac);

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
	   
	               " id='" + getId() + '\'' +
	               ", name='" + getName() + '\'' +
	               ", description=" + getDescription() + '\'' +
	               ", creationDate=" + getCreationDate() +
	               '}';
	   }


}
