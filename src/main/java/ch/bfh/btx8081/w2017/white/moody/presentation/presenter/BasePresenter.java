package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Base Presenter Class
 * @author Chantal
 * Last edit: 29.11.17
 *
 */
public class BasePresenter {
	
	private BaseModel model;
	private BaseView view;

	public BasePresenter(BaseModel model, BaseView view) {
		this.model = model;
		this.view = view;
		//view.addListener(this);
	}

	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		//TODO links hinzufügen
		switch(buttonID) {
		case "buttonDiary":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonContact":
		case "buttonBarometer":
		case "buttonExercises":
		case "buttonInformations":
		case "buttonTips":
		case "buttonSettings":
			
		}
	}
}