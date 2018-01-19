package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;

/**
 * This class is the view of YES and NO questions.
 * Da diese Klasse vermutlich nicht benutzt wird, verzichte ich auf das Kommentieren.
 * 
 * @author Sandra
 * Last Edit: 18.01.2018
 */

public class QuestionYesNoView extends QuestionnaireView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	
	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_YES = "YES";
	private static final String BUTTON_NO = "NO";

	public QuestionYesNoView() {
		super.setLayouts(0.35f, 0.65f, 0, 0);
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
		content.setComponentAlignment(contentRow, Alignment.MIDDLE_CENTER);

		buttonYes.setWidth(BUTTON_WIDTH);
		buttonYes.setHeight(BUTTON_HEIGHT);
		
		buttonNo.setWidth(BUTTON_WIDTH);
		buttonNo.setHeight(BUTTON_HEIGHT);
	}
}