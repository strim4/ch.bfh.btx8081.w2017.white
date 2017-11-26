package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This Class shows a list of the recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 26.11.17
 */

public class DiaryElementListView {

	public DiaryElementListView(){
		GridLayout layout = new GridLayout();
		Label diarylist = new Label("Alte Eintraege");
		layout.addComponent(diarylist);
	}
}
