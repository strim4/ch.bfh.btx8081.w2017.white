package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Milena
 * Answer of the daily question
 * Last Edit: 10.12.2017
 *
 */

@SuppressWarnings("serial")
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class QuestionResults implements Serializable,SEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int questionId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate;

	public QuestionResults(int questionId, Date entryDate) {
		this.questionId = questionId;
		this.entryDate = new Date(entryDate.getTime());
	}
	
	public QuestionResults(){}

	
	public int getQuestionId() {
		return questionId;
	}

	public Date getEntryDate() {
		return entryDate;
	}
	
	public String toString(){
			return "Question Id: "+ questionId+", entryDate: "+ entryDate;
			 
	}
	
}

