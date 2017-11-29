package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class shows a selected Diary Element of the Diary Element List.
 * The Element could be an activity, a text or a picture element of the diary.
 * 
 * @author Chantal
 * Last edit: 29.11.17
 *
 */
@SuppressWarnings("serial")
public class DiaryElementView extends DiaryView{
	
	private static final String BUTTON_DELETE = "DELETE";
	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	public DiaryElementView(){
		super();
		super.setTitle("Tagebuch-Eintrag");
		
		//Ansicht Eintrag
		
		this.createButtons();
	}
	
	private void createButtons(){
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);
		
		Button buttonDelete = new Button("Löschen", new Button.ClickListener() {//Text entfernen, sobald Icons funktionieren
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
	
		Button buttonBack = new Button("Zurück", new Button.ClickListener() {//Text entfernen, sobald Icons funktionieren
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
	
		
//		GridLayout layout = new GridLayout(1, 2);
//		Label diaryElement = new Label("Ausgewaehlter Eintrag");
//		layout.addComponent(diaryElement, 1, 1);
//		
//		Button back = new Button("Zurueck"); // Back to DiaryElementListView
//		layout.addComponent(back, 1, 2);
	}

}
