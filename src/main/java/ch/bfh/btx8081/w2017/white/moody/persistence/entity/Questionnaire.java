package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.util.*;

/**
 *
 * @author Silvan
 * description
 * Last Edit: 2017-12-07
 *
 */

public class Questionnaire implements SEntity {

    // todo: delete question elements

    private List<Question> questionnaire;

    // constructor
    public Questionnaire() {
        questionnaire = new ArrayList<Question>();
    }

    // methods
    public void addQuestion(Question question){
        questionnaire.add(question);
    }

    public List<Question> getQuestionnaire(){
        return questionnaire;
    }

    public List<String> listQuestionnaire(){
        List<String> result = new ArrayList<String>();

        for (Question question : questionnaire){
            result.add(question.getQuestionText());
           // result.add(question.getQuestionAnswer());
        }

        return result;
    }




}