package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryElementPresenter class
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryElementPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private DiaryElement model;
	private DiaryElementView view;
	
	public DiaryElementPresenter(DiaryElement model, DiaryElementView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
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
