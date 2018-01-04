package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import com.vaadin.data.HasDataProvider;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

import com.vaadin.ui.DateField;

/**
 * 
 * @author Chantal Last edit: 09.12.17
 */

@SuppressWarnings("serial")
public class ProfileView extends BaseView implements MoodyView {

	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";
	private DBManager dbm = DBManager.getInstance( );

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private TextField firstNameTF;
	private TextField lastNameTF;
	private TextField houseDoctorTF;
	private TextField houseDoctorPhoneTF;
	private TextField emergencyContactTF;
	private TextField emergencyContactPhoneTF;

	public ProfileView() {
		super();
		super.setTitle("Profil");
		this.createLayout();
	}

	public void createLayout() {

		firstNameTF = new TextField("Vorname");
		firstNameTF.setWidth("500px");
		firstNameTF.setData(dbm.getpr());
		firstNameTF.selectAll();
		firstNameTF.setValue(DESIGN_ATTR_PLAIN_TEXT);
		//firstNameTF.setValue(Profile::getFirstName);
		
		super.content.addComponent(firstNameTF);
		super.content.setComponentAlignment(firstNameTF, Alignment.MIDDLE_CENTER);

		lastNameTF = new TextField("Nachname");
		lastNameTF.setWidth("500px");
		super.content.addComponent(lastNameTF);
		super.content.setComponentAlignment(lastNameTF, Alignment.MIDDLE_CENTER);

		HorizontalLayout horizontal = new HorizontalLayout();
		super.content.addComponent(horizontal);
		super.content.setComponentAlignment(horizontal, Alignment.MIDDLE_CENTER);

		HorizontalLayout houseDoctor = new HorizontalLayout();
		super.content.addComponent(houseDoctor);
		super.content.setComponentAlignment(houseDoctor, Alignment.MIDDLE_CENTER);

		houseDoctorTF = new TextField("Arzt");
		houseDoctorTF.setWidth("280px");

		houseDoctorPhoneTF = new TextField("Telefon des Arztes");
		houseDoctorPhoneTF.setWidth("200px");
		houseDoctor.addComponents(houseDoctorTF, houseDoctorPhoneTF);

		HorizontalLayout contact = new HorizontalLayout();
		super.content.addComponent(contact);
		super.content.setComponentAlignment(contact, Alignment.MIDDLE_CENTER);

		emergencyContactTF = new TextField("Notfallkontakt");
		emergencyContactTF.setWidth("280px");

		emergencyContactPhoneTF = new TextField("Telefon des Notfallkontaktes");
		emergencyContactPhoneTF.setWidth("200px");
		contact.addComponents(emergencyContactTF, emergencyContactPhoneTF);

		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);

		Button buttonSave = new Button("");
		buttonSave.addClickListener(this);
		buttonSave.setId("buttonSave");
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		buttonSave.setIcon(new FileResource(new File(basepath + "/VAADIN/images/saveIcon.png")));
		menue.addComponent(buttonSave);
		menue.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);

		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		menue.addComponent(buttonBack);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);

	}

	public String getFirstNameValue() {
		String cont = firstNameTF.getValue();
		return cont;
	}

	public String getLastNameValue() {
		String cont = lastNameTF.getValue();
		return cont;
	}

	public String getDoctor() {
		String doctor = houseDoctorTF.getValue().toString();
		return doctor;
	}

	public String getDoctorPhone() {
		String doctorPhone = houseDoctorPhoneTF.getValue().toString();
		return doctorPhone;
	}

	public String getContact() {
		String emergency = emergencyContactTF.getValue().toString();
		return emergency;
	}

	public String getContactPhone() {
		String emergencyPhone = emergencyContactPhoneTF.getValue().toString();
		return emergencyPhone;
	}

	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		for (ViewListener listener : this.listeners) {
			listener.buttonClick(event);
		}
	}
}
