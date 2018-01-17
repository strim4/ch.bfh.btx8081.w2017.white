package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is the persistence of the WarningNotification screen on this screen the user
 * recive a warningnotification if his answers werent negativ during 7 days.
 * 
 * @author Sandra
 * Last Edit: 18.01.2018
 */

//@SuppressWarnings("serial")
@Entity
@Table
public class WarningNotification implements Serializable {

	private static final long serialVersionUID = -8728026591860370205L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int userId;
	private String datum;
	private boolean gelesen;
	private boolean telArzt;
	private boolean smsArzt;
	private boolean telBezugsperson;
	private boolean smsBezugsperson;

	public WarningNotification(int userId, String datum, boolean gelesen, boolean telArzt, boolean smsArzt,
			boolean telBezugsperson, boolean smsBezugsperson) {
	}

	public WarningNotification() {
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getDatum() {
		return datum;
	}

	public void setGelesen(boolean gelesen) {
		this.gelesen = gelesen;
	}

	public boolean getGelesen() {
		return gelesen;
	}

	public void setTelArzt(boolean telArzt) {
		this.telArzt = telArzt;
	}

	public boolean getTelArzt() {
		return telArzt;
	}

	public void setSmsArzt(boolean smsArzt) {
		this.smsArzt = smsArzt;
	}

	public boolean getSmsArzt() {
		return smsArzt;
	}

	public void setTelBezugsperson(boolean telBezugsperson) {
		this.telBezugsperson = telBezugsperson;
	}

	public boolean getTelBezugsperson() {
		return telBezugsperson;
	}

	public void setSmsBezugsperson(boolean smsBezugsperson) {
		this.smsBezugsperson = smsBezugsperson;
	}

	public boolean getSmsBezugsperson() {
		return smsBezugsperson;
	}
}