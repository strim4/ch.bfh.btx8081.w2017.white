package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * This class is the persistence of the Warningnotifications. All reactions from the User have
 * to be registred in the table SchwellenwertUserReaktion
 * 
 * @author Sandra
 * Last Edit: 18.01.2018
 */

@Entity
@Table
public class SchwellenwertUserReaktion implements Serializable, SEntity {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int reaktionsID;
		private int profilID;
		private String reaktion;
		private String datum;

		public SchwellenwertUserReaktion(int profilID, String datum, String reaktion) {
			this.profilID = profilID;
			this.datum = datum;
			this.reaktion = reaktion;
		}

		public SchwellenwertUserReaktion() {
		}

		public void createSur(int profilID, String datum, String reaktion) {

			SchwellenwertUserReaktion sur = new SchwellenwertUserReaktion(profilID, datum, reaktion);
			DBManager dbm = DBManager.getInstance();
			dbm.persistObject(sur);
		}

		public int getProfilID() {
			return profilID;
		}

		public int getReaktionsID() {
			return reaktionsID;
		}

		public String getDatum() {
			return datum;
		}

		public String getReaktion() {
			return reaktion;
		}

		public void setProfilID(int profilID) {
			this.profilID = profilID;
		}

		public void setReaktionsID(int reaktionsID) {
			this.reaktionsID = reaktionsID;
		}

		public void setReaktion(String reaktion) {
			this.reaktion = reaktion;
		}

		public void setDatum(String datum) {
			this.datum = datum;
		}

		@Override
		public String toString() {
			return "SchwellenwertUserReaktion{" + "reaktionsID=" + getReaktionsID() + ",  profilID=" + getProfilID() + ", datum=" + getDatum() + ", reaktion='" + getReaktion() + '\'' + '}';
		}
	}