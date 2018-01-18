package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionnaireModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionnaireView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * QuestionsPresenter Class
 * 
 * @author Sandra LastEdit: 28.11.17
 */

@SuppressWarnings("serial")
public class QuestionnairePresenter implements ViewListener {

    private QuestionnaireModel model;
    private QuestionnaireView view;

    public QuestionnairePresenter(QuestionnaireModel model, QuestionnaireView view) {
        this.model = model;
        this.view = view;
        view.addListener(this);
    }


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