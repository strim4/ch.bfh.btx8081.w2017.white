package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * Main View of the Web-App Moody.
 * @author Chantal
 * Last edit: 03.12.17
 */
@SuppressWarnings("serial")
public class StartView extends BaseView implements MoodyView{
		
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";
	
	private List<ViewListener> listeners= new ArrayList<ViewListener>();
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	Button buttonDiary;
	Button buttonContact;
	Button buttonBarometer;
	Button buttonExercises;
	Button buttonInformations;
	Button buttonTips;
	Button buttonSettings;
	
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
		Button buttonDiary = new Button("");
		buttonDiary.addClickListener(this);
		buttonDiary.setId("buttonDiary");
		buttonDiary.setWidth(BUTTON_WIDTH);
		buttonDiary.setHeight(BUTTON_HEIGHT);
		buttonDiary.setIcon(new FileResource(new File(basepath + "/VAADIN/images/diaryIcon.png")));
		row1.addComponent(buttonDiary);
		row1.setComponentAlignment(buttonDiary, Alignment.MIDDLE_CENTER);
		
		//Button for emergency contact
		Button buttonContact = new Button("");
		buttonContact.addClickListener(this);
		buttonContact.setId("buttonContact");
		buttonContact.setWidth(BUTTON_WIDTH);
		buttonContact.setHeight(BUTTON_HEIGHT);
		buttonContact.setIcon(new FileResource(new File(basepath + "/VAADIN/images/contactIcon.png")));
		row1.addComponent(buttonContact);
		row1.setComponentAlignment(buttonContact, Alignment.MIDDLE_CENTER);

		//Button for mood barometer
		Button buttonBarometer = new Button("");
		buttonBarometer.addClickListener(this);
		buttonBarometer.setId("buttonBarometer");
		buttonBarometer.setWidth(BUTTON_WIDTH);
		buttonBarometer.setHeight(BUTTON_HEIGHT);
		buttonBarometer.setIcon(new FileResource(new File(basepath + "/VAADIN/images/barometerIcon.png")));
		row1.addComponent(buttonBarometer);
		row1.setComponentAlignment(buttonBarometer, Alignment.MIDDLE_CENTER);

		//Button for relaxing exercises
		Button buttonExercises = new Button("");
		buttonExercises.addClickListener(this);
		buttonExercises.setId("buttonExercises");
		buttonExercises.setWidth(BUTTON_WIDTH);
		buttonExercises.setHeight(BUTTON_HEIGHT);
		buttonExercises.setIcon(new FileResource(new File(basepath + "/VAADIN/images/exerciseIcon.png")));
		row2.addComponent(buttonExercises);
		row2.setComponentAlignment(buttonExercises, Alignment.MIDDLE_CENTER);

		//Button for informations about depression
		Button buttonInformations = new Button("");
		buttonInformations.addClickListener(this);
		buttonInformations.setId("buttonInformations");
		buttonInformations.setWidth(BUTTON_WIDTH);
		buttonInformations.setHeight(BUTTON_HEIGHT);
		buttonInformations.setIcon(new FileResource(new File(basepath + "/VAADIN/images/infoIcon.png")));
		row2.addComponent(buttonInformations);
		row2.setComponentAlignment(buttonInformations, Alignment.MIDDLE_CENTER);

		//Button for tips
		Button buttonTips = new Button("");
		buttonTips.addClickListener(this);
		buttonTips.setId("buttonTips");
		buttonTips.setWidth(BUTTON_WIDTH);
		buttonTips.setHeight(BUTTON_HEIGHT);
		buttonTips.setIcon(new FileResource(new File(basepath + "/VAADIN/images/tipsIcon.png")));
		row2.addComponent(buttonTips);
		row2.setComponentAlignment(buttonTips, Alignment.MIDDLE_CENTER);

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
