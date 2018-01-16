package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.WarningNotification;

/**
 * 
 * @author Sandra Last edit: 28.12.17
 */
public class WarningNotificationModel extends BaseModel {

	private WarningNotification warningNotification;

	public WarningNotificationModel() {
		warningNotification = new WarningNotification();
	}

	public WarningNotification getWarningNotification() {
		return warningNotification;
	}

	public void setWarningNotification(WarningNotification warningNotification) {
		this.warningNotification = warningNotification;
	}
}