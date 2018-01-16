package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.List;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementListView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * The DiaryElementListPresenter handles the events from the DiaryElementListView.
 * @author Chantal
 * Last edit: 14.01.2018
 */

@SuppressWarnings("serial")
public class DiaryElementListPresenter implements ViewListener{

	private DiaryElementListView view;
	private UI parent;
	
	/**
	 * The constructor of the DiaryElementListPresenter
	 * @param view - DiaryElementListView
	 */
	public DiaryElementListPresenter(DiaryElementListView view) {
		this.view = view;
		view.addListener(this);
	}
	
	/**
	 * Public method getd contains all elements from type DiaryText.
	 * @return a list with the DiaryText elements
	 */
	public List<DiaryText> getd(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.getd();
	}
	
	/**
	 * Public method getp contains all elements from type DiaryPicture.
	 * @return a list with the DiaryPicture elements
	 */
	public List<DiaryPic> getp(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.getp();
	}
	
	/**
	 * Public method geta contains all elements from type Activity.
	 * @return a list with the Activity elements
	 */
	public List<Activity> geta(){
		DBManager dbm = DBManager.getInstance( );
		return dbm.geta();
	}
	
	/**
	 * Public method buttonClick handles the events form the back button
	 * and navigates to the DiaryView.
	 */
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		}
	}
	
}
