package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

/**
 * This class shows the creation of a new Activity in the Diary.
 * 
 * @author Chantal
 * Last edit: 26.11.17
 */

public class ActivityView {

	public ActivityView(){
		GridLayout layout = new GridLayout(1, 5);
		Label activity = new Label("Neue Aktivitaet");
		layout.addComponent(activity, 1, 1);
		
		Label date = new Label();//Datum vom System nehmen, spaeter dann auch zurueckversetzten moeglich
		layout.addComponent(date, 1, 2);
		//Aktivitaet auswaehlen
		//layout.addComponent(component, 1, 3);
		Button newActivity = new Button("Neue erstellen");
		layout.addComponent(newActivity, 1, 4);
		
		//Save or Cancel the new Diary Input
		Button save = new Button("Speichern");
		layout.addComponent(save, 1, 5);
		Button cancel = new Button("Abbrechen");
		layout.addComponent(cancel, 2, 5);
	}
}
