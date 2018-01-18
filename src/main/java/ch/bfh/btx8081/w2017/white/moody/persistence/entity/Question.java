package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import javax.persistence.*;

/**
 *
 * @author Silvan
 * description
 * Last Edit: 2017-12-07
 *
 */

@SuppressWarnings("serial")
@Entity
@Table
public class Question implements SEntity {

    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String questionText;
    private String result; //which answer indicates NO depression : Yes or No

    // constructor
    public Question(){}

    public Question(String questionText, String result) {
		this.questionText = questionText;
		this.result=result;
	}

    // methods
    public int getId(){
        return id;
    }

    public String getQuestionText(){
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getResult(){
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}