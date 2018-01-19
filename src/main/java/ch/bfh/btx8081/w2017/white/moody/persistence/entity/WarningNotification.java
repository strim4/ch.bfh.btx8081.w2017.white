package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is the persistence of the WarningNotification screen on this
 * screen the user receive a WarningNotification if his answers were negative
 * during 7 days.
 * 
 * @author Sandra Last Edit: 18.01.2018
 */

@Entity
@Table
public class WarningNotification implements Serializable {
	//
	private static final long serialVersionUID = -8728026591860370205L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int userId;
	private String date;
	private boolean read;
	private boolean telDoctor;
	private boolean smsDoctor;
	private boolean telContactperson;
	private boolean smsContactperson;

	public WarningNotification(int userId, String date, boolean read, boolean telDoctor, boolean smsDoctor,
			boolean telContactperson, boolean smsContactperson) {
	}

	public WarningNotification() {
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean getRead() {
		return read;
	}

	public void setTelDoctor(boolean telDoctor) {
		this.telDoctor = telDoctor;
	}

	public boolean getTelDoctor() {
		return telDoctor;
	}

	public void setSmsDoctor(boolean smsDoctor) {
		this.smsDoctor = smsDoctor;
	}

	public boolean getSmsDoctor() {
		return smsDoctor;
	}

	public void setTelContactperson(boolean telContactperson) {
		this.telContactperson = telContactperson;
	}

	public boolean getTelContactperson() {
		return telContactperson;
	}

	public void setSmsContactperson(boolean smsContactperson) {
		this.smsContactperson = smsContactperson;
	}

	public boolean getSmsContactperson() {
		return smsContactperson;
	}
}