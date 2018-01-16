package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.DateField;

/**
 * This class shows the creation of a new Diary Text Element.
 * 
 * @author Chantal Last edit: 16.01.18
 */

@SuppressWarnings("serial")
public class DiaryTextView extends BaseView implements MoodyView {

	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	Label dateL;
	private DateField date;
	Button buttonSave;
	Button buttonDelete;
	Button buttonBack;
	private RichTextArea newText;
	private TextField name;
	private Label lname;

	public DiaryTextView() {
		super();
		super.setTitle("Neuer Texteintrag");
		this.createButtons();
	}
	
	/**
	 * The private method createButtons construct the layout 
	 * of this page with the buttons.
	 */
	private void createButtons() {

		HorizontalLayout datePosition = new HorizontalLayout();
		super.content.addComponent(datePosition);
		super.content.setComponentAlignment(datePosition, Alignment.MIDDLE_CENTER);
		Label dateL = new Label("Datum auswählen: ");
		datePosition.addComponent(dateL);
		datePosition.setComponentAlignment(dateL, Alignment.MIDDLE_CENTER);

		date = new DateField();
		date.setWidth("360px");
		datePosition.addComponent(date);
		datePosition.setComponentAlignment(date, Alignment.MIDDLE_CENTER);

		lname = new Label("Bezeichnung");
		super.content.addComponent(lname);
		super.content.setComponentAlignment(lname, Alignment.MIDDLE_CENTER);
		
		name = new TextField();
		name.setWidth("500px");
		super.content.addComponent(name);
		super.content.setComponentAlignment(name, Alignment.MIDDLE_CENTER);

		newText = new RichTextArea();
		newText.setWidth("500px");
		newText.setHeight("500px");
		super.content.addComponent(newText);
		super.content.setComponentAlignment(newText, Alignment.MIDDLE_CENTER);

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

	/**
	 * The public method getTFValue gives the text from the diary text record
	 * @return diary text
	 */
	public String getTFValue() {
		String cont = newText.getValue();
		return cont;
	}

	/**
	 * The public method getNameValue gives the value of name of the activity
	 * @return - value of the name 
	 */
	public String getNameValue() {
		String cont = name.getValue();
		return cont;
	}

	/**
	 * the public method getDateValue gives the recording date
	 * @return - recording date
	 */
	public String getDateValue() {
     
		String d =  date.getValue().toString();
		return d;
     
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
