package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Date;

/**
 * @author Roberto Profile (including name, contact details) Last edit: 28.11.17
 */

public class Profile {
	private int id;
	private String firstName;
	private String lastName;
	private Date birthdate;
	private char gender;
	private String address;
	private String houseDoctor;
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

	public String getAddress() {
		return address;
	}

	public String getHouseDoctor() {
		return houseDoctor;
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

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHouseDoctor(String houseDoctor) {
		this.houseDoctor = houseDoctor;
	}

	/*
	 * public void setDesease(String desease) { this.desease = desease; }
	 */

	/*
	 * public void setTherapy(String therapy) { this.therapy = therapy; }
	 */
}
