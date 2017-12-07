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
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class shows a selected Diary Element of the Diary Element List.
 * The Element could be an activity, a text or a picture element of the diary.
 * 
 * @author Chantal
 * Last edit: 03.12.17
 *
 */
@SuppressWarnings("serial")
public class DiaryElementView extends BaseView implements MoodyView{
		
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	Label dateL;
	Button buttonDelete;
	Button buttonBack;
	
	public DiaryElementView(){
		
		super();
		super.setTitle("Tagebuch-Eintrag");
		this.createButtons();
	}
	
	private void createButtons(){
		
		//Ansicht Eintrag
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);
		
		Label dateL = new Label("Datum: ");
		super.content.addComponent(dateL);
		super.content.setComponentAlignment(dateL, Alignment.MIDDLE_CENTER);
		
		Button buttonDelete = new Button("");
		buttonDelete.addClickListener(this);
		buttonDelete.setId("buttonDelete");
		buttonDelete.setWidth(BUTTON_WIDTH);
		buttonDelete.setHeight(BUTTON_HEIGHT);
		buttonDelete.setIcon(new FileResource(new File(basepath + "/VAADIN/images/deleteIcon.png")));
		menue.addComponent(buttonDelete);
		menue.setComponentAlignment(buttonDelete, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		menue.addComponent(buttonBack);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	
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
