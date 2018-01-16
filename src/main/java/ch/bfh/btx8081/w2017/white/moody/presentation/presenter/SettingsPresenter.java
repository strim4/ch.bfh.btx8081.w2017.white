package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.List;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.SettingsModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.SettingsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Settings Presenter Class
 * @author Chantal
 * Last edit: 16.01.18
 */
@SuppressWarnings("serial")
public class SettingsPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private SettingsModel model;
	private SettingsView view;
	
	public SettingsPresenter(SettingsModel model, SettingsView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	public SettingsPresenter( SettingsView view) {
		
		this.view = view;
		view.addListener(this);
	}
	
	/**
	 * The public method getpr gives a list of all profiles back
	 * @return - list of profiles
	 */
	public List<Profile> getpr() {
		DBManager dbm = DBManager.getInstance( );
		return dbm.getpr();

	}
	
	/**
	 * The public method buttonClick handles the events of the button profile.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "profile":
			view.getUI().getNavigator().navigateTo(Views.PROFILE_VIEW);
			break;
		}
		
	}

}
