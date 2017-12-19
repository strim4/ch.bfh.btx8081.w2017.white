package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 
 * @author Zoran
 * 
 * This Class allows persistence of the push messages inside of the DB
 * Last Edit: 19.12.2017
 *
 */


@Entity
@Table
public class PushMessages {
	private String message;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String type;

	public PushMessages(String message, int id, String type) {
		super();
		this.message = message;
		this.id = id;
		this.type = type;
	}

	public PushMessages() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
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

}
