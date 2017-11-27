package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

/**
 * @author Zoran 
 * This Class represents the Subclass of the Notification it
 * offers the possibility for image notification
 *
 * Last Edit: 27.11.2017
 */

public class ImageNotification extends Notification {

	private String imagePath;

	public ImageNotification() {
		super();
		imagePath = "";
	}

	public ImageNotification(String title, String imagePath) {
		super(title);
		this.imagePath = imagePath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
