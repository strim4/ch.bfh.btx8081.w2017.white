package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionnaireModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionnaireView;

/**
 * Diese Klasse wird leider nicht benutzt...
 * 
 * @author Sandra
 * Last Edit: Dezember 2017
 */

@SuppressWarnings("serial")
public class QuestionPresenterSmiley extends QuestionnairePresenter{

	private QuestionnaireModel questionnaireModel;
	private QuestionnaireView questionnaireView;

	public QuestionPresenterSmiley(QuestionnaireModel questionnaireModel, QuestionnaireView questionnaireView) {
		super(questionnaireModel, questionnaireView);
		questionnaireView.addListener(this);
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
