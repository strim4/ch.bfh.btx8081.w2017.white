package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * Computation of the daily Yes/No question Last Edit: 17.01.2018
 * @author Milena
 **/

public class ComputeResultYesNo {

	private DBManager dbm = DBManager.getInstance();
	private List<QuestionResultsYesNo> resultsYN = dbm.getQuestionResultsYesNo();
	private List<Question> questions = dbm.getQuestion();

	public ComputeResultYesNo() {
	}

	private int computeSingleAnswer(int answerId) {
		QuestionResultsYesNo answer = resultsYN.get(answerId);
		Question question = questions.get(answer.getQuestionId() - 1);
		boolean questionBool;
		if (question.getResult().equals("Yes")) {
			questionBool = true;
		} else {
			questionBool = false;
		}
		int points;
		if (answer.getAnswer() == questionBool) {
			points = 0;
		} else {
			points = 1;
		}
		return points;
	}
	
	private double computeDayResult(Calendar date) {
		double result = 0;
		int pos = searchPos(date);
		if (pos < 0) {
			int points = 0;
			int qNumber = 0;
			while (compareDate(toCalendar(resultsYN.get(pos).getEntryDate()), date)) {
				points = points + computeSingleAnswer(resultsYN.get(pos).getId());
				pos++;
				qNumber++;
			}
			result = points / qNumber;
		}
		return result;
	}
	
	private double computeMonthDouble(Calendar date) {
		int days = computeDaysInMonth(date);
		int pos = searchPosFirstDay(date);
		int actDays=0;
		double points = 0;
		for (int i = 1; i <= days; i++) {
			date.set(Calendar.DAY_OF_MONTH, i);
			if (pos < resultsYN.size()) {
				date.set(Calendar.DAY_OF_MONTH, i);
				QuestionResultsYesNo qr = resultsYN.get(pos);
				Calendar day = qr.getEntryDateCal();
				if (day.get(Calendar.DAY_OF_MONTH) == i) {
					if (day.get(Calendar.MONTH) == date.get(Calendar.MONTH)) {
						points = points + computeDayResult(day);
						pos = pos + 1;
						actDays= actDays+1;
					}
				}
			}
		}
		double month = points / actDays;
		return month;
	}

	public double computeSixMonthsDouble(Calendar date) {
		date.set(Calendar.DAY_OF_MONTH, 1);
		double result = 0;
		int month = date.get(Calendar.MONTH);
		for (int i = 5; i >= 0; i--) {
			result = result + computeMonthDouble(date);
			if (month > 0) {
				month= month-1;
			} else {
				date.set(Calendar.YEAR, date.get(Calendar.YEAR) - 1);
				month=11;
			}
			date.set(Calendar.MONTH, month);
		}
		return result;
	}

	public double computeYearDouble(Calendar date) {
		date.set(Calendar.DAY_OF_MONTH, 1);
		double result = 0;
		int month = date.get(Calendar.MONTH);
		for (int i = 12; i >= 0; i--) {
			result = result + computeMonthDouble(date);
			if (month > 0) {
				month=month-1;
			} else {
				date.set(Calendar.YEAR, date.get(Calendar.YEAR) - 1);
				month=11;
			}
			date.set(Calendar.MONTH, month);
		}
		return result;
	}

	public String computeMonth(Calendar date) {
		double month = computeMonthDouble(date);
		String strain = getStrainStatus(month);
		return strain;
	}

	public String computeSixMonths(Calendar date) {
		double sixMonths = computeSixMonthsDouble(date);
		String strain = getStrainStatus(sixMonths);
		return strain;
	}

	public String computeYear(Calendar date) {
		double year = computeYearDouble(date);
		String strain = getStrainStatus(year);
		return strain;
	}

	// Returns the first Pos in the ArrayList with the matching Date
	// when return value = 0: Date not found
	private int searchPos(Calendar date) {
		Iterator<QuestionResultsYesNo> iter = resultsYN.iterator();
		Calendar currentObjDate;
		int pos = 0;
		int i = 0;
		Date dateD;
		while (iter.hasNext()) {
			dateD = iter.next().getEntryDate();
			currentObjDate = toCalendar(dateD);
			if (compareDate(date, currentObjDate)) {
				pos = i;
				break;
			}
			i = i + 1;
		}

		return pos;
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
		Iterator<QuestionResultsYesNo> iter = resultsYN.iterator();
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

	private boolean compareDate(Calendar one, Calendar two) {
		if (one.get(Calendar.DAY_OF_YEAR) == two.get(Calendar.DAY_OF_YEAR)) {
			if (one.get(Calendar.YEAR) == two.get(Calendar.YEAR)) {
				return true;
			}
		}
		return false;
	}

	private static Calendar toCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	private String getStrainStatus(double strain) {
		String strainTxt;
		if (strain < 1) {
			return strainTxt = "Du bist nicht belastet";
		} else {
			if (strain < 2) {
				return strainTxt = "Du bist leicht belastet";
			} else {
				return strainTxt = "Du bist belastet, bitte kontaktiere eine Vertrauensperson";
			}
		}
	}

}
