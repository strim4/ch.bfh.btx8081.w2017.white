package ch.bfh.btx8081.w2017.white.moody.presentation.views;


import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.QuestionPresenter;

/**
 * This class is the view of the Questions screen on this screen the user recive
 * everyday 4 questions to answer.
 * 
 * @author Sandra
 * Last Edit: 28.11.17
 */

public class QuestionView extends BaseView {

	private QuestionPresenter presenter = null;

	public QuestionView() {
		super();
		super.setTitle("Guten Tag %s \n hier Deine taeglichen Fragen"); // Silvan, dieser Platzhalter ist für Dich, da
																		// kommt der Name aus der DB hin...
		this.createButtons();
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
}