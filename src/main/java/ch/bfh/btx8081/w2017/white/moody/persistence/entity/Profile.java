package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
<<<<<<< .mine
 * @author Chantal
 * Last edit: 12.12.17
 * @author Roberto
 * Profile (including name, contact details)
 * Last edit: 29.11.17
=======
 * @author Roberto Profile (including name, contact details) Last edit: 28.11.17
>>>>>>> .r128
 */
@SuppressWarnings("serial")
@Entity
@Table
public class Profile implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String birthdate;
	private String gender;
	// private String address; bin nicht sicher ob das auch gebraucht wird.
	private String houseDoctor;
	private String houseDoctorPhone;
	private String emergencyContact;
	private String emergencyContactPhone;
	// private String desease; bin nicht sicher ob das auch gebraucht wird.
	// private String therapy; bin nicht sicher ob das auch gebraucht wird.

	public Profile(String firstName, String lastName, String birthdate, 
			String gender, String houseDoctor, String houseDoctorPhone,
			String emergencyContact, String emergencyContactPhone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.houseDoctor = houseDoctor;
		this.houseDoctorPhone = houseDoctorPhone;
		this.emergencyContact = emergencyContact;
		this.emergencyContactPhone = emergencyContactPhone;
		
	}
	
	public Profile() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public String getGender() {
		return gender;
	}

	/*
	 * public String getAddress() { return address; }
	 */

	public String getHouseDoctor() {
		return houseDoctor;
	}
	
	public String getHouseDoctorPhone() {
		return houseDoctorPhone;
	}
	
	public String getEmergencyContact() {
		return emergencyContact;
	}
	
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}
	/*
	 * public String getDesease() { return desease; }
	 */

	/*
	 * public String getTherapy() { return therapy; }
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * public void setAddress(String address) { this.address = address; }
	 */

	public void setHouseDoctor(String houseDoctor) {
		this.houseDoctor = houseDoctor;
	}
	
	public void setHouseDoctorPhone(String houseDoctorPhone) {
		this.houseDoctorPhone = houseDoctorPhone;
	}
	
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	/*
	 * public void setDesease(String desease) { this.desease = desease; }
	 */

	/*
	 * public void setTherapy(String therapy) { this.therapy = therapy; }
	 */
	
	@Override
	public String toString() {
		return "Profile{" +
				"firstName='" + getFirstName() + '\'' +
				", lastName='" + getLastName() + '\'' +
				", birthdate='" + getBirthdate() + '\'' +
				", gender='" + getGender() + '\'' +
				", houseDoctor='" + getHouseDoctor() + '\'' +
				", houseDoctorPhone='" + getHouseDoctorPhone() + '\'' +
				", emergencyContact='" + getEmergencyContact() + '\'' +
				", emergencyContactPhone='" + getEmergencyContactPhone() + 
				'}';
	}
}
