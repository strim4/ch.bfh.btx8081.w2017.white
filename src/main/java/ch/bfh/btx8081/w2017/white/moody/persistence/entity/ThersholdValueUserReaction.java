package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * This class is the persistence of the ThersholdValueUserReaction.
 * All reactions of the User have to be registered in the table ThersholdValueUserReaction
 * 
 * @author Sandra Last Edit: 18.01.2018
 */

@Entity
@Table
public class ThersholdValueUserReaction implements Serializable, SEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reactionID;
	private int profilID;
	private String reaction;
	private String date;

	public ThersholdValueUserReaction(int profilID, String date, String reaction) {
		this.profilID = profilID;
		this.date = date;
		this.reaction = reaction;
	}

	public ThersholdValueUserReaction() {
	}

	/**
	 * 
	 * Method creates a new entry and stores it to the DB
	 * 
	 */	
	public void createSur(int profilID, String date, String reaction) {

		ThersholdValueUserReaction sur = new ThersholdValueUserReaction(profilID, date, reaction);
		DBManager dbm = DBManager.getInstance();
		dbm.persistObject(sur);
	}

	public int getProfilID() {
		return profilID;
	}

	public int getReactionID() {
		return reactionID;
	}

	public String getDate() {
		return date;
	}

	public String getReaction() {
		return reaction;
	}

	public void setProfilID(int profilID) {
		this.profilID = profilID;
	}

	public void setRectionID(int reactionID) {
		this.reactionID = reactionID;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ThersholdValueUserReaction{" + "reaetionID=" + getReactionID() + ",  profilID=" + getProfilID()
				+ ", date=" + getDate() + ", reaction='" + getReaction() + '\'' + '}';
	}
}