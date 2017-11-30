package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.DiaryModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * @author Chantal
 * DiaryPresenter Class
 * Last Edit: 29.11.17
 */
@SuppressWarnings("serial")
public class DiaryPresenter implements ViewListener{
	
	@SuppressWarnings("unused")
	private DiaryModel diaryModel;
	private DiaryView diaryView;
	
	public DiaryPresenter(DiaryModel diaryModel, DiaryView diaryView){
		this.diaryModel = diaryModel;
		this.diaryView = diaryView;
		diaryView.addListener(this);
	}
	
	public void buttonClick(ClickEvent event){
		
		String buttonID = event.getButton().getId();
		
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
}
