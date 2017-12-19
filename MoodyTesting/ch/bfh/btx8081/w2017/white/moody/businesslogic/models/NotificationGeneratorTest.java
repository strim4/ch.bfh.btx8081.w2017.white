package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class NotificationGeneratorTest {

	NotificationGenerator ng = new NotificationGenerator();
	
	@Test
	public void testGetPeriodOfDay() {
		
		//for the testing time of day, expected Input is: MORNING or NOON or EVENING or NIGHT

		assertEquals("MORNING", ng.getPeriodOfDay(9));
		assertEquals("NOON", ng.getPeriodOfDay(13));
		assertEquals("EVENING", ng.getPeriodOfDay(19));
		assertEquals("NIGHT", ng.getPeriodOfDay(23));
		
		
	}

	@Test
	public void testGetNotif() {
		//Code for testing
	}

}
