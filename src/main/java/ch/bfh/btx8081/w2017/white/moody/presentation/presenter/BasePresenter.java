package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Base Presenter Class
 * @author Chantal
 * Last edit: 16.01.18
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

	/**
	 * The public method buttonClick handles the events of the buttons of the main view.
	 */
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "buttonDiary":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonContact":
			view.getUI().getNavigator().navigateTo(Views.CONTANCT_VIEW);
			break;
		case "buttonBarometer":
			view.getUI().getNavigator().navigateTo(Views.BAROMETER_VIEW);
			break;
		case "buttonExercises":
			view.getUI().getNavigator().navigateTo(Views.EXERCISES_VIEW);
			break;
		case "buttonInformations":
			view.getUI().getNavigator().navigateTo(Views.INFORMATIONS_VIEW);
			break;
		case "buttonTips":
			view.getUI().getNavigator().navigateTo(Views.TIPS_VIEW);
			break;
			
		}
	}
}
