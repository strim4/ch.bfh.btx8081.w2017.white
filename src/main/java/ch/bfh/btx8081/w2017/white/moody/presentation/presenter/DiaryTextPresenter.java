package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryTextPresenter class
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class DiaryTextPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private DiaryText model;
	private DiaryTextView view;
	
	public DiaryTextPresenter(DiaryText model, DiaryTextView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "buttonSave":
			//Speicher-Methode
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		case "buttonDelete":
			//Lösch-Methode
			break;
		}
	}
}
