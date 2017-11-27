package ch.bfh.btx8081.w2017.white.moody.persistence.entity;
/**
 * @author Zoran 
 * This Class represents the Subclass of the Notification it
 * offers the possibility for Text notification
 *
 * Last Edit: 27.11.2017
 */

public class TextNotification extends Notification {

	private String description;

	public TextNotification() {
		super();
		description = "Description of the Notification";
	}

	public TextNotification(String title, String description) {
		super(title);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
