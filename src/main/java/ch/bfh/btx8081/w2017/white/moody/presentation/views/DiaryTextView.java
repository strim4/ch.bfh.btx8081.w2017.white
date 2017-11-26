package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;

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
		GridLayout layout = new GridLayout(1, 4);
		Label diaryText = new Label("Neuer Texteintrag");
		layout.addComponent(diaryText, 1, 1);
		
		Label date = new Label();
		layout.addComponent(date, 1, 2);
		TextField newText = new TextField();
		layout.addComponent(newText, 1, 3);
		
		
		//Save or Cancel the new Diary Input
		Button save = new Button("Speichern");
		layout.addComponent(save, 1, 4);
		Button cancel = new Button("Abbrechen");
		layout.addComponent(cancel, 2, 4);
	}
}
