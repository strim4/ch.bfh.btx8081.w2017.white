package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.List;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Diary;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;


/**
 * @author Moritz
 * This model is used by the diary view to present all  diary
 * entries to the user.
 **/
public class DiaryModel extends BaseModel
{

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
}
