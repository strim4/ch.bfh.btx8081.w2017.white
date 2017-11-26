package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
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
		GridLayout layout = new GridLayout(1, 2);
		Label diarylist = new Label("Alte Eintraege");
		layout.addComponent(diarylist, 1, 1);
		
		//TODO Jedes Listenelement als Button zum Öffnen des alten Eintrages --> DiaryElementView
		
		Button back = new Button("Zurueck"); // Back to DiaryView
		layout.addComponent(back, 1, 2);
	}
}
