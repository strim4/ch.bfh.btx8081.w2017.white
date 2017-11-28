package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class shows the creation of a new Diary Text Element.
 * 
 * @author Chantal
 * Last edit: 26.11.17
 */

@SuppressWarnings("serial")
public class DiaryTextView extends DiaryView{

	private static final String BUTTON_SAVE = "SAVE";
	private static final String BUTTON_DELETE = "DELETE";
	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	public DiaryTextView(){
		super();
		super.setTitle("Neuer Texteintrag");
		
		this.createButtons();
	}
	
	private void createButtons(){
		
		Label date = new Label();
		super.content.addComponent(date);
		super.content.setComponentAlignment(date, Alignment.MIDDLE_LEFT);
		
		TextField newText = new TextField();
		super.content.addComponent(newText);
		super.content.setComponentAlignment(newText, Alignment.MIDDLE_LEFT);
		
		Button buttonSave = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO		
			}
		});
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		buttonSave.setIcon(new ThemeResource("images/saveIcon.png"), BUTTON_SAVE);
		super.content.addComponent(buttonSave);
		super.content.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);
	
		Button buttonDelete = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO	
			}
		});
		buttonDelete.setWidth(BUTTON_WIDTH);
		buttonDelete.setHeight(BUTTON_HEIGHT);
		buttonDelete.setIcon(new ThemeResource("images/deleteIcon.png"), BUTTON_DELETE);
		super.content.addComponent(buttonDelete);
		super.content.setComponentAlignment(buttonDelete, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO		
			}
		});
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	
	}
//	GridLayout layout = new GridLayout(1, 4);
//	Label diaryText = new Label("Neuer Texteintrag");
//	layout.addComponent(diaryText, 1, 1);
//	
//	Label date = new Label();
//	layout.addComponent(date, 1, 2);
//	TextField newText = new TextField();
//	layout.addComponent(newText, 1, 3);
//	
//	
//	//Save or Cancel the new Diary Input
//	Button save = new Button("Speichern");
//	layout.addComponent(save, 1, 4);
//	Button cancel = new Button("Abbrechen");
//	layout.addComponent(cancel, 2, 4);
}
