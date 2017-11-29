package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This Class shows a list of the recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 29.11.17
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends DiaryView{
	
	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	public DiaryElementListView(){
		super();
		super.setTitle("Alte Eintraege");
		
		//TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages --> DiaryElementView
		
		this.createButtons();
	}
	
	private void createButtons(){
		
		Button buttonBack = new Button("Zurück");//Text entfernen, sobald Icon funktioniert
		//buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);

//		GridLayout layout = new GridLayout(1, 2);
//		Label diarylist = new Label("Alte Eintraege");
//		layout.addComponent(diarylist, 1, 1);
//		
//		//TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages --> DiaryElementView
//		
//		Button back = new Button("Zurueck"); // Back to DiaryView
//		layout.addComponent(back, 1, 2);
	}
}
