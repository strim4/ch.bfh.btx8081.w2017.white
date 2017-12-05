package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Anotification;

/**
 * @author Milena Tardo
 * @author Zoran
 * Model for Notifications
 * Stores different notifications in a List.
 * Last Edit: 27.11.17
 */

public class NotificationModel extends BaseModel{
	
	private List<Anotification> notifications;
	
	public NotificationModel() {
		super();
	}
	
	public String getNotificationTitle(int number){
		return notifications.get(number).getTitle();
	}
	/*
	public String getNotificationDescription(int number){
		return notifications.get(number).getDescription();
	}
	*/
	
	// finds particular notification inside of the list by its id
	public Anotification findById(int id)
	{
		for(Anotification notification: notifications)
		{
			if(notification.getId() == id)
			{
				return notification;
			}
		}
		
		return null;
	}
	
	public void setNotification(Anotification notification){
		notifications.add(notification);
	}
}
