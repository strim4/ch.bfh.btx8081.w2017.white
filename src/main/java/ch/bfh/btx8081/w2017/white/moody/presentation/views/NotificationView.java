package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.NotificationPresenter;

/**
 * This class is the view of the Notification screen on this screen the user
 * recive everyday a notification.
 * 
 * @author Sandra
 * Last Edit: 28.11.17
 */

public class NotificationView extends BaseView {

	private NotificationPresenter presenter = null;

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_CLOSE = "CLOSE";

	public NotificationView() {
		super();

		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {

		Label notification = new Label();
		super.content.addComponent(notification);
		super.content.setComponentAlignment(notification, Alignment.MIDDLE_CENTER);

		Button buttonNotification = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});

		buttonNotification.setWidth(BUTTON_WIDTH);
		buttonNotification.setHeight(BUTTON_HEIGHT);
		buttonNotification.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_CLOSE);
		super.content.addComponent(buttonNotification);
		super.content.setComponentAlignment(buttonNotification, Alignment.BOTTOM_RIGHT);
	}
}