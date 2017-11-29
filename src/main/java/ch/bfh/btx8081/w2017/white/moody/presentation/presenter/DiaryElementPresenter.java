package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Chantal
 * Last edit: 29.11.17
 */

public class DiaryElementPresenter {

	private DiaryElement model;
	private DiaryElementView view;
	
	public DiaryElementPresenter(DiaryElement model, DiaryElementView view) {
		this.model = model;
		this.view = view;
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		//TODO add links
		switch(buttonID) {

		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonDelete":
			//Lösch-Methode
			break;
		}
	}
}
