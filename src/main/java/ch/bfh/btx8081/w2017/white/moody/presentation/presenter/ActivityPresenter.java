package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.Date;

import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.SubWindowView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Activity Presenter class does the connection from the Activity to the ActivityView.
 * 
 * @author Chantal
 * Last edit: 30.11.17
 * @author Roberto
 * Last edit: 13.12.17
 */

@SuppressWarnings("serial")
public class ActivityPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private Activity model;
	private ActivityView view;
	private UI parent;
	
	public ActivityPresenter(Activity model, ActivityView view, UI tes) {
		this.parent = tes;
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	@SuppressWarnings("static-access")
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "newActivity":
			SubWindowView sw = new SubWindowView();
			parent.addWindow(sw);
			break;
		case "buttonSave":
			Activity a = new Activity();
			a.creatAc(view.getNameValue(), view.getActivityValue(), view.getDateValue(), new Date());
			
			Notification saved = new Notification("");
			saved.setPosition(Position.BOTTOM_CENTER);
			saved.show("Eintrag gespeichert");
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		}
	}
}
