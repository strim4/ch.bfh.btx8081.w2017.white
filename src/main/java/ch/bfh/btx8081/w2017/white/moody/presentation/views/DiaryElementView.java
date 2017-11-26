package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This class shows a selected Diary Element of the Diary Element List.
 * The Element could be an activity, a text or a picture element of the diary.
 * 
 * @author Chantal
 * Last edit: 26.11.17
 *
 */
public class DiaryElementView {
	
	public DiaryElementView(){
		GridLayout layout = new GridLayout();
		Label diaryElement = new Label("Ausgewaehlter Eintrag");
		layout.addComponent(diaryElement);
	}

}