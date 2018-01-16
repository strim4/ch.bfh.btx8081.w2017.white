package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ResourceReference;

/**
 * This class is the presenter of the WarningNotification screen on this screen the user
 * recive a warningnotification if his answers werent negativ during 7 days.
 * 
 * @author Sandra
 * Last Edit: 19.12.17
 */

import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.WarningNotificationModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.WarningNotificationView;

public class WarningNotificationPresenter implements ViewListener {

	private static final long serialVersionUID = -4330352225143987905L;
	@SuppressWarnings("unused")
	private WarningNotificationModel warningNotificationModel;
	private WarningNotificationView warningNotificationView;
	
	String housedoctor = DBManager.getInstance().getHouseDoctor();
	String emergencycontact = DBManager.getInstance().getEmergencyContact();

	private String messageArzt = "?body=Sehr%20geehrter%20Herr%20" + housedoctor + ",%20ich%20habe%20heute%20den%20Schwellenwert%20erreicht.%20Bitte%20geben%20Sie%20mir%20einen%20Notfalltermin%20Besten%20Dank%20und%20freundliche%20Grüsse%20Sandra%20Burri%20PatID%20666";
	private String messageBezugsperson = "?body=Liebste%20" + emergencycontact + ",%20ich%20habe%20heute%20den%20Schwellenwert%20erreicht.%20Bitte%20komm%20mich%20besuchen%20Liebe%20Grüsse%20Sandra";

	public WarningNotificationPresenter(WarningNotificationModel warningNotificationModel,
			WarningNotificationView warningNotificationView) {
		this.warningNotificationModel = warningNotificationModel;
		this.warningNotificationView = warningNotificationView;
		warningNotificationView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		String housedoctorphone = DBManager.getInstance().getHouseDoctorPhone();
		String emergencycontactphone = DBManager.getInstance().getEmergencyContactPhone();

		Resource phoneArzt = new ExternalResource("tel:" + housedoctorphone);
		final ResourceReference callArzt = ResourceReference.create(phoneArzt, event.getButton(), "callArzt");
		
		//Mit Mail, falls es mit SMS nicht funktionieren sollte...
		//Resource smsArzt = new ExternalResource("mailto:" + housedoctorphone + messageArzt);
		//final ResourceReference sendSMSArzt = ResourceReference.create(smsArzt, event.getButton(), "sendSMSArzt");

		Resource smsArzt = new ExternalResource("sms:" + housedoctorphone + messageArzt);
		final ResourceReference sendSMSArzt = ResourceReference.create(smsArzt, event.getButton(), "sendSMSArzt");

		Resource phoneBezugsperson = new ExternalResource("tel:" + emergencycontactphone);
		final ResourceReference callBezugsperson = ResourceReference.create(phoneBezugsperson, event.getButton(),
				"callBezugsperson");

		//Mit Mail, falls es mit SMS nicht funktionieren sollte...
		//Resource smsBezugsperson = new ExternalResource("mailto:" + emergencycontactphone + messageBezugsperson);
		//final ResourceReference sendSMSBezugsperson = ResourceReference.create(smsBezugsperson, event.getButton(), "sendSMSBezugsperson");
		
		Resource smsBezugsperson = new ExternalResource("sms:" + emergencycontactphone + messageBezugsperson);
		final ResourceReference sendSMSBezugsperson = ResourceReference.create(smsBezugsperson, event.getButton(), "sendSMSBezugsperson");

		switch (buttonID) {
		case "buttonTelefonArzt":
			warningNotificationView.getUI().getPage().getCurrent().open(callArzt.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonSMSArzt":
			warningNotificationView.getUI().getPage().getCurrent().open(sendSMSArzt.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonTelefonBezugsperson":
			warningNotificationView.getUI().getPage().getCurrent().open(callBezugsperson.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonSMSBezugsperson":
			warningNotificationView.getUI().getPage().getCurrent().open(sendSMSBezugsperson.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonGelesen":
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}
}