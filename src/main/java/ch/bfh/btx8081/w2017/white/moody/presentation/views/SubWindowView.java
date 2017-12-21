package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class SubWindowView extends Window {

	
	
	public SubWindowView() {
		VerticalLayout vl = new VerticalLayout();
		this.setContent(vl);
		vl.addComponent(new Label("Neue Aktivität hinzufügen:"));
		vl.addComponent(new TextField());
	    vl.addComponent(new Button("Hinzufügen"));
	    this.center();
	    vl.setHeight("150px");
	    vl.setWidth("350px");
	}
	
	
}
