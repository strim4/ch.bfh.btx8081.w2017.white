package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.NotificationModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.NotificationView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/* *
 * NotificationsPresenter Class
 * 
 * @author Sandra
 * LastEdit: 12.12.17
 */

public class NotificationPresenter  implements ViewListener{
	
	@SuppressWarnings("unused")
	private NotificationModel notificationModel;
	private NotificationView notificationView;
	
	public NotificationPresenter(NotificationModel notificationModel, NotificationView notificationView){
		this.notificationModel = notificationModel;
		this.notificationView = notificationView;
		notificationView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();
		notificationView.getUI().getNavigator().navigateTo(Views.START_VIEW);
		switch (buttonID) {
		case "buttonGelesen":
			
			break;
		}
	}
}