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
 * Last Edit: 14.01.2018
 */

@SuppressWarnings("serial")
public class DiaryElementListView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	private DiaryElementListPresenter delp = new DiaryElementListPresenter(this);

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private Button buttonBack = new Button("");
	private HorizontalLayout text = new HorizontalLayout();
	private DiaryTextView textView = new DiaryTextView();
	
	public DiaryElementListView() {

		super();
		super.setTitle("Alte Einträge");
		this.createDiaryTextList();
		super.content.addComponent(text);
		this.createDiaryPictureList();
		this.createActivityList();
		this.createButtons();
		
	}
	
	private void createDiaryTextList() {
		
		Label dtTitle = new Label("Alle Texteinträge aus dem Tagebuch");
		super.content.addComponent(dtTitle);
		super.content.setComponentAlignment(dtTitle, Alignment.MIDDLE_CENTER);

		Grid<DiaryText> griddt = new Grid<>();
		griddt.setSelectionMode(SelectionMode.SINGLE);
		griddt.setSizeFull();
		griddt.addColumn(DiaryText::getName).setCaption("Name");
		griddt.addColumn(DiaryText::getNote).setCaption("Eintrag");
		griddt.addColumn(DiaryText::getEntryDate).setCaption("Datum");
		text.addComponent(griddt);
		griddt.setItems((Collection<DiaryText>) delp.getd());
		text.setComponentAlignment(griddt, Alignment.MIDDLE_CENTER);

		text.addComponent(textView);
		text.setSizeFull();
		text.setExpandRatio(griddt, 1);
		textView.setVisible(false);
		
		griddt.addItemClickListener(new ItemClickListener<DiaryText>() {
			public void itemClick(ItemClick<DiaryText> event) {
				if (event.getMouseEventDetails().isDoubleClick()) {
					textView.getUI().getNavigator().navigateTo(Views.DIARYTEXT_VIEW);
				}
			}
		});
		
//		griddt.asSingleSelect().addValueChangeListener(event -> {
//			if(event.getValue() == null) {
//				textView.setVisible(false);
//			} else {
//				textView.setDiaryText(event.getValue());
//			}
//		});
		
		//SingleSelect<DiaryText> selection = griddt.asSingleSelect();

//		selection.addValueChangeListener(listener);
		
	}
	
	private void createDiaryPictureList() {
		
		Label dpTitle = new Label("Alle Bildereinträge aus dem Tagebuch");
		super.content.addComponent(dpTitle);
		super.content.setComponentAlignment(dpTitle, Alignment.MIDDLE_CENTER);

		Grid<DiaryPic> griddp = new Grid<>();
		griddp.addColumn(DiaryPic::getName).setCaption("Name");
		griddp.addColumn(DiaryPic::getImageByte).setCaption("Bild");
		griddp.addColumn(DiaryPic::getEntryDate).setCaption("Datum");
		griddp.setSizeFull();
		super.content.addComponent(griddp);
		griddp.setItems((Collection<DiaryPic>) delp.getp());
		super.content.setComponentAlignment(griddp, Alignment.MIDDLE_CENTER);
		
	}
	
	private void createActivityList() {
		
		Label daTitle = new Label("Alle Aktivitäten aus dem Tagebuch");
		super.content.addComponent(daTitle);
		super.content.setComponentAlignment(daTitle, Alignment.MIDDLE_CENTER);

		Grid<Activity> gridda = new Grid<>();
		gridda.addColumn(Activity::getName).setCaption("Name");
		gridda.addColumn(Activity::getDescription).setCaption("Beschreibung");
		gridda.addColumn(Activity::getEntryDate).setCaption("Datum");
		gridda.setSizeFull();
		super.content.addComponent(gridda);
		gridda.setItems((Collection<Activity>) delp.geta());
		super.content.setComponentAlignment(gridda, Alignment.MIDDLE_CENTER);
		
	}

	private void createButtons() {
		
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
