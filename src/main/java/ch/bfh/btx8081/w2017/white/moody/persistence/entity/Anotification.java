package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 * @author Milena
 * @author Zoran 
 * Notification Class Last Edit: 14.12.17
 * 
 * it represents the Superclass for all Notifications
 */

// the name fo the Class cannot be Notification (same as Notification Class of
// vaadin)

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Anotification {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	protected String title;
	protected String type;
	protected Date date;
	// it allows to check if notification has been sent
	protected boolean isSent;
	protected String description;

	public Anotification() {
		this.id = -1;
		this.title = "Der Titel";
		this.date = new Date();
		this.isSent = false;
		this.description = "Die Beschreibung";
	}

	public Anotification(String title, String description) {
		this.title = title;
		this.date = new Date();
		this.id = -1;
		this.isSent = false;
		this.description = description;
	}

	public Anotification(int id, String title, String type) {
		this.id = id;
		this.title= title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public Date getDate() {
		return date;
	}

	public int getId() {
		return id;
	}

	public boolean getIsSent() {
		return isSent;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSent(boolean isSent) {
		this.isSent = isSent;
	}

	public void setIsSent(boolean isSent) {
		this.isSent = isSent;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
