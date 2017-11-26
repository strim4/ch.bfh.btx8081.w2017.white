package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPresenter;

/**
 * This class is the view of the Diary screen
 * and on this screen the user can create new Diary Elements 
 * or open the list of the already recorded Diary Elements.
 * 
 * @author Chantal
 * Last Edit: 26.11.17
 */

public class DiaryView extends BaseView{
	
	//private DiaryPresenter presenter = null;
	
	public DiaryView(){
	GridLayout layout = new GridLayout(3, 4); //first columns, than rows
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
	layout.setComponentAlignment(newText, Alignment.TOP_CENTER);
	layout.addComponent(newPic, 2, 2);
	layout.setComponentAlignment(newPic, Alignment.TOP_CENTER);
	layout.addComponent(newActivity, 3, 2);
	layout.setComponentAlignment(newActivity, Alignment.TOP_CENTER);
	layout.addComponent(ListDiaryElements, 1, 3);
	layout.setComponentAlignment(ListDiaryElements, Alignment.TOP_CENTER);
	
	Button back = new Button("Zurueck"); //Back to Main View
	layout.addComponent(back, 1, 4);
	layout.setComponentAlignment(back, Alignment.TOP_CENTER);
	
	// TODO Handling click event
	
	}

}
