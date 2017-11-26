package ch.bfh.btx8081.w2017.white.moody.presentation.views;

/**
 * This class shows the creation of a new Diary Text Element.
 * 
 * @author Chantal
 * Last edit: 26.11.17
 */

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class DiaryTextView {

	public DiaryTextView(){
		GridLayout layout = new GridLayout(1, 3);
		Label diaryText = new Label("Neuer Texteintrag");
		layout.addComponent(diaryText, 1, 1);
		
		Label date = new Label();
		layout.addComponent(date, 1, 2);
		TextField newText = new TextField();
		layout.addComponent(newText, 1, 3);
	}
}
