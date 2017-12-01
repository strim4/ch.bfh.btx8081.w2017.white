package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class is the view of the smiley question.
 * 
 * @author Sandra
 * Last Edit: 01.12.17
 */

public class QuestionSmileyView extends QuestionView {
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private static final String BUTTON_VERYSAD = "VERYSAD";
	private static final String BUTTON_SAD = "SAD";
	private static final String BUTTON_NEUTRAL = "NEUTRAL";
	private static final String BUTTON_HAPPY = "HAPPY";
	private static final String BUTTON_VERYHAPPY = "VERYHAPPY";

	public QuestionSmileyView() {
		super();

		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {
		
		Button buttonVerySad = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		buttonVerySad.setWidth(BUTTON_WIDTH);
		buttonVerySad.setHeight(BUTTON_HEIGHT);
		buttonVerySad.setIcon(new ThemeResource("images/verySadIcon.png"), BUTTON_VERYSAD);

		Button buttonSad = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		buttonSad.setWidth(BUTTON_WIDTH);
		buttonSad.setHeight(BUTTON_HEIGHT);
		buttonSad.setIcon(new ThemeResource("images/sadIcon.png"), BUTTON_SAD);
		
		Button buttonNeutral = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		buttonNeutral.setWidth(BUTTON_WIDTH);
		buttonNeutral.setHeight(BUTTON_HEIGHT);
		buttonNeutral.setIcon(new ThemeResource("images/neutralIcon.png"), BUTTON_NEUTRAL);
		
		Button buttonHappy = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		buttonHappy.setWidth(BUTTON_WIDTH);
		buttonHappy.setHeight(BUTTON_HEIGHT);
		buttonHappy.setIcon(new ThemeResource("images/happyIcon.png"), BUTTON_HAPPY);
		
		Button buttonVeryHappy = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		buttonVeryHappy.setWidth(BUTTON_WIDTH);
		buttonVeryHappy.setHeight(BUTTON_HEIGHT);
		buttonVeryHappy.setIcon(new ThemeResource("images/veryHappyIcon.png"), BUTTON_VERYHAPPY);
		
		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonVerySad, buttonSad, buttonNeutral, buttonHappy, buttonVeryHappy);
		contentRow.addComponent(contentRow);
	}
}