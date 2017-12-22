package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;

public class ActivityModel extends BaseModel {
	
	private Activity activity;
	
	public ActivityModel() {
		activity = new Activity();
	}
	
	public Activity getActivity() {
		return activity;
	}
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}
