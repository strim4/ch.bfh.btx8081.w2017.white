package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

/**
 * @author Milena
 * Notification Class
 * Last Edit: 23.11.17
 */


public class Notification {

	private String title;
	private String description;

	public Notification() {
		title = "Der Titel";
		description = "Die Beschreibung";
	}

	public Notification(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void setDescription(String description){
		this.description=description;
	}

}
