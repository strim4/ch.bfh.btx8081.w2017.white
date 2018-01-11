package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.Date;

import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryTextPresenter class
 * 
 * @author Chantal Last edit: 10.12.17
 */

@SuppressWarnings("serial")
public class DiaryTextPresenter implements ViewListener {

	@SuppressWarnings("unused")
	private DiaryText model;
	private DiaryTextView view;

	public DiaryTextPresenter(DiaryText model, DiaryTextView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}

	@SuppressWarnings("static-access")
	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonSave":

			DiaryText dt = new DiaryText();
			dt.creatDt(view.getNameValue(), view.getTFValue(), view.getDateValue(), new Date());
			Notification saved = new Notification("");
			saved.setPosition(Position.BOTTOM_CENTER);
			saved.show("Eintrag gespeichert");
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		}
	}
}
