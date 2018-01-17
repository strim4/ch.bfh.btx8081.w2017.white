package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionView;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra LastEdit: 28.11.17
 */

@SuppressWarnings("serial")
public class QuestionPresenter extends BasePresenter {

	public QuestionPresenter(BaseModel model, BaseView view) {
		super(model, view);
		// TODO Auto-generated constructor stub
	}
	
//	private QuestionModel questionModel; Wurde von Silvan gelöscht, daher auskommentiert???
	private QuestionView questionView;

	//Warum ein zweiter Konstruktor?
//	public QuestionPresenter(QuestionModel questionModel, QuestionView questionView) {
//		super(questionModel, questionView);
//	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonYes":
			break;
		case "buttenNo":
			break;
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