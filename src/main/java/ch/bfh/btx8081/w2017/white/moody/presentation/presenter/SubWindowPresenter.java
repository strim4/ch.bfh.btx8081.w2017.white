package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.Date;

import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ActivityEntries;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Profile;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.SubWindowView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Roberto
 *
 */




@SuppressWarnings("serial")
public class SubWindowPresenter implements ViewListener {
	
	private ActivityView viewa;
	
	
	
	private SubWindowView view;
	
	public SubWindowPresenter(SubWindowView view) {
		this.view = view;
		
	}
	
	





public void creatac(String activity) {
	ActivityEntries a = new ActivityEntries();
	a.creatAcEn(activity);
	
}

@SuppressWarnings("static-access")
public void buttonClick(ClickEvent event) {

	String buttonID = event.getButton().getId();

	switch (buttonID) {
	case "add":
		ActivityEntries a = new ActivityEntries();
		a.creatAcEn(viewa.getActivityValue());
		Notification saved = new Notification("");
		saved.setPosition(Position.BOTTOM_CENTER);
		saved.show("Eintrag gespeichert");
		break;
	
	}

}	

	}


