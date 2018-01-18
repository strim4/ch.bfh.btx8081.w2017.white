package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Anotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.TextNotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * 
 * @author Zoran This Class allows the notifications to be pushed upon the
 *         different time of the day. The Randomisation depends of number of the
 *         Messages in the PushMessages List. The previous code had the messages
 *         generated inside of the code lines. With the DB integration the
 *         messages are now presaved in DB and when needed they are called in
 *         form of the particular List and used in code. Last Edit: 18.01.2018
 * 
 *
 */
public class NotificationGenerator {

	public NotificationGenerator() {

	}

	// The Method that returns the Description of the Time of the day in form of a
	// String
	public String getPeriodOfDay(int hour) {

		if (hour > 5 && hour <= 12) {
			return "MORNING";
		} else if (hour > 12 && hour <= 18) {
			return "NOON";
		} else if (hour > 18 && hour < 22) {
			return "EVENING";
		} else {
			// could be set to continue; if no need for message at night
			return "NIGHT";
		}

	}

	/*
	 * this Method returns the particular Notification picked randomly out of the
	 * List that's been created out of the messages in DB selected by the time of
	 * the day
	 */
	public Anotification getNotif() {

		// Interpretation of the time of the day in hour form (int)
		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		String periodOfDay = getPeriodOfDay(currentTimeHour);

		Random random = new Random();

		/*
		 * the Push messages are presaved in DB. It gets the List of push messages out
		 * of DB for the current period of day
		 */
		List<PushMessages> pushMessages = DBManager.getInstance().getPushMessages(periodOfDay);

		/*
		 * it randomize the integer, that has the same numeric value as the size of the list
		 * of push messages
		 */
		int randomNumber = (pushMessages.size() == 0) ? 0 : random.nextInt(pushMessages.size());

		// it gets the random message out of the list for the current time of day
		String title = pushMessages.get(randomNumber).getMessage();

		TextNotification notification = new TextNotification(title, "");

		return notification;

	}
}