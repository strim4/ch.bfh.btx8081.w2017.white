package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Activity Presenter class does the connection from the Activity to the ActivityView.
 * 
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class ActivityPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private Activity model;
	private ActivityView view;
	
	public ActivityPresenter(Activity model, ActivityView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		//TODO add links
		switch(buttonID) {
		case "newActivity":
			//Neue Activity in die Auswahl aufnehmen und auswählen
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
