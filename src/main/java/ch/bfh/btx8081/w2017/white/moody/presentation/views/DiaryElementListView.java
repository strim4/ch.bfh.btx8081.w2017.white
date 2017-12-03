package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This Class shows a list of the recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 03.12.17
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends BaseView implements MoodyView{
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	Button buttonBack;
	
	public DiaryElementListView(){
		
		super();
		super.setTitle("Alte Einträge");		
		this.createButtons();
	}
	
	private void createButtons(){
		
		//TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages --> DiaryElementView
		
		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("380px");
		buttonBack.setHeight("120px");
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
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
