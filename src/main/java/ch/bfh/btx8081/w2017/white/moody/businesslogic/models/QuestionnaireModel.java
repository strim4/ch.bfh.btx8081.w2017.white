package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Questionnaire;

import java.util.List;

/**
 *
 * @author Silvan
 * description
 * Last Edit: 2017-12-07
 *
 */
public class QuestionnaireModel extends BaseModel {

    private Questionnaire questionnaire;

    // constructor
    public QuestionnaireModel() {
        questionnaire = new Questionnaire();
    }

    // methods

    public List<Question> getQuestions() {
        return questionnaire.getQuestionnaire();
    }

   /* public void addQuestion(Question question) {
        getQuestionnaire().add(question);
    }
    */

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

}
