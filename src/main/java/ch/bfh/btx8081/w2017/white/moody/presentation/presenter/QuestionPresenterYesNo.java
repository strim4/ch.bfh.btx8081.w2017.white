package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionnaireModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionnaireView;

/**
 * Diese Klasse wird vermutlich nicht mehr benutzt, daher kommentiere ich hier
 * auch nichts
 * 
 * @author Sandra Last Edit: Dezember 2017
 */

public class QuestionPresenterYesNo extends QuestionnairePresenter {

	private QuestionnaireModel questionnaireModel;
	private QuestionnaireView questionnaireView;

	public QuestionPresenterYesNo(QuestionnaireModel questionnaireModel, QuestionnaireView questionnaireView) {
		super(questionnaireModel, questionnaireView);
		questionnaireView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();
		DBManager dbm = DBManager.getInstance();

		switch (buttonID) {
		case "buttonYes":

			break;
		case "buttenNo":
			break;
		}
	}
}
