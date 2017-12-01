package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This Class shows a list of the recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends DiaryView implements MoodyView{
	
//	private static final String BUTTON_BACK = "BACK";
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	public DiaryElementListView(){
		super();
		super.setTitle("Alte Einträge");
		
		super.content.removeAllComponents();
		
		this.createButtons();
	}
	
	private void createButtons(){
		
		//TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages --> DiaryElementView
		
		Button buttonBack = new Button("Zurück");//Text entfernen, sobald Icon funktioniert
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
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
