package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.VaadinService;
import com.vaadin.shared.Position;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ActivityEntries;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.SubWindowPresenter;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class SubWindowView extends Window implements MoodyView {

	private TextField tf = new TextField();

	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	//private Button hz = new Button("Hinzufügen");
	
	public SubWindowView() {

		VerticalLayout vl = new VerticalLayout();
		this.setContent(vl);
		vl.addComponent(new Label("Neue Aktivität hinzufügen:"));
		vl.addComponent(tf);
	
		
			Button hz = new Button("Hinzufügen", new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					ActivityEntries a = new ActivityEntries();
					a.creatAcEn(tf.getValue());
					Notification saved = new Notification("");
					saved.setPosition(Position.BOTTOM_CENTER);
					saved.show("Eintrag gespeichert");
					
				}
			}) ; 
			
			hz.setId("add");
			hz.addClickListener(this);
		    vl.addComponent(hz);
	    
	    // center the subwindow
	    this.center();
	    
	    // set height and width
	    vl.setHeight("150px");
	    vl.setWidth("350px");
	    
	    
	}
	
	public String getActivityValue() {
		String a = tf.getValue();
		return a;
	}
	
	
	
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
