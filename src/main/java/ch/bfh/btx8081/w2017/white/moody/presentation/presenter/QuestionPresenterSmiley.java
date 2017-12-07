package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;

@SuppressWarnings("serial")
public class QuestionPresenterSmiley extends QuestionPresenter{
	
	public QuestionPresenterSmiley(BaseModel model, BaseView view) {
		super(model, view);
	}
	
	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonVerySad":
			break;
		case "buttonSad":
			break;
		case "buttonNeutral":;
		break;
		case "buttonHappy":
			break;
		case "buttonVeryHappy":
			break;
		}
	}
	
}
