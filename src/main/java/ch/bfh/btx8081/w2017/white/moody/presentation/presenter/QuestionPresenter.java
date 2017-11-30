package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra LastEdit: 28.11.17
 */

public class QuestionPresenter extends BasePresenter {

	public QuestionPresenter(BaseModel model, BaseView view) {
		super(model, view);
		// TODO Auto-generated constructor stub
	}

	
	private QuestionModel questionModel;
	private QuestionView questionView;

	public QuestionPresenter(QuestionModel questionModel, QuestionView questionView) {
		super(questionModel, questionView);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonNotification": // wie muss ich den benennen? In der View hat es keinen Butten...
			// Die Buttons sind im YES/NO und im Smiley....
		}
	}
}