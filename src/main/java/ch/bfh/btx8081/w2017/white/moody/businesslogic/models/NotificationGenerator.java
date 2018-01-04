package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Anotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.TextNotification;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.PushMessages;

/**
 * 
 * @author Zoran it allows the notifications to be pushed upon the different
 *         time of the day
 *         The Randomisation depends on number of the Messages in the ArrayList of the chosen key
 *         inside of the hashMap
 *         Last Edit: 19.12.2017
 *
 */
public class NotificationGenerator {

	// with full persistence (where Messages as entity are presaved in DB) no
	// ArrayList or
	// Hashmap is needed, messages would be directly called from DB by its type(Time
	// of Day) and Title

	private ArrayList<String> morning = new ArrayList<String>();
	private ArrayList<String> noon = new ArrayList<String>();
	private ArrayList<String> evening = new ArrayList<String>();
	private ArrayList<String> night = new ArrayList<String>();
	private DBManager dbm = DBManager.getInstance();

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
		} else if (hour > 18 && hour < 22) {
			return "EVENING";
		} else {
			// could be set to continue; if no need for message at night
			return "NIGHT";
		}

	}

	public Anotification getNotif() {

		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		String periodOfDay = getPeriodOfDay(currentTimeHour);

		Random random = new Random();

		List<PushMessages> pushMessages = dbm.getPushMessages(periodOfDay);

		// it ensures that the random number is not out of bounds of the chosen list
		int randomNumber = random.nextInt(messages.get(periodOfDay).size());

		// int randomNumber = (pushMessages.size()== 0) ? 0:
		// random.nextInt(pushMessages.size());

		String title = "";

		if (messages.containsKey(periodOfDay)) {
			title = messages.get(periodOfDay).get(randomNumber);
		} else {
			title = "no messages defined";
		}

		TextNotification notification = new TextNotification(title, "It's a good day to have a good day");

		dbm.persistObject(notification);

		return notification;

	}
}