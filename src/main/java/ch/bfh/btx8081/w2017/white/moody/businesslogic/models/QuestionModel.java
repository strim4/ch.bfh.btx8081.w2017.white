package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;

/**
 *
 * @author Silvan
 * description
 * Last Edit: 2017-12-07
 *
 */

public class QuestionModel extends BaseModel{

    private Question question;

    public QuestionModel(){
        question = new Question();
    }

    public void saveResult(String result){
        question.setResult(result);
    }

}
