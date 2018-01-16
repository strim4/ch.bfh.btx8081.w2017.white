package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * The Exercises View shows a relaxing breath exercise.
 * @author Chantal
 * Last Edit: 16.01.18
 */
@SuppressWarnings("serial")
public class ExercisesView extends BaseView implements MoodyView {
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	public ExercisesView() {
		
		super();
		super.setTitle("Uebungen");
		this.createFutureContent();
	}
	
	/**
	 * The private method createFutureContent is for the following content.
	 */
	private void createFutureContent() {
		
		Label future = new Label("Auf dieser Seite kommen bald hilfreihe Anleitungen zu Entspannungsuebeungen ;)");
		super.content.addComponent(future);
		super.content.setComponentAlignment(future, Alignment.MIDDLE_CENTER);
		
		//TODO Exercise Content with Video
	}
	
    /**
     * The public method addListener adds objects to the listener.
     */
	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);	
	}

	/**
	 * The public method buttonClick handles the click event.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		for (ViewListener listener : this.listeners) {
			listener.buttonClick(event);
		}
	}
}
