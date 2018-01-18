package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionnaireModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsEmoji;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionResultsYesNo;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

import java.util.Date;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionnaireView;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra LastEdit: 28.11.17
 */

@SuppressWarnings("serial")
public class QuestionnairePresenter implements ViewListener {

	private QuestionnaireModel model;
	private QuestionnaireView view;

	private DBManager dbm = DBManager.getInstance();
	
	public QuestionnairePresenter(QuestionnaireModel model, QuestionnaireView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		switch (buttonID) {
		case "buttonYes":
			QuestionResultsYesNo questionResultY = new QuestionResultsYesNo(view.getShowedQuestion().getId(),
					new Date(), true);
			dbm.persistObject(questionResultY);
			break;
		case "buttonNo":
			QuestionResultsYesNo questionResultN = new QuestionResultsYesNo(view.getShowedQuestion().getId(),
					new Date(), false);
			dbm.persistObject(questionResultN);
			break;
		case "buttonVerySad":
			QuestionResultsEmoji questionResultVS = new QuestionResultsEmoji(new Date(), 1);
			dbm.persistObject(questionResultVS);
			break;
		case "buttonSad":
			QuestionResultsEmoji questionResultS = new QuestionResultsEmoji(new Date(), 2);
			dbm.persistObject(questionResultS);
			break;
		case "buttonNeutral":
			QuestionResultsEmoji questionResultNe = new QuestionResultsEmoji(new Date(), 3);
			dbm.persistObject(questionResultNe);
			break;
		case "buttonHappy":
			QuestionResultsEmoji questionResultH = new QuestionResultsEmoji(new Date(), 4);
			dbm.persistObject(questionResultH);
			break;
		case "buttonVeryHappy":
			QuestionResultsEmoji questionResultVH = new QuestionResultsEmoji(new Date(), 5);
			dbm.persistObject(questionResultVH);
			break;
		}
	}
}