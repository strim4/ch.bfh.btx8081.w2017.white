package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionsModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionView;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra
 * LastEdit: 28.11.17
 */

public class QuestionPresenter extends BasePresenter {
	
	private QuestionsModel questionsModel;
	private QuestionView questionView;

	public QuestionPresenter(QuestionsModel questionsModel, QuestionView questionView) {
		super(questionsModel, questionView);
	}
}