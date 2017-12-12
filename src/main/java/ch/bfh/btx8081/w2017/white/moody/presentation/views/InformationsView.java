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
public class InformationsView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	public InformationsView() {
		
		super();
		super.setTitle("Informationen");
		this.createFutureContent();
	}
	
	private void createFutureContent() {
		
		Label future = new Label("Auf dieser Seite kommen bald Informationen ueber Depressionen ;)");
		super.content.addComponent(future);
		super.content.setComponentAlignment(future, Alignment.MIDDLE_CENTER);
		
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