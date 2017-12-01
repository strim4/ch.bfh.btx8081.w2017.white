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
	
	private static final String BUTTON_CLOSE = "CLOSE";

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";	

	public NotificationView() {
		super();

		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {

		Label notification = new Label();
		super.content.addComponent(notification);
		super.content.setComponentAlignment(notification, Alignment.MIDDLE_CENTER);

		Button buttonBack = new Button("Zurueck");//Text entfernen, sobald Icon funktioniert
		// ersetzen durch (BUTTON_CLOSE)
		//buttonList.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("500px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		//buttonBack.setIcon(new ThemeResource("images/backIcon.png"), BUTTON_BACK);
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	}
}