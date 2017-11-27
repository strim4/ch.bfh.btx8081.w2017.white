package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

/**
 * @author Milena
 * @author Zoran 
 * Notification Class 
 * Last Edit: 27.11.17
 * 
 * it represents the Superclass for all Notifications
 */

public abstract class Notification {

	protected int id;
	protected String title;
	protected Date date;
	// it allows to check if notification has been sent
	protected boolean isSent;

	// private String description;

	public Notification() {
		id = -1;
		title = "Der Titel";
		date = new Date();
		isSent = false;
		// description = "Die Beschreibung";
	}

	public Notification(String title) {
		this.title = title;
		this.date = new Date();
		this.id = -1;
		this.isSent = false;
		// this.description = description;
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

	/*
	 * public String getDescription(){ return description; }
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIsSent(boolean isSent) {
		this.isSent = isSent;
	}

	/*
	 * public void setDescription(String description){ this.description=description;
	 * }
	 */

}
