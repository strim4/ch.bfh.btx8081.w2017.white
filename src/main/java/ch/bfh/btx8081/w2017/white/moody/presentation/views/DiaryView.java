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
 * This class is the view of the Diary screen
 * and on this screen the user can create new Diary Elements 
 * or open the list of the already recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 03.12.17
 */

@SuppressWarnings("serial")
public class DiaryView extends BaseView implements MoodyView{
	
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	Button buttonText;
	Button buttonPic;
	Button buttonActivity;
	Button buttonList;
	Button buttonBack;
	
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
		
		Button buttonText = new Button("");
		buttonText.addClickListener(this);
		buttonText.setId("buttonText");
		buttonText.setWidth(BUTTON_WIDTH);
		buttonText.setHeight(BUTTON_HEIGHT);
		buttonText.setIcon(new FileResource(new File(basepath + "/VAADIN/images/textIcon.png")));
		newDiaryElement.addComponent(buttonText);
		newDiaryElement.setComponentAlignment(buttonText, Alignment.MIDDLE_CENTER);
	
		Button buttonPic = new Button("");
		buttonPic.addClickListener(this);
		buttonPic.setId("buttonPic");
		buttonPic.setWidth(BUTTON_WIDTH);
		buttonPic.setHeight(BUTTON_HEIGHT);
		buttonPic.setIcon(new FileResource(new File(basepath + "/VAADIN/images/picIcon.png")));
		newDiaryElement.addComponent(buttonPic);
		newDiaryElement.setComponentAlignment(buttonPic, Alignment.MIDDLE_CENTER);
	
		Button buttonActivity = new Button("");
		buttonActivity.addClickListener(this);
		buttonActivity.setId("buttonActivity");
		buttonActivity.setWidth(BUTTON_WIDTH);
		buttonActivity.setHeight(BUTTON_HEIGHT);
		buttonActivity.setIcon(new FileResource(new File(basepath + "/VAADIN/images/activityIcon.png")));
		newDiaryElement.addComponent(buttonActivity);
		newDiaryElement.setComponentAlignment(buttonActivity, Alignment.MIDDLE_CENTER);
	
		Button buttonList = new Button("");
		buttonList.addClickListener(this);
		buttonList.setId("buttonList");
		buttonList.setWidth("380px");
		buttonList.setHeight(BUTTON_HEIGHT);
		buttonList.setIcon(new FileResource(new File(basepath + "/VAADIN/images/listIcon.png")));
		super.content.addComponent(buttonList);
		super.content.setComponentAlignment(buttonList, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("380px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
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
