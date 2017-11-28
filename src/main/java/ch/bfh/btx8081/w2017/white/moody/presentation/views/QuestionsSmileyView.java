package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
/**
 * This class is the view of the smiley question.
 * 
 * @author Sandra
 * Last Edit: 28.11.17
 */
public class QuestionsSmileyView extends QuestionsView {
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";
	
	private static final String BUTTON_VERYSAD = "VERYSAD";
	private static final String BUTTON_SAD = "SAD";
	private static final String BUTTON_NEUTRAL = "NEUTRAL";
	private static final String BUTTON_HAPPY = "HAPPY";
	private static final String BUTTON_VERYHAPPY = "VERYHAPPY";

	public QuestionsSmileyView() {
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
		
		super.content.addComponent(buttonVerySad);
		super.content.setComponentAlignment(buttonVerySad, Alignment.BOTTOM_CENTER);
		
		buttonVerySad.setWidth(BUTTON_WIDTH);
		buttonVerySad.setHeight(BUTTON_HEIGHT);
		buttonVerySad.setIcon(new ThemeResource("images/verySadIcon.png"), BUTTON_VERYSAD);

		Button buttonSad = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonSad);
		super.content.setComponentAlignment(buttonSad, Alignment.BOTTOM_CENTER);
		
		buttonSad.setWidth(BUTTON_WIDTH);
		buttonSad.setHeight(BUTTON_HEIGHT);
		buttonSad.setIcon(new ThemeResource("images/sadIcon.png"), BUTTON_SAD);
		
		Button buttonNeutral = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonNeutral);
		super.content.setComponentAlignment(buttonNeutral, Alignment.BOTTOM_CENTER);
		
		buttonNeutral.setWidth(BUTTON_WIDTH);
		buttonNeutral.setHeight(BUTTON_HEIGHT);
		buttonNeutral.setIcon(new ThemeResource("images/neutralIcon.png"), BUTTON_NEUTRAL);
		
		Button buttonHappy = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonHappy);
		super.content.setComponentAlignment(buttonHappy, Alignment.BOTTOM_CENTER);
		
		buttonHappy.setWidth(BUTTON_WIDTH);
		buttonHappy.setHeight(BUTTON_HEIGHT);
		buttonHappy.setIcon(new ThemeResource("images/happyIcon.png"), BUTTON_HAPPY);
		
		Button buttonVeryHappy = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
			}
		});
		
		super.content.addComponent(buttonVeryHappy);
		super.content.setComponentAlignment(buttonVeryHappy, Alignment.BOTTOM_CENTER);		
		
		buttonVeryHappy.setWidth(BUTTON_WIDTH);
		buttonVeryHappy.setHeight(BUTTON_HEIGHT);
		buttonVeryHappy.setIcon(new ThemeResource("images/veryHappyIcon.png"), BUTTON_VERYHAPPY);
	}
}