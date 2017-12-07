package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;

/**
 * This class is the view of YES and NO questions.
 * 
 * @author Sandra
 * Last Edit: 01.12.17
 */

public class QuestionYesNoView extends QuestionnaireView {

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_YES = "YES";
	private static final String BUTTON_NO = "NO";

	public QuestionYesNoView() {
		super();

		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {
		
		Button buttonYes = new Button(BUTTON_YES, new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		Button buttonNo = new Button(BUTTON_NO, new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonYes, buttonNo);
		content.addComponent(contentRow);

		buttonYes.setWidth(BUTTON_WIDTH);
		buttonYes.setHeight(BUTTON_HEIGHT);
		
		buttonNo.setWidth(BUTTON_WIDTH);
		buttonNo.setHeight(BUTTON_HEIGHT);
	}
}