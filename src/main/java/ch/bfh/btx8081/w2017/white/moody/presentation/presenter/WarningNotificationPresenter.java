package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.Date;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ResourceReference;
import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.ThresholdValueUserReactionModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ThresholdValueUserReaction;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.WarningNotificationView;

/**
 * This class is the presenter of the WarningNotification screen on this screen the user
 * recive a warningnotification if his answers werent negativ during 7 days.
 * 
 * @author Sandra
 * Last Edit: 17.01.2018
 */

public class WarningNotificationPresenter implements ViewListener {

	private static final long serialVersionUID = -4330352225143987905L;
	@SuppressWarnings("unused")
	private ThresholdValueUserReactionModel thresholdValueUserReactionModel;
	private WarningNotificationView warningNotificationView;
	
	String housedoctor = DBManager.getInstance().getHouseDoctor();
	String emergencycontact = DBManager.getInstance().getEmergencyContact();

	private String messageDoctor = "?body=Sehr%20geehrter%20Herr%20" + housedoctor + ",%20ich%20habe%20heute%20den%20Schwellenwert%20erreicht.%20Bitte%20geben%20Sie%20mir%20einen%20Notfalltermin%20Besten%20Dank%20und%20freundliche%20Grüsse%20Sandra%20Burri%20PatID%20666";
	private String messageContactperson = "?body=Liebste%20" + emergencycontact + ",%20ich%20habe%20heute%20den%20Schwellenwert%20erreicht.%20Bitte%20komm%20mich%20besuchen%20Liebe%20Grüsse%20Sandra";

	public WarningNotificationPresenter(ThresholdValueUserReactionModel thresholdValueUserReactionModel, WarningNotificationView warningNotificationView) {
		this.thresholdValueUserReactionModel = thresholdValueUserReactionModel;
		this.warningNotificationView = warningNotificationView;
		warningNotificationView.addListener(this);
	}
	
	/**
	 * Buttons for calling the doctor or the contactPerson or send an SMS to the doctor or the contactPerson
	 * The Informations about the names and phonenumbers of the doctor or the contactPerson comes from the db
	 * The selected button from the user is written in the db
	 * 
	 */
	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		String housedoctorphone = DBManager.getInstance().getHouseDoctorPhone();
		String emergencycontactphone = DBManager.getInstance().getEmergencyContactPhone();

		Resource phoneDoctor = new ExternalResource("tel:" + housedoctorphone);
		final ResourceReference callDoctor = ResourceReference.create(phoneDoctor, event.getButton(), "callDoctor");
		
		Resource smsDoctor = new ExternalResource("sms:" + housedoctorphone + messageDoctor);
		final ResourceReference sendSMSDoctor = ResourceReference.create(smsDoctor, event.getButton(), "sendSMSDoctor");

		Resource phoneContactperson = new ExternalResource("tel:" + emergencycontactphone);
		final ResourceReference callContactperson = ResourceReference.create(phoneContactperson, event.getButton(),
				"callContactperson");

		Resource smsContactperson = new ExternalResource("sms:" + emergencycontactphone + messageContactperson);
		final ResourceReference sendSMSContactperson = ResourceReference.create(smsContactperson, event.getButton(), "sendSMSContactperson");
		
		int id = DBManager.getInstance().getId();
		ThresholdValueUserReaction sur = new ThresholdValueUserReaction();
		Date date = new Date();
		
		switch (buttonID) {
		case "buttonTelefonArzt":
			sur.createSur(id, date.toString(), "Klicked Button Tel to: " + housedoctorphone);
			warningNotificationView.getUI().getPage().getCurrent().open(callDoctor.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonSMSArzt":
			sur.createSur(id, date.toString(), "Klicked Button SMS to: " + housedoctorphone);
			warningNotificationView.getUI().getPage().getCurrent().open(sendSMSDoctor.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonTelefonBezugsperson":
			sur.createSur(id, date.toString(), "Klicked Button Tel to: " + emergencycontactphone);
			warningNotificationView.getUI().getPage().getCurrent().open(callContactperson.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonSMSBezugsperson":
			sur.createSur(id, date.toString(), "Klicked Button SMS to: " + emergencycontactphone);
			warningNotificationView.getUI().getPage().getCurrent().open(sendSMSContactperson.getURL(), "_blank");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonGelesen":
			sur.createSur(id, date.toString(), "Klicked Button gelesen");
			warningNotificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}	
}