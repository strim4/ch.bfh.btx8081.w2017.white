package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class shows the creation of a new Activity in the Diary.
 * 
 * @author Chantal
 * Last edit: 29.11.17
 */

@SuppressWarnings("serial")
public class ActivityView extends DiaryView{
	
	private static final String BUTTON_SAVE = "SAVE";
	private static final String BUTTON_DELETE = "DELETE";
	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	public ActivityView(){
		super();
		super.setTitle("Neue Aktivitaet");
		
		this.createButtons();
	}
	
	private void createButtons(){
		
		Label date = new Label("Datum");
		super.content.addComponent(date);
		super.content.setComponentAlignment(date, Alignment.MIDDLE_CENTER);
		
//		//Aktivitaet auswaehlen

		Button newActivity = new Button("Neue erstellen", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub	
			}
		});
		newActivity.setWidth(BUTTON_WIDTH);
		newActivity.setHeight(BUTTON_HEIGHT);
		super.content.addComponent(newActivity);
		super.content.setComponentAlignment(newActivity, Alignment.MIDDLE_CENTER);
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);
		
		Button buttonSave = new Button("Speichern", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO		
			}
		});
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		//buttonSave.setIcon(new ThemeResource("images/saveIcon.png"), BUTTON_SAVE);
		menue.addComponent(buttonSave);
		menue.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);
	
		Button buttonDelete = new Button("Abbruch", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO	
			}
		});
		buttonDelete.setWidth(BUTTON_WIDTH);
		buttonDelete.setHeight(BUTTON_HEIGHT);
		//buttonDelete.setIcon(new ThemeResource("images/deleteIcon.png"), BUTTON_DELETE);
		menue.addComponent(buttonDelete);
		menue.setComponentAlignment(buttonDelete, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("Zurück", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO		
			}
		});
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		menue.addComponent(buttonBack);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	
//		GridLayout layout = new GridLayout(1, 5);
//		Label activity = new Label("Neue Aktivitaet");
//		layout.addComponent(activity, 1, 1);
//		
//		Label date = new Label();//Datum vom System nehmen, spaeter dann auch zurueckversetzten moeglich
//		layout.addComponent(date, 1, 2);
//		//Aktivitaet auswaehlen
//		//layout.addComponent(component, 1, 3);
//		Button newActivity = new Button("Neue erstellen");
//		layout.addComponent(newActivity, 1, 4);
//		
//		//Save or Cancel the new Diary Input
//		Button save = new Button("Speichern");
//		layout.addComponent(save, 1, 5);
//		Button cancel = new Button("Abbrechen");
//		layout.addComponent(cancel, 2, 5);
	}
}
