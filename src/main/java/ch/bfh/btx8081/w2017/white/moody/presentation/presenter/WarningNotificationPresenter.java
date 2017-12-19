package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

/**
 * This class is the presenter of the WarningNotification screen on this screen the user
 * recive a warningnotification if his answers werent negativ during 7 days.
 * 
 * @author Sandra
 * Last Edit: 19.12.17
 */

import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.WarningNotificationModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.WarningNotificationView;

public class WarningNotificationPresenter implements ViewListener {
	@SuppressWarnings("unused")
	private WarningNotificationModel warningNotificationModel;
	private WarningNotificationView warningNotificationView;

	public WarningNotificationPresenter(WarningNotificationModel warningNotificationModel, WarningNotificationView warningNotificationView) {
		this.warningNotificationModel = warningNotificationModel;
		this.warningNotificationView = warningNotificationView;
		warningNotificationView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();
		
		switch (buttonID) {
		case "buttonTelefonArzt":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);			
			break;
		case "buttonSMSArzt":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);			
			break;
		case "buttonTelefonBezugsperson":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);			
			break;	
		case "buttonSMSBezugsperson":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);			
			break;
		case "buttonGelesen":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);			
			break;
		}
	}
}