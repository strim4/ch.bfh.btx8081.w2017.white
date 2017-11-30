package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class is the view of the Diary screen
 * and on this screen the user can create new Diary Elements 
 * or open the list of the already recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryView extends BaseView implements MoodyView{
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	public DiaryView(){
		
		super();
		super.setTitle("Tagebuch");
		
		this.createButtons();
		
		super.setLayouts(0.35f, 0.65f, 0, 0);
	}
	
	
	private void createButtons(){
		
		HorizontalLayout newDiaryElement = new HorizontalLayout();
		super.content.addComponent(newDiaryElement);
		super.content.setComponentAlignment(newDiaryElement, Alignment.MIDDLE_CENTER);
		
		Button buttonText = new Button("Neuer Text");//Text entfernen, sobal Icon funktioniert
		buttonText.addClickListener(this);
		buttonText.setId("buttonText");
		buttonText.setWidth(BUTTON_WIDTH);
		buttonText.setHeight(BUTTON_HEIGHT);
		//buttonText.setIcon(new ThemeResource("images/textIcon.png"), BUTTON_TEXT);
		newDiaryElement.addComponent(buttonText);
		newDiaryElement.setComponentAlignment(buttonText, Alignment.MIDDLE_CENTER);
	
		Button buttonPic = new Button("Neues Foto"); //Text entfernen, sobal Icon funktioniert
		buttonPic.addClickListener(this);
		buttonPic.setId("buttonPic");
		buttonPic.setWidth(BUTTON_WIDTH);
		buttonPic.setHeight(BUTTON_HEIGHT);
		//buttonPic.setIcon(new ThemeResource("images/picIcon.png"), BUTTON_PIC);
		newDiaryElement.addComponent(buttonPic);
		newDiaryElement.setComponentAlignment(buttonPic, Alignment.MIDDLE_CENTER);
	
		Button buttonActivity = new Button("Neuer Aktivitaet");//Text entfernen, sobal Icon funktioniert
		buttonActivity.addClickListener(this);
		buttonActivity.setId("buttonActivity");
		buttonActivity.setWidth(BUTTON_WIDTH);
		buttonActivity.setHeight(BUTTON_HEIGHT);
		//buttonActivity.setIcon(new ThemeResource("images/activityIcon.png"), BUTTON_ACTIVITY);
		newDiaryElement.addComponent(buttonActivity);
		newDiaryElement.setComponentAlignment(buttonActivity, Alignment.MIDDLE_CENTER);
	
		Button buttonList = new Button("Alte Eintraege");//Text entfernen, sobal Icon funktioniert
		buttonList.addClickListener(this);
		buttonList.setId("buttonList");
		buttonList.setWidth("500px");
		buttonList.setHeight(BUTTON_HEIGHT);
		//buttonList.setIcon(new ThemeResource("images/listIcon.png"), BUTTON_LIST);
		super.content.addComponent(buttonList);
		super.content.setComponentAlignment(buttonList, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("Zurueck");//Text entfernen, sobal Icon funktioniert
		buttonList.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("500px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	
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
