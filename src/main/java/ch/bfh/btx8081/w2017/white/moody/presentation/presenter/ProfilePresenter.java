package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.ProfileModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ProfileView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */

@SuppressWarnings("serial")
public class ProfilePresenter implements ViewListener {

	@SuppressWarnings("unused")
	private ProfileModel model;
	private ProfileView view;
	
	public ProfilePresenter(ProfileModel model, ProfileView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	@SuppressWarnings("static-access")
	@Override	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "buttonSave":
			//TODO watch that Button works
		Profile p = new Profile(view.getFirstNameValue(), view.getLastNameValue(), 
					view.getDateValue(), view.getGender(), view.getDoctor(), 
					view.getDoctorPhone(), view.getContact(), view.getContactPhone());
			DBManager dbm = new DBManager();
			dbm.persistObject(p);
			Notification saved = new Notification("");
			saved.setPosition(Position.BOTTOM_CENTER);
			saved.show("Eintrag gespeichert");
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
		
	}

}
