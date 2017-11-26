package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This class is the view of the Questions screen on this screen the user recive
 * everyday 4 questions to answer.
 * 
 * @author Sandra
 * Last Edit: 26.11.17
 */

public class QuestionsView extends BaseView {

	public QuestionsView() {
		GridLayout layout = new GridLayout(2, 3); // first columns, than rows
		Label questions = new Label("Guten Tag NAME, hier Deine täglichen Fragen"); // Name sollte aus der DB kommen
		// nach NAME, sollte eine neue Zeile beginnen
		layout.addComponent(questions, 2, 1);

		/**
		 * Buttons for answering the 3 textquestions and the Smiliequestion
		 */
		Button newYes = new Button("JA");
		Button newNo = new Button("NEIN");
		Button newSmilies = new Button("Neues Foto"); // hier sollten 5 Smilies rein, welche der User ankliken kann

		layout.addComponent(newYes, 1, 3);
		layout.addComponent(newNo, 2, 3);
		layout.addComponent(newSmilies, 2, 3);
	}
}