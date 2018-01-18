package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Video;

/**
 * The Exercises View shows a relaxing breath exercise.
 * 
 * @author Chantal Last Edit: 16.01.18 Zoran Last Edit : 18.01.2018
 */
@SuppressWarnings("serial")
public class ExercisesView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	Button buttonPlay;
	Button buttonStop;
	Button buttonPause;
	public Video video;

	public ExercisesView() {
		super();
		super.setTitle("Uebungen");
		this.createFutureContent();
		super.setLayouts(0.35f, 0.65f, 0, 0);
	}

	/**
	 * The private method createFutureContent is for the following content.
	 */
	private void createFutureContent() {

		Label welcomeLabel = new Label("Willkommen zu Atemübungen, drücke auf play um das Video abzuspielen");
		super.content.addComponent(welcomeLabel);
		super.content.setComponentAlignment(welcomeLabel, Alignment.TOP_CENTER);

		FileResource fileResource = new FileResource(new File(basepath + "/VAADIN/videos/Atemuebung.mp4"));
		video = new Video();
		video.setSource(fileResource);
		video.setWidth("400px"); // Set size of the video player's display area on screen
		video.setHeight("300px");
		video.setPoster(new FileResource(new File(basepath + "/VAADIN/images/moodyLogo.png")));
		video.isVisible();
		video.setHtmlContentAllowed(true);
		video.setAutoplay(false);
		super.content.addComponent(video);
		super.content.setComponentAlignment(video, Alignment.MIDDLE_CENTER);

		buttonPlay = new Button("Play");
		buttonPlay.addClickListener(this);
		buttonPlay.setId("buttonPlay");
		buttonPlay.setWidth("120px");
		buttonPlay.setHeight("120px");
		// super.content.addComponent(buttonPlay);
		// super.content.setComponentAlignment(buttonPlay, Alignment.BOTTOM_LEFT);

		buttonPause = new Button("Pause");
		buttonPause.addClickListener(this);
		buttonPause.setId("buttonPause");
		buttonPause.setWidth("120px");
		buttonPause.setHeight("120px");
		// super.content.addComponent(buttonPause);
		// super.content.setComponentAlignment(buttonPause, Alignment.BOTTOM_CENTER);

		HorizontalLayout buttons = new HorizontalLayout();
		super.content.addComponent(buttons);
		super.content.setComponentAlignment(buttons, Alignment.BOTTOM_CENTER);
		buttons.addComponents(buttonPlay, buttonPause);
		buttons.setDefaultComponentAlignment(ALIGNMENT_DEFAULT);
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
