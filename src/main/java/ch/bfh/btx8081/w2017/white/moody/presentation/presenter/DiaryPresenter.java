package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.DiaryModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * @author Chantal
 * DiaryPresenter Class
 * Last Edit: 29.11.17
 */
public class DiaryPresenter {
	
	private DiaryModel diaryModel;
	private DiaryView diaryView;
	
	public DiaryPresenter(DiaryModel diaryModel, DiaryView diaryView){
		this.diaryModel = diaryModel;
		this.diaryView = diaryView;
	}
	
	public void buttonClick(ClickEvent event){
		
		String buttonID = event.getButton().getId();
		
		//TODO add links
		switch(buttonID) {
		case "buttonText":
			diaryView.getUI().getNavigator().navigateTo(Views.DIARYTEXT_VIEW);
			break;
		case "buttonPic":
			diaryView.getUI().getNavigator().navigateTo(Views.DIARYPIC_VIEW);
			break;
		case "buttonActivity":
			diaryView.getUI().getNavigator().navigateTo(Views.ACTIVITY_VIEW);
			break;
		case "buttonList":
			diaryView.getUI().getNavigator().navigateTo(Views.DIARYELEMENTLIST_VIEW);
			break;
		case "buttonBack":
			diaryView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}
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
