package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.components.grid.ItemClickListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.TextField;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
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
	private Grid<Profile> gridpr = new Grid<>();
	
	private Button buttonProfileNew;
	
	private TextField firstNameEditor = new TextField();
	private TextField lastNameEditor = new TextField();
	private TextField doctorEditor = new TextField();
	private TextField doctorPhoneEditor = new TextField();
	private TextField contactEditor = new TextField();
	private TextField contactPhoneEditor = new TextField();
	
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
		
		buttonProfileNew = new Button("Neues Profil erstellen");
		buttonProfileNew.addClickListener(this);
		buttonProfileNew.setId("profile");
		buttonProfileNew.setWidth(BUTTON_WIDTH);
		
		gridpr.addColumn(Profile::getFirstName)
		.setCaption("Vorname")
		.setEditorComponent(firstNameEditor, Profile::setFirstName);
		gridpr.addColumn(Profile::getLastName)
		.setCaption("Nachname")
		.setEditorComponent(lastNameEditor, Profile::setLastName);
		gridpr.addColumn(Profile::getHouseDoctor)
		.setCaption("Arzt")
		.setEditorComponent(doctorEditor, Profile::setHouseDoctor);
		gridpr.addColumn(Profile::getHouseDoctorPhone)
		.setCaption("Telefon-Arzt")
		.setEditorComponent(doctorPhoneEditor, Profile::setHouseDoctorPhone);
		gridpr.addColumn(Profile::getEmergencyContact)
		.setCaption("Kontakt")
		.setEditorComponent(contactEditor, Profile::setEmergencyContact);
		gridpr.addColumn(Profile::getEmergencyContactPhone)
		.setCaption("Telefon-Kontakt")
		.setEditorComponent(contactPhoneEditor, Profile::setEmergencyContactPhone);
		gridpr.setItems((Collection<Profile>) sp.getpr());
		gridpr.setHeight("80px");
		gridpr.setWidth("1000px");
		super.content.addComponents(buttonProfileNew, gridpr);
		super.content.setComponentAlignment(buttonProfileNew, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(gridpr, Alignment.MIDDLE_CENTER);
		gridpr.addItemClickListener(new ItemClickListener<Profile>() {
			public void itemClick(ItemClick<Profile> event) {
				if (event.getMouseEventDetails().isDoubleClick()) {
					gridpr.getEditor().setEnabled(true);
				}
			}
		});
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
