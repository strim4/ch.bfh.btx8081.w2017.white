package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.Calendar;
import java.util.Random;
/**
 * 
 * @author Zoran
 * it allows the notifications to be pushed upon the different
 * time of the day
 *
 */
public class NotificationGenerator {
	private String[] pushMorning = new String[3];
	private String[] pushNoon = new String[3];
	private String[] pushEvening = new String[3];

	public NotificationGenerator() {
		pushMorning[0] = "Just do it , dont waste your time thinking about it";
		pushMorning[1] = "You are the nicest person in the whole world";
		pushMorning[2] = "Enjoy the good luck a companion brings you.";
		pushNoon[0] = "Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.";
		pushNoon[1] = "What ever you're goal is in life, embrace it visualize it, and for it will be yours.";
		pushNoon[2] = "You will become great if you believe in yourself.";
		pushEvening[0] = "Never give up. You're not a failure if you don't give up.";
		pushEvening[1] = "It is now, and in this world, that we must live.";
		pushEvening[2] = "Adversity is the parent of virtue.";

	}

	public String getNotif() {
		Random random = new Random();

		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		if (currentTimeHour > 5 && currentTimeHour <= 12) {
			return pushMorning[random.nextInt(3)];
		} else if (currentTimeHour > 12 && currentTimeHour <= 18) {
			return pushNoon[random.nextInt(3)];
		} else if (currentTimeHour > 18 && currentTimeHour <= 22) {
			return pushEvening[random.nextInt(3)];
		} else {
			return "good Night, see ya tomorrow";
		}

	}
}