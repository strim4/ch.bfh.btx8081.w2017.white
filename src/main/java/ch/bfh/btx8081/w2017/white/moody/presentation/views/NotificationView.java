package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This class is the view of the Notification screen on this screen the user
 * recive everyday a notification.
 * 
 * @author Sandra
 * Last Edit: 26.11.17
 */

public class NotificationView extends BaseView {

	public NotificationView() {
		GridLayout layout = new GridLayout(1, 2); // first columns, than rows
		Label notifications = new Label("");
		layout.addComponent(notifications, 2, 1);

		/**
		 * Button for close the notification screen
		 */
		Button newClose = new Button("schliessen");

		layout.addComponent(newClose, 1, 2);
	}
}