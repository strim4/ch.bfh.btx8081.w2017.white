package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;

/**
 * This class shows the creation of a new Diary Picture Element.
 * 
 * @author Chantal
 * Last edit: 26.11.17
 */

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class DiaryPicView {

	public DiaryPicView(){
		GridLayout layout = new GridLayout(1, 4);
		Label diaryPic = new Label("Neuer Fotoeintrag");
		layout.addComponent(diaryPic, 1, 1);
		
		Label date = new Label();
		layout.addComponent(date, 1, 2);
		//Foto upload
		//layout.addComponent(newPicture, 1, 3);
		
		//Save or Cancel the new Diary Input
		Button save = new Button("Speichern");
		layout.addComponent(save, 1, 4);
		Button cancel = new Button("Abbrechen");
		layout.addComponent(cancel, 2, 4);
	}
}