package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * Computation of the daily Emoji question Last Edit: 17.01.2018
 * @author Milena
 **/

public class ComputeResultEmoji {

	private DBManager dbm = DBManager.getInstance();
	private List<QuestionResultsEmoji> resultsE = dbm.getQuestionResultsEmoji();

	public ComputeResultEmoji() {
	}

	public int[] computeMonth(Calendar date) {
		int days = computeDaysInMonth(date);
		int pos = searchPosFirstDay(date);
		int[] month = new int[days];
		for (int i = 1; i <= days; i++) {
			date.set(Calendar.DAY_OF_MONTH, i);
			if (pos < resultsE.size()) {
				QuestionResultsEmoji qr = resultsE.get(pos);
				Calendar day = qr.getEntryDateCal();
				if (day.get(Calendar.DAY_OF_MONTH) == i) {
					if (day.get(Calendar.MONTH) == date.get(Calendar.MONTH)) {
						month[i - 1] = qr.getAnswer();
						pos = pos + 1;
					} else {
						month[i - 1] = 0;
					}
				} else {
					month[i - 1] = 0;
				}
			}
		}
		return month;
	}

	private int computeMonthAverage(Calendar date) {
		int[] month = computeMonth(date);
		int actData = 0;
		int points = 0;
		for (int i = 0; i < month.length; i++) {
			points = points + month[i];
			actData=actData+1;
		}
		int result = points/ actData;
		return result;
	}

	public int[] computeSixMonths(Calendar date) {
		date.set(Calendar.DAY_OF_MONTH, 1);
		int[] sixMonths = new int[6];
		int month = date.get(Calendar.MONTH);
		for (int i = 5; i >= 0; i--) {
			sixMonths[i] = computeMonthAverage(date);
			if (month > 0) {
				month= month-1;
			} else {
				date.set(Calendar.YEAR, date.get(Calendar.YEAR) - 1);
				month= 11;
			}
			date.set(Calendar.MONTH, month);
		}
		return sixMonths;
	}

	public int[] computeYear(Calendar date) {
		int[] year = new int[12];
		int month = date.get(Calendar.MONTH);
		for (int i = 11; i >= 0; i--) {
			year[i] = computeMonthAverage(date);
			if (month > 0) {
				month= month-1;
			} else {
				date.set(Calendar.YEAR, date.get(Calendar.YEAR) - 1);
				month= 11;
			}
			date.set(Calendar.MONTH, month);
		}
		return year;
	}

	public int computeDaysInMonth(Calendar date) {
		switch (date.get(Calendar.MONTH)) {
		case 0:
			return 31;
		case 1:
			GregorianCalendar gCal = new GregorianCalendar();
			if (gCal.isLeapYear(date.getMaximum(Calendar.YEAR))) {
				return 28;
			} else {
				return 29;
			}
		case 2:
			return 31;
		case 3:
			return 30;
		case 4:
			return 31;
		case 5:
			return 30;
		case 6:
			return 31;
		case 7:
			return 31;
		case 8:
			return 30;
		case 9:
			return 31;
		case 10:
			return 30;
		case 11:
			return 31;
		default:
			return 0;
		}
	}

	// Returns the first position in the ArrayList with the matching date
	// when return value = 0: Date not found
	private int searchPosFirstDay(Calendar date) {
		Iterator<QuestionResultsEmoji> iter = resultsE.iterator();
		Calendar currentObjDate;
		int pos = 0;
		int i = 0;
		while (iter.hasNext()) {
			currentObjDate = iter.next().getEntryDateCal();
			if (currentObjDate.get(Calendar.MONTH) == date.get(Calendar.MONTH)) {
				if (currentObjDate.get(Calendar.YEAR) == date.get(Calendar.YEAR)) {
					pos = i;
					break;
				}
			}
			i = i + 1;
		}
		return pos;
	}

}
