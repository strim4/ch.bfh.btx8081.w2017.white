package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Base Presenter Class
 * @author Chantal
 * Last edit: 30.11.17
 *
 */
@SuppressWarnings("serial")
public class BasePresenter implements ViewListener{
	
	@SuppressWarnings("unused")
	private BaseModel model;
	private BaseView view;

	public BasePresenter(BaseModel model, BaseView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}

	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "buttonDiary":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonContact":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
		case "buttonBarometer":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
		case "buttonExercises":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
		case "buttonInformations":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
		case "buttonTips":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
		case "buttonSettings":
			//view.getUI().getNavigator().navigateTo(Views.);
			break;
			
		}
	}
}