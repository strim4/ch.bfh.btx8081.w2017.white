package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.imageio.ImageIO;

import com.vaadin.data.Binder;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.components.grid.ItemClickListener;
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.ImageRenderer;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryElementListPresenter;

import com.vaadin.ui.*;

/**
 * The DiaryElementListView class shows the archive of the recorded diary elements. 
 * It contains a list with the text elements, the pictures and the activities.
 * 
 * @author Chantal 
 * Last Edit: 17.01.2018
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends BaseView implements MoodyView {

	private HorizontalLayout textMenue = new HorizontalLayout();
	private HorizontalLayout picMenue = new HorizontalLayout();
	private HorizontalLayout activityMenue = new HorizontalLayout();
	
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	private DiaryElementListPresenter delp = new DiaryElementListPresenter(this);
	//private Collection<DiaryText> diaryTexts;
	//private Collection<Activity> activities;

	private String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private Label dtTitle;
	private Label dpTitle;
	private Label daTitle;
	
	private Button newText;
	private Button newPic;
	private Button newActivity;
	private Button buttonBack;
	
	private TextField nameEditor = new TextField();
	private TextField noteEditor = new TextField();
	private TextField dateEditor = new TextField();
	
	public DiaryElementListView() {

		super();
		super.setTitle("Alte Einträge");
		this.createDiaryTextList();
		this.createDiaryPictureList();
		this.createActivityList();
		this.createButtons();
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createDiaryTextList() {
		
		dtTitle = new Label("Alle Texteinträge aus dem Tagebuch");
		newText = new Button("Neu");
		textMenue.addComponents(dtTitle, newText);
		textMenue.setComponentAlignment(dtTitle, Alignment.MIDDLE_CENTER);
		newText.addClickListener(this);
		newText.setId("newText");

		Grid<DiaryText> griddt = new Grid<>();
		griddt.setSelectionMode(SelectionMode.SINGLE);
		griddt.setSizeFull();		
		griddt.addColumn(DiaryText::getName)
		.setCaption("Name")
		.setEditorComponent(nameEditor, DiaryText::setName)
		.setExpandRatio(1);
		griddt.addColumn(DiaryText::getNote)
		.setCaption("Eintrag")
		.setEditorComponent(noteEditor, DiaryText::setNote)
		.setExpandRatio(2);		
		griddt.addColumn(DiaryText::getEntryDate)
		.setCaption("Datum")
		.setEditorComponent(dateEditor, DiaryText::setEntryDate)
		.setExpandRatio(0);
		griddt.setItems((Collection<DiaryText>) delp.getd());
		griddt.addColumn(diaryTexts -> "Delete",
			      new ButtonRenderer(clickEvent -> {
//			          diaryTexts.remove(clickEvent.getItem());
//			          griddt.setItems((Collection<DiaryText>) delp.getd());
			    }))
		.setExpandRatio(0);		
		super.content.addComponents(textMenue, griddt);
		super.content.setComponentAlignment(textMenue, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(griddt, Alignment.MIDDLE_CENTER);
		super.content.setSizeFull();
		
		griddt.addItemClickListener(new ItemClickListener<DiaryText>() {
			public void itemClick(ItemClick<DiaryText> event) {
				if (event.getMouseEventDetails().isDoubleClick()) {
					griddt.getEditor().setEnabled(true);
				}
			}
		});
		
	}
	
	private void createDiaryPictureList() {
		
		dpTitle = new Label("Alle Bildereinträge aus dem Tagebuch");
		newPic = new Button("Neu");
		picMenue.addComponents(dpTitle, newPic);
		picMenue.setComponentAlignment(dpTitle, Alignment.MIDDLE_CENTER);
		newPic.addClickListener(this);
		newPic.setId("newPic");

		Grid<DiaryPic> griddp = new Grid<>();
		griddp.addColumn(DiaryPic::getName).setCaption("Name");
		griddp.addColumn(DiaryPic::getImageByte).setCaption("Bild");
		griddp.addColumn(DiaryPic::getEntryDate).setCaption("Datum");
		griddp.setSizeFull();
		griddp.setHeight("300px");
		super.content.addComponents(picMenue, griddp);
		griddp.setItems((Collection<DiaryPic>) delp.getp());
		super.content.setComponentAlignment(picMenue, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(griddp, Alignment.MIDDLE_CENTER);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createActivityList() {
		
		daTitle = new Label("Alle Aktivitäten aus dem Tagebuch");
		newActivity = new Button("Neu");
		activityMenue.addComponents(daTitle, newActivity);
		activityMenue.setComponentAlignment(daTitle, Alignment.MIDDLE_CENTER);
		newActivity.addClickListener(this);
		newActivity.setId("newActivity");

		Grid<Activity> gridda = new Grid<>();
		gridda.addColumn(Activity::getName)
		.setCaption("Name")
		.setEditorComponent(nameEditor, Activity::setName)
		.setExpandRatio(1);
		gridda.addColumn(Activity::getDescription)
		.setCaption("Beschreibung")
		.setEditorComponent(noteEditor, Activity::setDescription)
		.setExpandRatio(2);
		gridda.addColumn(Activity::getEntryDate)
		.setCaption("Datum")
		.setEditorComponent(dateEditor, Activity::setEntryDate)
		.setExpandRatio(0);
		gridda.setSizeFull();
		super.content.addComponents(activityMenue, gridda);
		gridda.setItems((Collection<Activity>) delp.geta());
		super.content.setComponentAlignment(gridda, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(activityMenue, Alignment.MIDDLE_CENTER);
		gridda.addColumn(activities -> "Delete",
			      new ButtonRenderer(clickEvent -> {
//			          activities.remove(clickEvent.getItem());
//			          griddt.setItems((Collection<Activity>) delp.getd());
			    }))
		.setExpandRatio(0);	
		
		gridda.addItemClickListener(new ItemClickListener<Activity>() {
			public void itemClick(ItemClick<Activity> event) {
				if (event.getMouseEventDetails().isDoubleClick()) {
					gridda.getEditor().setEnabled(true);
				}
			}
		});
	}

	private void createButtons() {
		
		buttonBack = new Button("");
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
