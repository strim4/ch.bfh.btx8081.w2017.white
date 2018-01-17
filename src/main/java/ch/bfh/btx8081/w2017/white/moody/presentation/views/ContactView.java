package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * ContactView class gives the contact data from the profile back
 * @author Chantal
 * Last Edit: 16.01.18
 */
@SuppressWarnings("serial")
public class ContactView extends BaseView implements MoodyView {
	
	private static final String BUTTON_HEIGHT = null;
	private static final String BUTTON_WIDTH = null;
	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	public ContactView() {		
		super();
		super.setTitle("Kontakt");
		this.createFutureContent();
	}
	
	/**
	 * The private method createFutureContent is for the following content.
	 */
	private void createFutureContent() {
		
		String firstname = DBManager.getInstance().getFirstName();

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
		buttonTelefonArzt.setWidth("190px");
		buttonTelefonArzt.setHeight(BUTTON_HEIGHT);
		
		Button buttonTelefonBezugsperson = new Button("Tel");
		buttonTelefonBezugsperson.addClickListener(this);
		buttonTelefonBezugsperson.setId("buttonTelefonBezugsperson");
		buttonTelefonBezugsperson.setWidth("190px");
		buttonTelefonBezugsperson.setHeight(BUTTON_HEIGHT);
		
		HorizontalLayout contentRow2 = new HorizontalLayout();
		contentRow2.addComponents(buttonTelefonArzt, buttonTelefonBezugsperson);
		content.addComponent(contentRow2);
		content.setComponentAlignment(contentRow2, Alignment.MIDDLE_CENTER);
		
		
		//Label future = new Label("Auf dieser Seite kommen bald die Kontaktdaten fuer Notfaelle;)");
		//super.content.addComponent(future);
		//super.content.setComponentAlignment(future, Alignment.MIDDLE_CENTER);
				
		//TODO Kontaktdaten vom Profil
	}
	
    /**
     * The public method addListener adds objects to the listener.
     */
	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);	
	}

	/**
	 * The public method buttonClick handles the click event.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		for (ViewListener listener : this.listeners) {
			listener.buttonClick(event);
		}
	}
}
