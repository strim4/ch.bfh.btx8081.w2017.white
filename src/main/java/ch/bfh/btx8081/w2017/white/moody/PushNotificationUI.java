package ch.bfh.btx8081.w2017.white.moody;

import java.io.File;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.Position;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.NotificationGenerator;

/**
 * 
 * @author Zoran 
 * 	It enables Notifications to be launched asynchronous in a
 *  separate Thread
 *  Last Edit: 18.01.2018
 */

@Push
public class PushNotificationUI extends Thread {

	private NotificationGenerator notifg;
	private VerticalLayout layout;
	private UI ui;
	int count = 0;

	public PushNotificationUI(UI ui, VerticalLayout layout) {
		this.ui = ui;
		notifg = new NotificationGenerator();
		this.layout = layout;

	}

	@SuppressWarnings("deprecation")
	public void startPush() {
		/**
		 * Notification with the Title (Happy Messages) and a current chosen message
		 * from NotificationGenerator
		 */
		String currentNotif = notifg.getNotif().getTitle();
		Notification notif = new Notification("Happy Messages", currentNotif, Notification.TYPE_ERROR_MESSAGE);

		/**
		 * Here is described how long the push message is going to be displayed it can
		 * be clicked away by clicking on the message
		 */
		notif.setDelayMsec(5000);
		notif.setPosition(Position.MIDDLE_RIGHT);
		notif.setStyleName("mystyle");
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		FileResource resource = new FileResource(new File(basepath + "/VAADIN/images/moodyLogo.png"));
		notif.setIcon(resource);

		// it shows the message on the current page
		notif.show(Page.getCurrent());
	}

	@Override
	public void run() {
		try {
			/**
			 * The count of push actions for the given time period (the count of Push
			 * Messages per day) it can be set to (true) for endless thread, if so, the next
			 * thread is than obsolete
			 */
			while (count < 4) {
				/**
				 * The time delay between the notifications is been set here (how often per day)
				 */
				Thread.sleep(15000);

				ui.access(new Runnable() {
					@Override
					public void run() {
						startPush();
						count++;
					}
				});
			}

			/**
			 * This is just the message for test purposes, to notify that push threads are
			 * stopped
			 */
			ui.access(new Runnable() {
				@Override
				public void run() {
					layout.addComponent(new Label("End of Notifications for Today"));
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@WebServlet(urlPatterns = "/*", name = "Moody", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MoodyUIServlet extends VaadinServlet {
	}
}
