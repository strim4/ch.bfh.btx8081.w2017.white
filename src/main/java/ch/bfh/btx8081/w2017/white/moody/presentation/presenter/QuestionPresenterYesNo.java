package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;

public class QuestionPresenterYesNo extends QuestionPresenter{
	
	public QuestionPresenterYesNo(BaseModel model, BaseView view) {
		super(model, view);
		
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonYes":
			break;
		case "buttenNo":
			break;
		}
	}

}
