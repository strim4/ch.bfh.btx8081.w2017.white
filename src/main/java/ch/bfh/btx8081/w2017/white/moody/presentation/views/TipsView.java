package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * 
 * @author Chantal
 * Last Edit: 10.12.17
 */
@SuppressWarnings("serial")
public class TipsView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	public TipsView() {
		
		super();
		super.setTitle("Tipps");
		this.createFutureContent();
	}
	
	/**
	 * The private method createFutureContent is for the following content.
	 */
	private void createFutureContent() {
		
		Label future = new Label("Auf dieser Seite kommen bald nuetzliche Tipps ;)");
		super.content.addComponent(future);
		super.content.setComponentAlignment(future, Alignment.MIDDLE_CENTER);
		
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
