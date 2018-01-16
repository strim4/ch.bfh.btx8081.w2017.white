package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.io.IOException;
import java.util.Date;

import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryPicView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * DiaryPicture Presenter
 * 
 * @author Chantal Last edit: 16.01.18
 * * @author Moritz 
 */

@SuppressWarnings("serial")
public class DiaryPicPresenter implements ViewListener {

	@SuppressWarnings("unused")
	private DiaryPic model;
	private DiaryPicView view;

	public DiaryPicPresenter(DiaryPic model, DiaryPicView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}

	/**
	 * The public method buttonClick handles the events of the buttons save and back.
	 */
	@SuppressWarnings("static-access")
	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonSave":
		
			DiaryPic dp;
			try {
				dp = new DiaryPic();
				dp.creatDp(view.getNameValue(), view.getPicValue(), new Date(), view.getDateValue());
				
				Notification saved = new Notification("");
				saved.setPosition(Position.BOTTOM_CENTER);
				saved.show("Eintrag gespeichert");
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.DIARY_VIEW);
			break;
		}
	}

}
