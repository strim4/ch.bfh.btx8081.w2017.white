package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPresenter;

/**
 * This class is the view of the Diary screen
 * and on this screen the user can create new Diary Elements 
 * or open the list of the already recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 29.11.17
 */

public class DiaryView extends BaseView{
	
	private DiaryPresenter presenter = null;
	
	private static final String BUTTON_BACK = "BACK";
	private static final String BUTTON_TEXT = "TEXT";
	private static final String BUTTON_PIC = "PICTURE";
	private static final String BUTTON_ACTIVITY = "ACTIVITY";
	private static final String BUTTON_LIST = "LIST";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	public DiaryView(){
		super();
		super.setTitle("Tagebuch");
		
		this.createButtons();
	}
	
	@SuppressWarnings("serial")
	private void createButtons(){
		
		HorizontalLayout newDiaryElement = new HorizontalLayout();
		super.content.addComponent(newDiaryElement);
		super.setComponentAlignment(newDiaryElement, Alignment.MIDDLE_CENTER);
		
		Button buttonText = new Button("Neuer Text-Eintrag");//Text entfernen, sobal Icon funktioniert
		//buttonText.addClickListener(this);
		buttonText.setId("buttonText");
		buttonText.setWidth(BUTTON_WIDTH);
		buttonText.setHeight(BUTTON_HEIGHT);
		//buttonText.setIcon(new ThemeResource("images/textIcon.png"), BUTTON_TEXT);
		newDiaryElement.addComponent(buttonText);
		newDiaryElement.setComponentAlignment(buttonText, Alignment.MIDDLE_CENTER);
	
		Button buttonPic = new Button("Neuer Foto-Eintrag"); //Text entfernen, sobal Icon funktioniert
		//buttonPic.addClickListener(this);
		buttonPic.setId("buttonPic");
		buttonPic.setWidth(BUTTON_WIDTH);
		buttonPic.setHeight(BUTTON_HEIGHT);
		//buttonPic.setIcon(new ThemeResource("images/picIcon.png"), BUTTON_PIC);
		newDiaryElement.addComponent(buttonPic);
		newDiaryElement.setComponentAlignment(buttonPic, Alignment.MIDDLE_CENTER);
	
		Button buttonActivity = new Button("Neuer Aktivitäts-Eintrag");//Text entfernen, sobal Icon funktioniert
		//buttonActivity.addClickListener(this);
		buttonActivity.setId("buttonActivity");
		buttonActivity.setWidth(BUTTON_WIDTH);
		buttonActivity.setHeight(BUTTON_HEIGHT);
		//buttonActivity.setIcon(new ThemeResource("images/activityIcon.png"), BUTTON_ACTIVITY);
		newDiaryElement.addComponent(buttonActivity);
		newDiaryElement.setComponentAlignment(buttonActivity, Alignment.MIDDLE_CENTER);
	
		Button buttonList = new Button("Alte Einträge");//Text entfernen, sobal Icon funktioniert
		//buttonList.addClickListener(this);
		buttonList.setId("buttonList");
		buttonList.setWidth("500px");
		buttonList.setHeight(BUTTON_HEIGHT);
		//buttonList.setIcon(new ThemeResource("images/listIcon.png"), BUTTON_LIST);
		super.content.addComponent(buttonList);
		super.content.setComponentAlignment(buttonList, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("Zurück");//Text entfernen, sobal Icon funktioniert
		//buttonList.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("500px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	
	}
	
	//public void enter()
		
//	GridLayout layout = new GridLayout(3, 4); //first columns, than rows
//	Label diary = new Label("Tagebuch");
//	layout.addComponent(diary, 2, 1);
//	
//	/**
//	 * Buttons for new Diary Input
//	 */
//	Button newText = new Button("Neuer Text");
//	Button newPic = new Button("Neues Foto");
//	Button newActivity = new Button("Neue Aktivitaet");
//	Button ListDiaryElements = new Button("Alte Eintraege");
//	
//
//	layout.addComponent(newText, 1, 2);
//	layout.setComponentAlignment(newText, Alignment.TOP_CENTER);
//	layout.addComponent(newPic, 2, 2);
//	layout.setComponentAlignment(newPic, Alignment.TOP_CENTER);
//	layout.addComponent(newActivity, 3, 2);
//	layout.setComponentAlignment(newActivity, Alignment.TOP_CENTER);
//	layout.addComponent(ListDiaryElements, 1, 3);
//	layout.setComponentAlignment(ListDiaryElements, Alignment.TOP_CENTER);
//	
//	Button back = new Button("Zurueck"); //Back to Main View
//	layout.addComponent(back, 1, 4);
//	layout.setComponentAlignment(back, Alignment.TOP_CENTER);
//	
//	// TODO Handling click event
//	
//	}
}
