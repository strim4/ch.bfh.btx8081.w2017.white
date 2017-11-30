package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryPicView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryPicture Presenter
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryPicPresenter implements ViewListener{
	
	@SuppressWarnings("unused")
	private DiaryPic model;
	private DiaryPicView view;
	
	public DiaryPicPresenter(DiaryPic model, DiaryPicView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
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
