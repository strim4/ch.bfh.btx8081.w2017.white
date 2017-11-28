package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.NotificationModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.NotificationView;

/* *
 * QuestionsPresenter Class
 * 
 * @author Sandra
 * LastEdit: 28.11.17
 */

public class NotificationPresenter extends BasePresenter {

	private NotificationModel notificationModel;
	private NotificationView notificationView;

	public NotificationPresenter(NotificationModel notificationModel, NotificationView notificationView) {
		super(notificationModel, notificationView);
	}
}