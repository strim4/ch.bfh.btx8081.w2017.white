package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinService;
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
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
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
		
		Button buttonVerySad = new Button("");
		buttonVerySad.setId("buttonVerySad");
		buttonVerySad.setWidth(BUTTON_WIDTH);
		buttonVerySad.setHeight(BUTTON_HEIGHT);
		buttonVerySad.setIcon(new FileResource(new File (basepath +"/VAADIN/images/VerySadIcon.png")));
		
		Button buttonSad = new Button("");
		buttonSad.setId("buttonSad");	
		buttonSad.setWidth(BUTTON_WIDTH);
		buttonSad.setHeight(BUTTON_HEIGHT);
		buttonSad.setIcon(new FileResource(new File (basepath +"/VAADIN/images/SadIcon.png")));
		
		Button buttonNeutral = new Button("");
		buttonNeutral.setId("buttonNeutral");
		buttonNeutral.setWidth(BUTTON_WIDTH);
		buttonNeutral.setHeight(BUTTON_HEIGHT);
		buttonNeutral.setIcon(new FileResource(new File (basepath +"/VAADIN/images/SmileyIcon.png")));
		
		Button buttonHappy = new Button("");
		buttonHappy.setId("buttonHappy");		
		buttonHappy.setWidth(BUTTON_WIDTH);
		buttonHappy.setHeight(BUTTON_HEIGHT);
		buttonHappy.setIcon(new FileResource(new File (basepath +"/VAADIN/images/HappyIcon.png")));
		
		Button buttonVeryHappy = new Button("");
		buttonVeryHappy.setId("buttonVeryHappy");
		buttonVeryHappy.setWidth(BUTTON_WIDTH);
		buttonVeryHappy.setHeight(BUTTON_HEIGHT);
		buttonVeryHappy.setIcon(new FileResource(new File (basepath +"/VAADIN/images/VeryHappyIcon.png")));
		
		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonVerySad, buttonSad, buttonNeutral, buttonHappy, buttonVeryHappy);
		content.addComponent(contentRow);
	}
}