package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This class is the view of the Diary screen
 * and on this screen the user can create new Diary Elements 
 * or open the list of the already recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 26.11.17
 */

public class DiaryView extends BaseView{
	
	public DiaryView(){
	GridLayout layout = new GridLayout(3, 3); //first columns, than rows
	Label diary = new Label("Tagebuch");
	layout.addComponent(diary, 2, 1);
	
	/**
	 * Buttons for new Diary Input
	 */
	Button newText = new Button("Neuer Text");
	Button newPic = new Button("Neues Foto");
	Button newActivity = new Button("Neue Aktivitaet");
	Button ListDiaryElements = new Button("Alte Eintraege");

	layout.addComponent(newText, 1, 2);
	layout.addComponent(newPic, 2, 2);
	layout.addComponent(newActivity, 3, 2);
	layout.addComponent(ListDiaryElements, 1, 3);
	
	}

}
