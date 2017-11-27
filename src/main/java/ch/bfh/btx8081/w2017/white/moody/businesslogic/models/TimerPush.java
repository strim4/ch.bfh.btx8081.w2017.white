package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.Calendar;

/**
 * @author Stajz1 
 * Timer for push Notifications
 * Last modified 27.11.2017
 * 
 * it allows the notifications to be pushed uppon the different
 * time of the day
 * 
 */

public class TimerPush {

	public TimerPush() {
		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

		if (currentTimeHour > 5 && currentTimeHour <= 12) {
			// place for code at morning time
		} else if (currentTimeHour > 12 && currentTimeHour <= 18) {
			// place for code at noon and afternoon time
		} else if (currentTimeHour > 18 && currentTimeHour <= 22) {
			// place for code at evening
		} else {
			// place for code at night
		}
	}

}
