package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryPicView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Chantal
 * Last edit: 29.11.17
 */

public class DiaryPicPresenter {
	
	private DiaryPic model;
	private DiaryPicView view;
	
	public DiaryPicPresenter(DiaryPic model, DiaryPicView view) {
		this.model = model;
		this.view = view;
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		//TODO add links
		switch(buttonID) {
		case "buttonSave":
			//Speicher-Methode
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonDelete":
			//Lösch-Methode
			break;
		}
	}

}
