package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Anotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.TextNotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * 
 * @author Zoran it allows the notifications to be pushed upon the different
 *         time of the day Depending on number of Messages, it can be used a
 *         List instead of Array Last Edit: 13.12.2017
 *
 */
public class NotificationGenerator {

	private ArrayList<String> morning = new ArrayList<String>();
	private ArrayList<String> noon = new ArrayList<String>();
	private ArrayList<String> evening = new ArrayList<String>();
	private ArrayList<String> night = new ArrayList<String>();

	private HashMap<String, ArrayList<String>> messages = new HashMap<String, ArrayList<String>>();

	public NotificationGenerator() {

		morning.add("Just do it , dont waste your time thinking about it");
		morning.add("You are the nicest person in the whole world");
		morning.add("Enjoy the good luck a companion brings you.");

		noon.add(
				"Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.");
		noon.add("What ever you're goal is in life, embrace it visualize it, and for it will be yours.");
		noon.add("You will become great if you believe in yourself.");

		evening.add("Never give up. You're not a failure if you don't give up.");
		evening.add("It is now, and in this world, that we must live.");
		evening.add("Adversity is the parent of virtue.");

		night.add("good night see ya tomorrow");
		night.add("its a good night isnt it");
		night.add("good night my friend sleep tight");

		messages.put("MORNING", morning);
		messages.put("NOON", noon);
		messages.put("EVENING", evening);
		messages.put("NIGHT", night);

	}

	public String getPeriodOfDay(int hour) {

		if (hour > 5 && hour <= 12) {
			return "MORNING";
		} else if (hour > 12 && hour <= 18) {
			return "NOON";
		} else if (hour > 18 && hour <= 22) {
			return "EVENING";
		} else {
			// could be set to continue; if no need for message at night
			return "NIGHT";
		}

	}

	public Anotification getNotif() {

//		DBManager manager = new DBManager();

		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		String periodOfDay = getPeriodOfDay(currentTimeHour);

		Random random = new Random();

		int randomNumber = random.nextInt(3);

		String title = "";

		if (messages.containsKey(periodOfDay)) {
			title = messages.get(periodOfDay).get(randomNumber);
		} else {
			title = "no messages defined";
		}

		TextNotification notification = new TextNotification(title, "It's a good day to have a good day");

	//	manager.persistObject(notification);

		return notification;

	}
}