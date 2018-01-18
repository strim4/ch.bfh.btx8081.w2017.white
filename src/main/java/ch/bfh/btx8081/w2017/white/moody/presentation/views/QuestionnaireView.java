package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.QuestionAnswer;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Questionnaire;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.QuestionnairePresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the view of the Questions screen on this screen the user recive
 * everyday 4 questions to answer.
 * 
 * @author Sandra
 * @author Silvan Last Edit: 2017-12-07
 */

public class QuestionnaireView extends BaseView implements MoodyView {

	private QuestionnairePresenter presenter = null;

	private List<ViewListener> listeners = new ArrayList<ViewListener>();

	// test
	private Label lname;

	public QuestionnaireView() {
	}

	@SuppressWarnings("serial")
	private void createButtons() {

		Label questionsNumber = new Label();
		super.content.addComponent(questionsNumber);
		super.content.setComponentAlignment(questionsNumber, Alignment.TOP_LEFT);

		Label questionsText = new Label();
		super.content.addComponent(questionsText);
		super.content.setComponentAlignment(questionsText, Alignment.MIDDLE_LEFT);
	}

	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);
	}
	
	public Question getShowedQuestion(){
		Question showQ = new Question();
    	return showQ;
    }

}