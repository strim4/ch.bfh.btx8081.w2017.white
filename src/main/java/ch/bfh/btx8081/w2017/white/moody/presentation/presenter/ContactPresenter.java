package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.server.ResourceReference;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.ContactModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ContactView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * ContactPresenter Class
 * @author Roberto
 * Last edit: 17.01.18
 */
@SuppressWarnings("serial")
public class ContactPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private ContactModel contactModel;
	private ContactView contactView;
	
	String housedoctor = DBManager.getInstance().getHouseDoctor();
	String emergencycontact = DBManager.getInstance().getEmergencyContact();

	public ContactPresenter(ContactModel contactModel, ContactView contactView) {
		this.contactModel = contactModel;
		this.contactView = contactView;
		contactView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		String housedoctorphone = DBManager.getInstance().getHouseDoctorPhone();
		String emergencycontactphone = DBManager.getInstance().getEmergencyContactPhone();

		Resource phoneArzt = new ExternalResource("tel:" + housedoctorphone);
		final ResourceReference callArzt = ResourceReference.create(phoneArzt, event.getButton(), "callArzt");
		
		Resource phoneBezugsperson = new ExternalResource("tel:" + emergencycontactphone);
		final ResourceReference callBezugsperson = ResourceReference.create(phoneBezugsperson, event.getButton(),
				"callBezugsperson");

		switch (buttonID) {
		case "buttonTelefonArzt":
			contactView.getUI().getPage().getCurrent().open(callArzt.getURL(), "_blank");
			contactView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		case "buttonTelefonBezugsperson":
			contactView.getUI().getPage().getCurrent().open(callBezugsperson.getURL(), "_blank");
			contactView.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}	
}

