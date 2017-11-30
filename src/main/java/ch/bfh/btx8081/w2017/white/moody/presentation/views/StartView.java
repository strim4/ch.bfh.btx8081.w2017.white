package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * Main View of the Web-App Moody.
 * @author Chantal
 * Last edit: 30.11.17
 */
@SuppressWarnings("serial")
public class StartView extends BaseView implements MoodyView{
	
//	private static final String BUTTON_DIARY = "DIARY";
//	private static final String BUTTON_CONTACT = "CONTACT";
//	private static final String BUTTON_BAROMETER = "BAROMETER";
//	private static final String BUTTON_EXERCISES = "EXERCISES";
//	private static final String BUTTON_INFORMATIONS = "INFORMATIONS";
//	private static final String BUTTON_TIPS = "TIPS";
//	private static final String BUTTON_SETTINGS = "SETTINGS";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private List<ViewListener> listeners= new ArrayList<ViewListener>();
	
	public StartView(){
		
		super();
		super.setTitle("Moody");
		
		this.createButtons();
		
		super.setLayouts(0.35f, 0.65f, 0, 0);
	}
	
	private void createButtons(){
		
		HorizontalLayout row1 = new HorizontalLayout();
		super.content.addComponent(row1);
		super.content.setComponentAlignment(row1, Alignment.MIDDLE_CENTER);
		HorizontalLayout row2 = new HorizontalLayout();
		super.content.addComponent(row2);
		super.content.setComponentAlignment(row2, Alignment.MIDDLE_CENTER);
		
		//Button for diary
		Button buttonDiary = new Button("Tagebuch");//Text entfernen, sobald Icon funktioniert
		buttonDiary.addClickListener(this);
		buttonDiary.setId("buttonDiary");
		buttonDiary.setWidth(BUTTON_WIDTH);
		buttonDiary.setHeight(BUTTON_HEIGHT);
		//buttonDiary.setIcon(new ThemeResource("images/diaryIcon.png"), BUTTON_DIARY);
		row1.addComponent(buttonDiary);
		row1.setComponentAlignment(buttonDiary, Alignment.MIDDLE_CENTER);
		
		//Button for emergency contact
		Button buttonContact = new Button("Notfall");//Text entfernen, sobald Icon funktioniert
		buttonContact.addClickListener(this);
		buttonContact.setId("buttonContact");
		buttonContact.setWidth(BUTTON_WIDTH);
		buttonContact.setHeight(BUTTON_HEIGHT);
		//buttonContact.setIcon(new ThemeResource("images/contactIcon.png"), BUTTON_CONTACT);
		row1.addComponent(buttonContact);
		row1.setComponentAlignment(buttonContact, Alignment.MIDDLE_CENTER);

		//Button for mood barometer
		Button buttonBarometer = new Button("Barometer");	//Text entfernen, sobald Icon funktioniert
		buttonBarometer.addClickListener(this);
		buttonBarometer.setId("buttonBarometer");
		buttonBarometer.setWidth(BUTTON_WIDTH);
		buttonBarometer.setHeight(BUTTON_HEIGHT);
		//buttonBarometer.setIcon(new ThemeResource("images/barometerIcon.png"), BUTTON_BAROMETER);
		row1.addComponent(buttonBarometer);
		row1.setComponentAlignment(buttonBarometer, Alignment.MIDDLE_CENTER);

		//Button for relaxing exercises
		Button buttonExercises = new Button("Uebungen");//Text entfernen, sobald Icon funktioniert
		buttonExercises.addClickListener(this);
		buttonExercises.setId("buttonExercises");
		buttonExercises.setWidth(BUTTON_WIDTH);
		buttonExercises.setHeight(BUTTON_HEIGHT);
		//buttonExercises.setIcon(new ThemeResource("images/exerciseIcon.png"), BUTTON_EXERCISES);
		row2.addComponent(buttonExercises);
		row2.setComponentAlignment(buttonExercises, Alignment.MIDDLE_CENTER);

		//Button for informations about depression
		Button buttonInformations = new Button("Informationen");//Text entfernen, sobald Icon funktioniert
		buttonInformations.addClickListener(this);
		buttonInformations.setId("buttonInformations");
		buttonInformations.setWidth(BUTTON_WIDTH);
		buttonInformations.setHeight(BUTTON_HEIGHT);
		//buttonInformations.setIcon(new ThemeResource("images/infoIcon.png"), BUTTON_INFORMATIONS);
		row2.addComponent(buttonInformations);
		row2.setComponentAlignment(buttonInformations, Alignment.MIDDLE_CENTER);

		//Button for tips
		Button buttonTips = new Button("Tipps");//Text entfernen, sobald Icon funktioniert
		buttonTips.addClickListener(this);
		buttonTips.setId("buttonTips");
		buttonTips.setWidth(BUTTON_WIDTH);
		buttonTips.setHeight(BUTTON_HEIGHT);
		//buttonTips.setIcon(new ThemeResource("images/tipsIcon.png"), BUTTON_TIPS);
		row2.addComponent(buttonTips);
		row2.setComponentAlignment(buttonTips, Alignment.MIDDLE_CENTER);

		//Button for general settings
		Button buttonSettings = new Button("Einstellungen");//Text entfernen, sobald Icon funktioniert
		buttonSettings.addClickListener(this);
		buttonSettings.setId("buttonSettings");
		buttonSettings.setWidth("500px");
		buttonSettings.setHeight(BUTTON_HEIGHT);
		//buttonSettings.setIcon(new ThemeResource("images/settingsIcon.png"), BUTTON_SETTINGS);
		super.content.addComponent(buttonSettings);
		super.content.setComponentAlignment(buttonSettings, Alignment.MIDDLE_CENTER);

	}

	public void addListener(ViewListener listener){
		listeners.add(listener);
	}
	
	public void buttonClick(ClickEvent event){
		for(ViewListener listener : this.listeners){
			listener.buttonClick(event);
		}
	}

}
