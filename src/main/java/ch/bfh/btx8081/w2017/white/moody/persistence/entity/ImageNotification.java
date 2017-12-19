package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import javax.persistence.*;

/**
 * @author Zoran This Class represents the Subclass of the Notification it
 *         offers the possibility for image notification
 *
 *         Last Edit: 19.12.2017
 */
@Entity
@Table
public class ImageNotification extends Anotification {


	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;

	private String imagePath;

	public ImageNotification() {
		super();
		imagePath = "";
	}

	public ImageNotification(String title, String description, String imagePath) {
		super(title, description);
		this.imagePath = imagePath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
