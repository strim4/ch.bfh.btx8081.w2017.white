package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.ProfileModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ProfileView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Profile Presenter Class
 * @author Chantal Last edit: 16.01.18
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

	/**
	 * The public method buttonClick handles the events of the buttons save and back.
	 */
	@SuppressWarnings("static-access")
	@Override
	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonSave":
			Profile p = new Profile();
			p.creatPr(view.getFirstNameValue(), view.getLastNameValue(), view.getDoctor(), view.getDoctorPhone(),
					view.getContact(), view.getContactPhone());

			Notification saved = new Notification("");
			saved.setPosition(Position.BOTTOM_CENTER);
			saved.show("Eintrag gespeichert");
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.SETTINGS_VIEW);
			break;
		}

	}

}
