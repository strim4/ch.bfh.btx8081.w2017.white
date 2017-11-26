package ch.bfh.btx8081.w2017.white.moody.presentation.views;

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
		GridLayout layout = new GridLayout(1, 3);
		Label diaryPic = new Label("Neuer Fotoeintrag");
		layout.addComponent(diaryPic, 1, 1);
		
		Label date = new Label();
		layout.addComponent(date, 1, 2);
		//Foto upload
		//layout.addComponent(newPicture, 1, 3);
	}
}