package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.IStartPresenter;

@SuppressWarnings("serial")
public class StartView extends BaseView{
	
	private static final String BUTTON_DIARY = "DIARY";
	private static final String BUTTON_CONTACT = "CONTACT";
	private static final String BUTTON_BAROMETER = "BAROMETER";
	private static final String BUTTON_EXERCISES = "EXERCISES";
	private static final String BUTTON_INFORMATIONS = "INFORMATIONS";
	private static final String BUTTON_TIPS = "TIPS";
	private static final String BUTTON_SETTINGS = "SETTINGS";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	//private IStartPresenter presenter = null;
	
	public StartView(){
		
		super();
		super.setTitle("Moody Menue");
		
		this.createButtons();
		
		super.setLayouts(0.35f, 0.65f, 0, 0);
	}
	
	private void createButtons(){
		
		//Button for diary
		Button buttonDiary = new Button("", new Button.ClickListener() {	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		buttonDiary.setWidth(BUTTON_WIDTH);
		buttonDiary.setHeight(BUTTON_HEIGHT);
		buttonDiary.setIcon(new ThemeResource("images/diaryIcon.png"), BUTTON_DIARY);
		super.content.addComponent(buttonDiary);
		super.content.setComponentAlignment(buttonDiary, Alignment.MIDDLE_CENTER);
		
		//Button for emergency contact
		Button buttonContact = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		buttonContact.setWidth(BUTTON_WIDTH);
		buttonContact.setHeight(BUTTON_HEIGHT);
		buttonContact.setIcon(new ThemeResource("images/contactIcon.png"), BUTTON_CONTACT);
		super.content.addComponent(buttonContact);
		super.content.setComponentAlignment(buttonContact, Alignment.MIDDLE_CENTER);

		//Button for mood barometer
		Button buttonBarometer = new Button("", new Button.ClickListener() {		
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		buttonBarometer.setWidth(BUTTON_WIDTH);
		buttonBarometer.setHeight(BUTTON_HEIGHT);
		buttonBarometer.setIcon(new ThemeResource("images/barometerIcon.png"), BUTTON_BAROMETER);
		super.content.addComponent(buttonBarometer);
		super.content.setComponentAlignment(buttonBarometer, Alignment.MIDDLE_CENTER);

		//Button for relaxing exercises
		Button buttonExercises = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		buttonExercises.setWidth(BUTTON_WIDTH);
		buttonExercises.setHeight(BUTTON_HEIGHT);
		buttonExercises.setIcon(new ThemeResource("images/exerciseIcon.png"), BUTTON_EXERCISES);
		super.content.addComponent(buttonExercises);
		super.content.setComponentAlignment(buttonExercises, Alignment.MIDDLE_CENTER);

		//Button for informations about depression
		Button buttonInformations = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		buttonInformations.setWidth(BUTTON_WIDTH);
		buttonInformations.setHeight(BUTTON_HEIGHT);
		buttonInformations.setIcon(new ThemeResource("images/infoIcon.png"), BUTTON_INFORMATIONS);
		super.content.addComponent(buttonInformations);
		super.content.setComponentAlignment(buttonInformations, Alignment.MIDDLE_CENTER);

		//Button for tips
		Button buttonTips = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			}
		});
		buttonTips.setWidth(BUTTON_WIDTH);
		buttonTips.setHeight(BUTTON_HEIGHT);
		buttonTips.setIcon(new ThemeResource("images/tipsIcon.png"), BUTTON_TIPS);
		super.content.addComponent(buttonTips);
		super.content.setComponentAlignment(buttonTips, Alignment.MIDDLE_CENTER);

		//Button for general settings
		Button buttonSettings = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			}
		});
		buttonSettings.setWidth(BUTTON_WIDTH);
		buttonSettings.setHeight(BUTTON_HEIGHT);
		buttonSettings.setIcon(new ThemeResource("images/settingsIcon.png"), BUTTON_SETTINGS);
		super.content.addComponent(buttonSettings);
		super.content.setComponentAlignment(buttonSettings, Alignment.MIDDLE_CENTER);

	}
	
	public void enter(ViewChangeEvent event){
		
	}

    public void addStartViewPresenter(IStartPresenter p) {
        //this.presenter = p;
    }
}
