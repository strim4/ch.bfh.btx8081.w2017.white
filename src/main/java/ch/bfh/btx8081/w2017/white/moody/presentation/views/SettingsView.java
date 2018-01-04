package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */

@SuppressWarnings("serial")
public class SettingsView extends BaseView implements MoodyView{

	private static final String BUTTON_WIDTH = "240px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	private DBManager dbm = DBManager.getInstance( );
	private Button buttonProfileNew = new Button("Neues Profil erstellen");
	private Grid<Profile> gridpr = new Grid<>();
	
	public SettingsView() {
		super();
		super.setTitle("Einstellungen");
		this.createLayout();
	}
	public void createLayout() {
		
		buttonProfileNew.addClickListener(this);
		buttonProfileNew.setId("profile");
		buttonProfileNew.setWidth(BUTTON_WIDTH);
		
		gridpr.addColumn(Profile::getFirstName).setCaption("Vorname");
		gridpr.addColumn(Profile::getLastName).setCaption("Nachname");
		gridpr.setItems((Collection<Profile>) dbm.getpr());
		gridpr.setHeight("80px");
		super.content.addComponents(buttonProfileNew, gridpr);
		super.content.setComponentAlignment(buttonProfileNew, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(gridpr, Alignment.MIDDLE_CENTER);
	
	}
	
	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		for(ViewListener listener: this.listeners) {
			listener.buttonClick(event);
		}
	}
}
