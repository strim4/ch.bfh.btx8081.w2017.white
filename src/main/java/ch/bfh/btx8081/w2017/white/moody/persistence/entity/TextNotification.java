package ch.bfh.btx8081.w2017.white.moody.persistence.entity;
/**
 * @author Zoran 
 * This Class represents the Subclass of the Notification it
 * offers the possibility for Text notification
 *
 * Last Edit: 28.11.2017
 */

public class TextNotification extends Notification {

	

	public TextNotification() {
		super();
		
	}

	public TextNotification(String title, String description) {
		super(title, description);
		
	}
//	schon vorhanden bei der Superclasse
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
}
