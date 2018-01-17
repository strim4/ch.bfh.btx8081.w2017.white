package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * This class is the view of the WarningNotification screen on this screen the user
 * recive a warningnotification if his answers werent negativ during 7 days.
 * 
 * @author Sandra
 * Last Edit: 19.12.17
 */

public class WarningNotificationView extends BaseView implements MoodyView{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//private WarningNotificationPresenter presenter = null;
	
	//private static final String BUTTON_TELEFON = "Telefon";
	//private static final String BUTTON_SMS = "SMS";
	private static final String BUTTON_GELESEN = "gelesen";

	private static final String BUTTON_WIDTH = "87px";
	private static final String BUTTON_HEIGHT = "87px";	
	
	public WarningNotificationView() {
		super();
		// super.setTitle(""); Darf hier nicht stehen! Der User muss aktiv gelesen bestätigen, er darf nicht
		// einfach mit HOME auf die Startansicht zurückkehren
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createButtons();
	}

	//@SuppressWarnings("serial")
	private void createButtons() {
		
		String firstname = DBManager.getInstance().getFirstName();

		Label warningNotification = new Label("Hallo " + firstname + " Du hast nun während 7 Tagen Deine täglichen Fragen negativ beantwortet. \nBitte nimm mit Deinem Arzt oder mit Deiner Bezugsperson Kontakt auf.");
		warningNotification.setWidth("380px");
		//warningNotification.setHeight("");
		super.content.addComponent(warningNotification);
		super.content.setComponentAlignment(warningNotification, Alignment.MIDDLE_CENTER);

		Label labelArzt = new Label("Arzt");		
		labelArzt.setId("labelArzt");
		labelArzt.setWidth("190px");
		labelArzt.setHeight("40px");

		Label labelBezugsperson = new Label("Bezugsperson");		
		labelBezugsperson.setId("labelBezugsperson");
		labelBezugsperson.setWidth("190px");
		labelBezugsperson.setHeight("40px");
		
		HorizontalLayout contentRow1 = new HorizontalLayout();
		contentRow1.addComponents(labelArzt, labelBezugsperson);
		content.addComponent(contentRow1);
		content.setComponentAlignment(contentRow1, Alignment.MIDDLE_CENTER);
		
		Button buttonTelefonArzt = new Button("Tel");
		buttonTelefonArzt.addClickListener(this);
		buttonTelefonArzt.setId("buttonTelefonArzt");
		buttonTelefonArzt.setWidth(BUTTON_WIDTH);
		buttonTelefonArzt.setHeight(BUTTON_HEIGHT);

		Button buttonSMSArzt = new Button("SMS");
		buttonSMSArzt.addClickListener(this);
		buttonSMSArzt.setId("buttonSMSArzt");
		buttonSMSArzt.setWidth(BUTTON_WIDTH);
		buttonSMSArzt.setHeight(BUTTON_HEIGHT);
		
		Button buttonTelefonBezugsperson = new Button("Tel");
		buttonTelefonBezugsperson.addClickListener(this);
		buttonTelefonBezugsperson.setId("buttonTelefonBezugsperson");
		buttonTelefonBezugsperson.setWidth(BUTTON_WIDTH);
		buttonTelefonBezugsperson.setHeight(BUTTON_HEIGHT);

		Button buttonSMSBezugsperson = new Button("SMS");
		buttonSMSBezugsperson.addClickListener(this);
		buttonSMSBezugsperson.setId("buttonSMSBezugsperson");
		buttonSMSBezugsperson.setWidth(BUTTON_WIDTH);
		buttonSMSBezugsperson.setHeight(BUTTON_HEIGHT);
		
		HorizontalLayout contentRow2 = new HorizontalLayout();
		contentRow2.addComponents(buttonTelefonArzt, buttonSMSArzt, buttonTelefonBezugsperson, buttonSMSBezugsperson);
		content.addComponent(contentRow2);
		content.setComponentAlignment(contentRow2, Alignment.MIDDLE_CENTER);
		
		Button buttonGelesen = new Button(BUTTON_GELESEN);
		buttonGelesen.addClickListener(this);
		buttonGelesen.setId("buttonGelesen");
		buttonGelesen.setWidth("380px");
		buttonGelesen.setHeight(BUTTON_HEIGHT);
		super.content.addComponent(buttonGelesen);
		super.content.setComponentAlignment(buttonGelesen, Alignment.MIDDLE_CENTER);
	}
}