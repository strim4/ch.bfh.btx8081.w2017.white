package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

/**
<<<<<<< .mine
 * @author Roberto
 * Profile (including name, contact details)
 * Last edit: 29.11.17
=======
 * @author Roberto Profile (including name, contact details) Last edit: 28.11.17
>>>>>>> .r128
 */

public class Profile {
	private int id;
	private String firstName;
	private String lastName;
	private Date birthdate;
	private char gender;
	// private String address; bin nicht sicher ob das auch gebraucht wird.
	private String houseDoctor;
	private String houseDoctorPhone;
	private String emergencyContact;
	private String emergencyContactPhone;
	// private String desease; bin nicht sicher ob das auch gebraucht wird.
	// private String therapy; bin nicht sicher ob das auch gebraucht wird.

	public Profile() {
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public char getGender() {
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

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void setGender(char gender) {
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
}
