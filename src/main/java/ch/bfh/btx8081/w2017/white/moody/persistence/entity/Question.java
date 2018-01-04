package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import javax.persistence.*;

/**
 *
 * @author Silvan
 * description
 * Last Edit: 2017-12-07
 *
 */

/*@SuppressWarnings("serial")
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
*/
public class Question implements SEntity {

    // attributes
 //   @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String questionText;
    private QuestionAnswer questionAnswer;
    private String result;

    // constructor
    public Question(){}

    public Question(String questionText, QuestionAnswer questionAnswer){
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }

    // methods
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
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

    public QuestionAnswer getQuestionAnswer() {
        return questionAnswer;
    }
}