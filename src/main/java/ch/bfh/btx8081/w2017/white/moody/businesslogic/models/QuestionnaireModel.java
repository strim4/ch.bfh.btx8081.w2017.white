package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Questionnaire;

/**
 *
 * @author Silvan
 * description
 *
 */
public class QuestionnaireModel extends BaseModel {
    private Questionnaire questionnaire;

    public QuestionnaireModel(){
       questionnaire = new Questionnaire();
    }

    


    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    /*
        private Diary diary;

    public DiaryModel()
    {
        diary = new Diary();
    }

    public List<DiaryElement> getEntries()
    {
        return diary.getElements();
    }

    public void addTextElement(DiaryText element)
    {
        diary.addTextElement(element);
    }

    public void addPicElement(DiaryPic element)
    {
        diary.addPicElement(element);
    }

    public void addActivity(Activity element)
    {
        diary.addActivity(element);
    }

    public Diary getDiary()
    {
        return diary;
    }

    public void setDiary(Diary diary)
    {
        this.diary = diary;
    }

     */

}
