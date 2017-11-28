package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionsModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionsView;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra
 * LastEdit: 28.11.17
 */

public class QuestionsPresenter extends BasePresenter {
	
	private QuestionsModel questionsModel;
	private QuestionsView questionsView;

	public QuestionsPresenter(QuestionsModel questionsModel, QuestionsView questionsView) {
		super(questionsModel, questionsView);
	}
}

	/*private QuestionsModel questionsModel;
	private QuestionsView questionsView;

	public QuestionsPresenter(QuestionsModel questionsModel, QuestionsView questionsView) {
		this.questionsModel = questionsModel;
		this.questionsView = questionsView;
	}*/
//}

// Auskommentiert, damit diese Klasse keinen Fehler anzeigt
// Diese Klasse ist von Silvan abhängig, da ist jedoch noch nichts vorhanden....