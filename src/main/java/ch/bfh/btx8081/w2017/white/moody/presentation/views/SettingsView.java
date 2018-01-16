package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.SettingsPresenter;

/**
 * SettingsView Class
 * @author Chantal
 * Last edit: 16.01.18
 */

@SuppressWarnings("serial")
public class SettingsView extends BaseView implements MoodyView{

	private static final String BUTTON_WIDTH = "240px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	private SettingsPresenter sp = new SettingsPresenter(this);
	private Button buttonProfileNew = new Button("Neues Profil erstellen");
	private Grid<Profile> gridpr = new Grid<>();
	
	public SettingsView() {
		super();
		super.setTitle("Einstellungen");
		this.createLayout();
	}
	
	/**
	 * The private method createLayout construct the layout 
	 * of this page with the buttons.
	 */
	public void createLayout() {
		
		buttonProfileNew.addClickListener(this);
		buttonProfileNew.setId("profile");
		buttonProfileNew.setWidth(BUTTON_WIDTH);
		
		gridpr.addColumn(Profile::getFirstName).setCaption("Vorname");
		gridpr.addColumn(Profile::getLastName).setCaption("Nachname");
		gridpr.setItems((Collection<Profile>) sp.getpr());
		gridpr.setHeight("160px");
		super.content.addComponents(buttonProfileNew, gridpr);
		super.content.setComponentAlignment(buttonProfileNew, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(gridpr, Alignment.MIDDLE_CENTER);
	
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
		for(ViewListener listener: this.listeners) {
			listener.buttonClick(event);
		}
	}
}
