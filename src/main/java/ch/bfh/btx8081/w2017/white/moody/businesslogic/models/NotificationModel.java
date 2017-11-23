package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Notification;

/**
 * @author Milena Tardo
 * Model for Notifications
 * Stores different notifications in a List.
 * Last Edit: 23.11.17
 */

public class NotificationModel {
	private List<Notification> notifications;
	
	public String getNotificationTitle(int number){
		return notifications.get(number).getTitle();
	}
	
	public String getNotificationDescription(int number){
		return notifications.get(number).getDescription();
	}
	
	public void setNotification(String title, String description){
		Notification newNotification = new Notification(title, description);
		notifications.add(newNotification);
	}

	
}
