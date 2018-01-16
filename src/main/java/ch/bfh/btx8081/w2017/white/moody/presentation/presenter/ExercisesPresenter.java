package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.ExercisesView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * Exercises Presenter Class
 * @author Chantal
 * Last edit: 16.01.18
 */
@SuppressWarnings("serial")
public class ExercisesPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private ExercisesView view;
	
	public ExercisesPresenter(ExercisesView view) {
		this.view = view;
	}
	
	/**
	 * The public method buttonClick handles the events of the buttons of this page.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}
