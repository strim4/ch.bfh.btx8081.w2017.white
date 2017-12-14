package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class NotificationGeneratorTest {

	NotificationGenerator ng = new NotificationGenerator();
	
	@Test
	public void testGetPeriodOfDay() {
		
		int currentTimeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		assertEquals("NIGHT", ng.getPeriodOfDay(currentTimeHour));
		
		
	}

	@Test
	public void testGetNotif() {
		//Code for testing
	}

}
