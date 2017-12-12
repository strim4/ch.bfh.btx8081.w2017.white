package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.NotificationPresenter;

/**
 * This class is the view of the Notification screen on this screen the user
 * recive everyday a notification.
 * 
 * @author Sandra
 * Last Edit: 12.12.17
 */

public class NotificationView extends BaseView implements MoodyView{

	private NotificationPresenter presenter = null;
	
	private static final String BUTTON_GELESEN = "gelesen";

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";	
	
	public NotificationView() {
		super();
		super.setTitle("");
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {

		Label notification = new Label();
		super.content.addComponent(notification);
		super.content.setComponentAlignment(notification, Alignment.MIDDLE_CENTER);

		Button buttonGelesen = new Button(BUTTON_GELESEN);
		buttonGelesen.addClickListener(this);
		buttonGelesen.setId("buttonGelesen");
		buttonGelesen.setWidth(BUTTON_WIDTH);
		buttonGelesen.setHeight(BUTTON_HEIGHT);
		super.content.addComponent(buttonGelesen);
		super.content.setComponentAlignment(buttonGelesen, Alignment.MIDDLE_CENTER);
	}
}