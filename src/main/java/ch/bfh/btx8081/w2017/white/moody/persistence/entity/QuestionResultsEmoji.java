package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Answer of the daily emoji question Last Edit: 17.01.2018
 *@author Milena 
 */

@SuppressWarnings("serial")
@Entity
public class QuestionResultsEmoji extends QuestionResults implements Serializable, SEntity {
	private static int questionId = 0;
	private int answer; // Very sad=1; Sad=2; Neutral=3; Happy=4;Very happy=5

	public QuestionResultsEmoji(Date entryDate, int answer) {
		super(questionId, entryDate);
		this.answer = answer;
	}

	public QuestionResultsEmoji() {
	}

	public int getAnswer() {
		return answer;
	}

}
