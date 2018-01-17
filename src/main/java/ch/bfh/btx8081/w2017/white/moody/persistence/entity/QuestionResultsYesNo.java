package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Answer of the daily Yes/No question Last Edit: 17.01.2018
 * @author Milena
 **/

@SuppressWarnings("serial")
@Entity
public class QuestionResultsYesNo extends QuestionResults implements Serializable, SEntity {

	private boolean answer;

	public QuestionResultsYesNo(int questionId, Date entryDate, boolean answer) {
		super(questionId, entryDate);
		this.answer = answer;
	}

	public QuestionResultsYesNo() {
	}

	public boolean getAnswer() {
		return answer;
	}

	public String toString() {
		return super.toString() + "; answer: " + answer;
	}

}
