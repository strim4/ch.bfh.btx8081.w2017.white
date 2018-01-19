package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Zoran 
 * This Class represents the Subclass of the Notification it
 * offers the possibility for Text notifications
 * Last Edit: 14.12.2017
 */
@Entity
@Table
public class TextNotification extends Anotification implements SEntity{
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	private String type;

	

	public TextNotification() {
		super();
		
	}

	public TextNotification(String title, String description) {
		super(title, description);
		
	}
	public TextNotification(int id, String title, String type) {
		super(id,title,type);
		
		
	}

}
