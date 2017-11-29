package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Chantal
 * Last edit: 29.11.17
 */

public class ActivityPresenter {

	private Activity model;
	private ActivityView view;
	
	public ActivityPresenter(Activity model, ActivityView view) {
		this.model = model;
		this.view = view;
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		//TODO add links
		switch(buttonID) {
		case "newActivity": //button ID machen
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
