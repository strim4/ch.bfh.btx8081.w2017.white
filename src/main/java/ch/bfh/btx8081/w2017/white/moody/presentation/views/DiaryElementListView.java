package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.imageio.ImageIO;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.renderers.ImageRenderer;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

import com.vaadin.ui.*;

/**
 * This Class shows a list of the recorded Diary Elements. vaa
 * 
 * @author Chantal Last Edit: 03.12.17
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	Button show;

	Button buttonBack;
	private DBManager dbm = new DBManager();

	public DiaryElementListView() {

		super();
		super.setTitle("Alte Einträge");
		this.createButtons();
	}

	private void createButtons() {

		// TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages -->
		// DiaryElementView
		
		Label dtTitle = new Label("Alle Texteinträge aus dem Tagebuch");
		super.content.addComponent(dtTitle);
		super.content.setComponentAlignment(dtTitle, Alignment.MIDDLE_CENTER);

		Grid<DiaryText> griddt = new Grid<>();
		griddt.addColumn(DiaryText::getName).setCaption("Name");
		griddt.addColumn(DiaryText::getNote).setCaption("Eintrag");
		griddt.addColumn(DiaryText::getEntryDate).setCaption("Datum");
		super.content.addComponent(griddt);
		griddt.setItems((Collection<DiaryText>) dbm.showd());
		super.content.setComponentAlignment(griddt, Alignment.MIDDLE_CENTER);
		
		Label dpTitle = new Label("Alle Bildereinträge aus dem Tagebuch");
		super.content.addComponent(dpTitle);
		super.content.setComponentAlignment(dpTitle, Alignment.MIDDLE_CENTER);

		Grid<DiaryPic> griddp = new Grid<>();
		griddp.addColumn(DiaryPic::getName).setCaption("Name");
				
		griddp.addColumn(DiaryPic::getImage).setCaption("Bild");
		griddp.addColumn(DiaryPic::getEntryDate).setCaption("Datum");
		super.content.addComponent(griddp);
		griddp.setItems((Collection<DiaryPic>) dbm.showp());
		super.content.setComponentAlignment(griddp, Alignment.MIDDLE_CENTER);
		
		Label daTitle = new Label("Alle Aktivitäten aus dem Tagebuch");
		super.content.addComponent(daTitle);
		super.content.setComponentAlignment(daTitle, Alignment.MIDDLE_CENTER);

		Grid<Activity> gridda = new Grid<>();
		gridda.addColumn(Activity::getName).setCaption("Name");
		gridda.addColumn(Activity::getDescription).setCaption("Beschreibung");
		gridda.addColumn(Activity::getEntryDate).setCaption("Datum");
		super.content.addComponent(gridda);
		gridda.setItems((Collection<Activity>) dbm.showa());
		super.content.setComponentAlignment(gridda, Alignment.MIDDLE_CENTER);
		

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
