package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.List;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementListView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryElementListView class
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryElementListPresenter implements ViewListener{

	private DiaryElementListView view;
	
	public DiaryElementListPresenter(DiaryElementListView view) {
		this.view = view;
		view.addListener(this);
	}
	
	public List<DiaryText> getd(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.getd();
	}
	
	public List<DiaryPic> getp(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.getp();
	}
	
	public List<Activity> geta(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.geta();
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "show":
			
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		}
	}
}
