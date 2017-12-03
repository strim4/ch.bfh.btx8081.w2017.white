package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Upload.Receiver;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.Upload.SucceededListener;

/**
 * This class shows the creation of a new Diary Picture Element.
 * 
 * @author Chantal
 * Last edit: 03.12.17
 */

@SuppressWarnings("serial")
public class DiaryPicView extends BaseView implements MoodyView{
	
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	Label dateL;
	DateField date;
	Button buttonSave;
	Button buttonDelete;
	Button buttonBack;
	
	public DiaryPicView(){
		
		super();
		super.setTitle("Neuer Fotoeintrag");
		this.createButtons();
		
	}
	
	private void createButtons(){
		
		HorizontalLayout datePosition = new HorizontalLayout();
		super.content.addComponent(datePosition);
		super.content.setComponentAlignment(datePosition, Alignment.MIDDLE_CENTER);
		Label dateL = new Label("Datum auswählen: ");
		datePosition.addComponent(dateL);
		datePosition.setComponentAlignment(dateL, Alignment.MIDDLE_CENTER);
		
		DateField date = new DateField();
		date.setWidth("350px");
		datePosition.addComponent(date);
		datePosition.setComponentAlignment(date, Alignment.MIDDLE_CENTER);
		
		
		//Foto Upload
		
		final Image image = new Image("Uploaded Image");
		
		class ImageUploader implements Receiver, SucceededListener {
			
			public File file;
			public OutputStream receiveUpload(String filename, String mimeType) {
				//TODO create and return a file output stream
				return null;
			}

			@Override
			public void uploadSucceeded(SucceededEvent event) {
				image.setSource(new FileResource(file));	
			}
		};
		
		ImageUploader receiver = new ImageUploader();
		Upload upload = new Upload("Foto hier hochladen", receiver);
		upload.addSucceededListener(receiver);
		super.content.addComponent(upload);
		super.content.setComponentAlignment(upload, Alignment.MIDDLE_CENTER);
		
		HorizontalLayout menue = new HorizontalLayout();
		super.content.addComponent(menue);
		super.content.setComponentAlignment(menue, Alignment.MIDDLE_CENTER);
		
		Button buttonSave = new Button("");
		buttonSave.addClickListener(this);
		buttonSave.setId("buttonSave");
		buttonSave.setWidth(BUTTON_WIDTH);
		buttonSave.setHeight(BUTTON_HEIGHT);
		buttonSave.setIcon(new FileResource(new File(basepath + "/VAADIN/images/saveIcon.png")));
		menue.addComponent(buttonSave);
		menue.setComponentAlignment(buttonSave, Alignment.MIDDLE_CENTER);
	
		Button buttonDelete = new Button("");
		buttonDelete.addClickListener(this);
		buttonDelete.setId("buttonDelete");
		buttonDelete.setWidth(BUTTON_WIDTH);
		buttonDelete.setHeight(BUTTON_HEIGHT);
		buttonDelete.setIcon(new FileResource(new File(basepath + "/VAADIN/images/deleteIcon.png")));
		menue.addComponent(buttonDelete);
		menue.setComponentAlignment(buttonDelete, Alignment.MIDDLE_CENTER);
	
		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		menue.addComponent(buttonBack);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);

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