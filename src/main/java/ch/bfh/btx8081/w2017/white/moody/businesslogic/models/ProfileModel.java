package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;

/**
 * @author Chantal Zbinden
 * Last Edit: 12.12.17
 * @author Roberto Tangarife 
 * Model for profile Stores the profile including name and contact details. 
 * Last Edit: 29.11.17
 */

public class ProfileModel extends BaseModel {
	
	private Profile profile;
	
	public ProfileModel() {
		
		profile = new Profile();
		
	}
	
	public Profile getProfile() {
		return profile;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}