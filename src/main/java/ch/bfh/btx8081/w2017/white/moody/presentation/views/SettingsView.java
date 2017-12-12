package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */

@SuppressWarnings("serial")
public class SettingsView extends BaseView implements MoodyView{

	private static final String BUTTON_WIDTH = "240px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	public SettingsView() {
		super();
		super.setTitle("Einstellungen");
		this.createLayout();
	}
	public void createLayout() {
		
		//TODO Profil einstellen, spaeter hinzufuegen, mit Bedingugn, wenn kein Profil neues erstellen sonst Profil bearbeiten
		//if(){
		Button buttonProfileNew = new Button("Neues Profil erstellen");
		buttonProfileNew.addClickListener(this);
		buttonProfileNew.setId("profile");
		buttonProfileNew.setWidth(BUTTON_WIDTH);
		super.content.addComponent(buttonProfileNew);
		super.content.setComponentAlignment(buttonProfileNew, Alignment.MIDDLE_CENTER);
		//}else{
		Button buttonProfile = new Button("Profil bearbeiten");
		buttonProfile = new Button("Profil bearbeiten");
		buttonProfile.addClickListener(this);
		buttonProfile.setId("profileB");
		buttonProfile.setWidth(BUTTON_WIDTH);
		super.content.addComponent(buttonProfile);
		super.content.setComponentAlignment(buttonProfile, Alignment.MIDDLE_CENTER);
		
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
