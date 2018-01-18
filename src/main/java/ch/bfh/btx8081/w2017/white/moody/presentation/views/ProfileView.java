package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

/**
 * Profile View
 * @author Chantal Last edit: 16.01.18
 * * @author Moritz 
 */

@SuppressWarnings("serial")
public class ProfileView extends BaseView implements MoodyView {

	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private TextField firstNameTF = new TextField("Vorname");
	private TextField lastNameTF = new TextField("Nachname");;
	private TextField houseDoctorTF = new TextField("Arzt");;
	private TextField houseDoctorPhoneTF = new TextField("Telefon des Arztes");
	private TextField emergencyContactTF = new TextField("Notfallkontakt");;
	private TextField emergencyContactPhoneTF = new TextField("Telefon des Notfallkontaktes");
	
	private Button buttonSave = new Button("");
	private Button buttonBack = new Button("");

	public ProfileView() {
		
		super();
		super.setTitle("Profil");
		this.dataEntry();
		this.createButtons();
		
	}

	/**
	 * The public method dataEntry shows the input textfields
	 */
	public void dataEntry() {

		firstNameTF.setWidth("500px");
		super.content.addComponent(firstNameTF);
		super.content.setComponentAlignment(firstNameTF, Alignment.MIDDLE_CENTER);

		lastNameTF.setWidth("500px");
		super.content.addComponent(lastNameTF);
		super.content.setComponentAlignment(lastNameTF, Alignment.MIDDLE_CENTER);

		HorizontalLayout horizontal = new HorizontalLayout();
		super.content.addComponent(horizontal);
		super.content.setComponentAlignment(horizontal, Alignment.MIDDLE_CENTER);

		HorizontalLayout houseDoctor = new HorizontalLayout();
		super.content.addComponent(houseDoctor);
		super.content.setComponentAlignment(houseDoctor, Alignment.MIDDLE_CENTER);
		houseDoctorTF.setWidth("280px");
		houseDoctorPhoneTF.setWidth("200px");
		houseDoctor.addComponents(houseDoctorTF, houseDoctorPhoneTF);

		HorizontalLayout contact = new HorizontalLayout();
		super.content.addComponent(contact);
		super.content.setComponentAlignment(contact, Alignment.MIDDLE_CENTER);
		emergencyContactTF.setWidth("280px");
		emergencyContactPhoneTF.setWidth("200px");
		contact.addComponents(emergencyContactTF, emergencyContactPhoneTF);

	}
	
	/**
	 * The public method createButtons constructs the buttons of this page.
	 */
	public void createButtons() {
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);

		buttonSave.addClickListener(this);
		buttonSave.setId("buttonSave");
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		buttonSave.setIcon(new FileResource(new File(basepath + "/VAADIN/images/saveIcon.png")));

		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		
		menue.addComponents(buttonSave, buttonBack);
		menue.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
		
	}

	/**
	 * The public method getFirstNameValue gives the value of the first name
	 * @return first name
	 */
	public String getFirstNameValue() {
		String cont = firstNameTF.getValue();
		return cont;
	}

	/**
	 * The public method getLastNameValue gives the value of the last name
	 * @return last name
	 */
	public String getLastNameValue() {
		String cont = lastNameTF.getValue();
		return cont;
	}

	/**
	 * The public method getDoctor gives the value of the house doctor
	 * @return the name of the house doctor
	 */
	public String getDoctor() {
		String doctor = houseDoctorTF.getValue().toString();
		return doctor;
	}

	/**
	 * The public method getDoctorPhone gives the doctor's phone number
	 * @return doctor's phone number
	 */
	public String getDoctorPhone() {
		String doctorPhone = houseDoctorPhoneTF.getValue().toString();
		return doctorPhone;
	}

	/**
	 * The public method getContact gives the name of the contact
	 * @return the name of the contact
	 */
	public String getContact() {
		String emergency = emergencyContactTF.getValue().toString();
		return emergency;
	}

	/**
	 * The public method getContactOhone gives the contact's phone number
	 * @return contact's phone number
	 */
	public String getContactPhone() {
		String emergencyPhone = emergencyContactPhoneTF.getValue().toString();
		return emergencyPhone;
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
