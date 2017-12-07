package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.Calendar;
import java.util.Random;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Anotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.TextNotification;

/**
 * 
 * @author Zoran 
 * it allows the notifications to be pushed upon the different time of the day
 * Depending on number of Messages, it can be used a List instead of Array
 * Last Edit: 05.12.2017     
 *
 */
public class NotificationGenerator {
	private String[] Morning = new String[3];
	private String[] Noon = new String[3];
	private String[] Evening = new String[3];

	public NotificationGenerator() {
		Morning[0] = "Just do it , dont waste your time thinking about it";
		Morning[1] = "You are the nicest person in the whole world";
		Morning[2] = "Enjoy the good luck a companion brings you.";
		Noon[0] = "Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.";
		Noon[1] = "What ever you're goal is in life, embrace it visualize it, and for it will be yours.";
		Noon[2] = "You will become great if you believe in yourself.";
		Evening[0] = "Never give up. You're not a failure if you don't give up.";
		Evening[1] = "It is now, and in this world, that we must live.";
		Evening[2] = "Adversity is the parent of virtue.";

	}

	public Anotification getNotif() {

		Random random = new Random();
		String title;

		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		if (currentTimeHour > 5 && currentTimeHour <= 12) {
			title = Morning[random.nextInt(3)];
		} else if (currentTimeHour > 12 && currentTimeHour <= 18) {
			title = Noon[random.nextInt(3)];
		} else if (currentTimeHour > 18 && currentTimeHour <= 22) {
			title = Evening[random.nextInt(3)];
		} else {
			// could be set to continue; if no need for message at night
			title = "good Night, see ya tomorrow";
		}

		return new TextNotification(title, "It's a good day to have a good day");

	}
}