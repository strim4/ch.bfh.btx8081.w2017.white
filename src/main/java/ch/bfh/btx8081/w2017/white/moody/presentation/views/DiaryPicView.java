package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class shows the creation of a new Diary Picture Element.
 * 
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryPicView extends DiaryView implements MoodyView{
	
//	private static final String BUTTON_SAVE = "SAVE";
//	private static final String BUTTON_DELETE = "DELETE";
//	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	public DiaryPicView(){
		
		super();
		super.setTitle("Neuer Fotoeintrag");
		
		super.content.removeAllComponents();
		
		this.createButtons();
		
	}
	
	private void createButtons(){
		
		HorizontalLayout datePosition = new HorizontalLayout();
		super.content.addComponent(datePosition);
		super.content.setComponentAlignment(datePosition, Alignment.MIDDLE_CENTER);
		Label dateL = new Label("Datum auswählen: ");
		datePosition.addComponent(dateL);
		datePosition.setComponentAlignment(dateL, Alignment.MIDDLE_CENTER);
		
		DateField date = new DateField();
		date.setWidth("350px");
		datePosition.addComponent(date);
		datePosition.setComponentAlignment(date, Alignment.MIDDLE_CENTER);
		
		//Foto Upload
		Label foto = new Label("Foto-Upload");
		super.content.addComponent(foto);
		super.content.setComponentAlignment(foto, Alignment.MIDDLE_CENTER);
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);
		
		Button buttonSave = new Button("Speichern");//Text entfernen, sobald Icon funktioniert
		buttonSave.addClickListener(this);
		buttonSave.setId("buttonSave");
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		//buttonSave.setIcon(new ThemeResource("images/saveIcon.png"), BUTTON_SAVE);
		menue.addComponent(buttonSave);
		menue.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);
	
		Button buttonDelete = new Button("Abbruch");//Text entfernen, sobald Icon funktioniert
		buttonDelete.addClickListener(this);
		buttonDelete.setId("buttonDelete");
		buttonDelete.setWidth(BUTTON_WIDTH);
		buttonDelete.setHeight(BUTTON_HEIGHT);
		//buttonDelete.setIcon(new ThemeResource("images/deleteIcon.png"), BUTTON_DELETE);
		menue.addComponent(buttonDelete);
		menue.setComponentAlignment(buttonDelete, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("Zurück");//Text entfernen, sobald Icon funktioniert
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
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