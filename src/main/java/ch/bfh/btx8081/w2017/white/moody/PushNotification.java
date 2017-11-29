package ch.bfh.btx8081.w2017.white.moody;


import java.time.Instant;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.NotificationGenerator;

@Push
@SuppressWarnings("serial")
@Theme("vaadinserverpush")
public class PushNotification extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = PushNotification.class)
	public static class Servlet extends VaadinServlet {
	}

	private NotificationGenerator notifg;
	private VerticalLayout layout;
	private Label theTime;
	
	@Override
	protected void init(VaadinRequest request) {
		notifg = new NotificationGenerator();
		layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);
		theTime = new Label();
		theTime.setValue("Its now : " + Instant.now());
		layout.addComponent(theTime);
		new MyFirsthThread().start();
		new MySecondThread2().start();
	}

	class MyFirsthThread extends Thread {

	    @Override
	    public void run() {
	        try {
	            while (true) {
	        		Thread.sleep(1000);

	                access(new Runnable() {
	                    @Override
	                    public void run() {
	                		theTime.setValue("Its now : " + Instant.now());
	                    }
	                });
	            }

	        	} catch (InterruptedException e) {
	        		e.printStackTrace();
	        	}
	    }
	}

	class MySecondThread2 extends Thread {
	    int count = 0;

	    @Override
	    public void run() {
	        try {
//	        	the count of push actions for the given time period
	            while (count < 4) { 
	            	 //the time delay between the notifications is been set here
	                Thread.sleep(10000);
	               

	                access(new Runnable() {
	                    @Override
	                    public void run() {
	                    	layout.addComponent(new Label(notifg.getNotif()));
	                    	count++;
	                    }
	                });
	            }

	            access(new Runnable() {
	                @Override
	                public void run() {
	                    layout.addComponent(new Label("End of Notifications for Today"));
	                }
	            });
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}	
	
}
