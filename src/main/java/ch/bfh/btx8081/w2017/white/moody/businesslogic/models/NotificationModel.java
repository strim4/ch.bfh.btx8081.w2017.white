package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Notification;

/**
 * @author Milena Tardo
 * @author Zoran
 * Model for Notifications
 * Stores different notifications in a List.
 * Last Edit: 27.11.17
 */

public class NotificationModel {
	
	private List<Notification> notifications;
	
	public String getNotificationTitle(int number){
		return notifications.get(number).getTitle();
	}
	/*
	public String getNotificationDescription(int number){
		return notifications.get(number).getDescription();
	}
	*/
	
	public Notification findById(int id)
	{
		for(Notification notification: notifications)
		{
			if(notification.getId() == id)
			{
				return notification;
			}
		}
		
		return null;
	}
	
	public void setNotification(Notification notification){
		notifications.add(notification);
	}
}
