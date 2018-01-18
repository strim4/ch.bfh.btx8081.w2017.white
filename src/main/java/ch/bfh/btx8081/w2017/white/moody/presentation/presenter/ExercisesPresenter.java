package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.shared.Position;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.ExercisesView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * Exercises Presenter Class
 * 
 * @author Chantal
 * @author Zoran Last edit: 18.01.2018
 */
@SuppressWarnings("serial")
public class ExercisesPresenter implements ViewListener {

	@SuppressWarnings("unused")
	private ExercisesView view;

	public ExercisesPresenter(ExercisesView view) {
		this.view = view;
		view.addListener(this);
	}

	/**
	 * The public method buttonClick handles the events of the buttons of this page.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		String buttonID = event.getButton().getId();

		switch (buttonID) {

		case "buttonPlay":
			view.video.play();
			break;

		case "buttonPause":
			view.video.pause();
			Notification pause = new Notification("");
			pause.setPosition(Position.MIDDLE_CENTER);
			Notification.show("Excercise Paused");
			break;

		}

	}
}
