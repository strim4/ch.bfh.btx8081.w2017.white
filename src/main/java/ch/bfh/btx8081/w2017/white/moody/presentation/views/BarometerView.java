package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class is the view of the Mood-Barometer
 * 
 * @author Milena
 * Last Edit: 01.12.17
 */

@SuppressWarnings("serial")
public class BarometerView extends BaseView implements MoodyView{
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	public BarometerView(){
		
		super();
		super.setTitle("Barometer");
		
		this.createButtons();
		
		super.setLayouts(0.35f, 0.65f, 0, 0);
	}
	
	
	private void createButtons(){
		
		HorizontalLayout newBarometerElement = new HorizontalLayout();
		super.content.addComponent(newBarometerElement);
		super.content.setComponentAlignment(newBarometerElement, Alignment.MIDDLE_CENTER);
		
		Button buttonQuestions = new Button("Tägliche Fragen");//Text entfernen, sobal Icon funktioniert
		buttonQuestions.addClickListener(this);
		buttonQuestions.setId("buttonQuestions");
		buttonQuestions.setWidth("500px");
		buttonQuestions.setHeight(BUTTON_HEIGHT);
		//buttonQuestions.setIcon(new ThemeResource("images/Questions.png"), BUTTON_TEXT); Es besteht noch kein Image
		newBarometerElement.addComponent(buttonQuestions);
		newBarometerElement.setComponentAlignment(buttonQuestions, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("Zurück");//Text entfernen, sobal Icon funktioniert
		buttonBack.addClickListener(this);
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
