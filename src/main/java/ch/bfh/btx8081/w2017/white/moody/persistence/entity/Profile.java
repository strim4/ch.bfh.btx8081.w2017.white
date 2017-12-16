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
 * Profile (including name, contact details and emergency contact)
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
	private String houseDoctor;
	private String houseDoctorPhone;
	private String emergencyContact;
	private String emergencyContactPhone;
	
	public Profile(String firstName, String lastName, String houseDoctor, String houseDoctorPhone,
			String emergencyContact, String emergencyContactPhone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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

	@Override
	public String toString() {
		return "Profile{" +
				"firstName='" + getFirstName() + '\'' +
				", lastName='" + getLastName() + '\'' +
				", houseDoctor='" + getHouseDoctor() + '\'' +
				", houseDoctorPhone='" + getHouseDoctorPhone() + '\'' +
				", emergencyContact='" + getEmergencyContact() + '\'' +
				", emergencyContactPhone='" + getEmergencyContactPhone() + 
				'}';
	}
}
