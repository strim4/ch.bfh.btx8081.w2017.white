package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.DiaryModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;

/**
 * @author Chantal
 * DiaryPresenter Class
 * Last Edit: 23.11.17
 */
public class DiaryPresenter {
	
	private DiaryModel diaryModel;
	private DiaryView diaryView;
	
	public DiaryPresenter(DiaryModel diaryModel, DiaryView diaryView){
		this.diaryModel = diaryModel;
		this.diaryView = diaryView;
	}
	
//	public void buttonClick(){
//		
//		switch(){
//		case "newText":
//			diaryModel.createNewTextElement();
//			break;
//		case "newPic":
//			diaryModel.createNewPicElement();
//		case "newActivity":
//			diaryModel.createNewActivityElement();
//		case "ListDiaryElements":
//			diaryModel.getElements();
//		}
//
//	}

}
