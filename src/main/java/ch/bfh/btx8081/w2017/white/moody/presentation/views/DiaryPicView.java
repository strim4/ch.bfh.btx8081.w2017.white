package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Upload.Receiver;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.Upload.SucceededListener;
import com.vaadin.ui.VerticalLayout;

/**
 * This class shows the creation of a new Diary Picture Element.
 * 
 * @author Chantal Last edit: 16.01.18
 */

@SuppressWarnings("serial")
public class DiaryPicView extends BaseView implements MoodyView {

	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	Label dateL;
	private DateField date;
	Button buttonSave;
	Button buttonDelete;
	Button buttonBack;
	private TextField name;
	private Label lname;
	private byte[] fileContent;

	public DiaryPicView() {

		super();
		super.setTitle("Neuer Fotoeintrag");
		this.createButtons();

	}

	/**
	 * The private method createButtons create the layout of this page with the buttons
	 */
	private void createButtons() {

		HorizontalLayout datePosition = new HorizontalLayout();
		super.content.addComponent(datePosition);
		super.content.setComponentAlignment(datePosition, Alignment.MIDDLE_CENTER);
		Label dateL = new Label("Datum auswaehlen: ");
		datePosition.addComponent(dateL);
		datePosition.setComponentAlignment(dateL, Alignment.MIDDLE_CENTER);

		date = new DateField();
		date.setWidth("350px");
		datePosition.addComponent(date);
		datePosition.setComponentAlignment(date, Alignment.MIDDLE_CENTER);

		lname = new Label("Bezeichnung");
		super.content.addComponent(lname);
		super.content.setComponentAlignment(lname, Alignment.MIDDLE_CENTER);

		name = new TextField();
		name.setWidth("500px");
		super.content.addComponent(name);
		super.content.setComponentAlignment(name, Alignment.MIDDLE_CENTER);

		// Foto Upload

		final Image image = new Image("Uploaded Image");

		class ImageUploader implements Receiver, SucceededListener {

			public File file;

			public OutputStream receiveUpload(String filename, String mimeType) {
				FileOutputStream fos = null;

				try {
					file = new File(basepath + "/VAADIN/images/" + filename);
					
					
					fos = new FileOutputStream(file);
					//fileContent = Files.readAllBytes(file.toPath());
					fileContent = new byte[(int) file.length()];
			
					

					
				} catch (final IOException e) {
					new Notification("Could not open file3", e.getMessage(), Notification.Type.ERROR_MESSAGE)
							.show(Page.getCurrent());
					return null;
				}

				return fos;
			}

			@Override
			public void uploadSucceeded(SucceededEvent event) {
				//image.setVisible(true);
				image.setSource(new FileResource(file));
				

			}
		}
		;
		
      
		ImageUploader receiver = new ImageUploader();
		Upload upload = new Upload("Foto hier hochladen", receiver);
		upload.addSucceededListener(receiver);
		super.content.addComponent(upload);
		super.content.setComponentAlignment(upload, Alignment.MIDDLE_CENTER);
		
		Panel panel = new Panel("Cool Image Storage");
		panel.setWidth("500px");
		
      super.content.addComponents(upload, image);
      super.content.setComponentAlignment(upload, Alignment.MIDDLE_CENTER);
      super.content.setComponentAlignment(image, Alignment.MIDDLE_CENTER);
      
    

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

		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth(BUTTON_WIDTH);
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		menue.addComponent(buttonBack);
		menue.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);

	}

	/**
	 * The public method getNameValue gives the value of name of the activity
	 * @return - value of the name 
	 */
	public String getNameValue() {
		String cont = name.getValue();
		return cont;
	}

	/**
	 * The public method getDateValue gives the recording date
	 * @return - recording date
	 */
	public String getDateValue() {

		String d = date.getValue().toString();
		return d;

	}

	/**
	 * The public method getPicValue gives the picture file
	 * @return - picture file
	 */
	public byte[] getPicValue() {

		return fileContent;

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
