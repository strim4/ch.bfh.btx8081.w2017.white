package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class is the view of YES and NO questions.
 * 
 * @author Sandra
 * Last Edit: 28.11.17
 */

public class QuestionsYesNoView extends QuestionsView {

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_YES = "YES";
	private static final String BUTTON_NO = "NO";

	public QuestionsYesNoView() {
		super();

		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {
		
		Button buttonYes = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonYes);
		super.content.setComponentAlignment(buttonYes, Alignment.BOTTOM_LEFT);

		Button buttonNo = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonNo);
		super.content.setComponentAlignment(buttonNo, Alignment.BOTTOM_RIGHT);

		buttonYes.setWidth(BUTTON_WIDTH);
		buttonYes.setHeight(BUTTON_HEIGHT);
		
		buttonNo.setWidth(BUTTON_WIDTH);
		buttonNo.setHeight(BUTTON_HEIGHT);
	}
}