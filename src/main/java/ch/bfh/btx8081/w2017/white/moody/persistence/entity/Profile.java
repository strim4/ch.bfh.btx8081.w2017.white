package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

/**
 * @author Roberto
 * Profile (including name, contact details)
 * Last edit: 28.11.17
 */

public class Profile {
	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
	private String address;
	private String houseDoctor;
	// private String desease; bin nicht sicher ob das auch gebraucht wird.
	//private String therapy; bin nicht sicher ob das auch gebraucht wird.
	
	public Profile() {
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getHouseDoctor() {
		return houseDoctor;
	}
	/*
	 * public String getDesease() {
	 * return desease;
	 * }
	 */
	
	/*
	 * public String getTherapy() {
	 * return therapy;
	 * }
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setHouseDoctor(String houseDoctor) {
		this.houseDoctor = houseDoctor;
	}
	
	/*
	 * public void setDesease(String desease) {
	 * this.desease = desease;
	 * }
	 */

	/*
	 * public void setTherapy(String therapy) {
	 * this.therapy = therapy;
	 * }
	 */
}