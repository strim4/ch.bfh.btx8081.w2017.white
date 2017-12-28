package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BarometerModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BarometerView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Activity Presenter class does the connection from the Activity to the
 * ActivityView.
 * 
 * @author Milena Last edit: 30.11.17 Sandra Last edit 19.12.2017
 */

// @SuppressWarnings("serial")
public class BarometerPresenter implements ViewListener {

	private static final long serialVersionUID = -1374394707047431893L;
	// Note: Dummy data - should be generated dynamically in the model
	private int[] dummyDataYear = new int[] { 1, 3, 2, 4, 5, 4, 3, 4, 4, 3, 2, 3 };
	private int[] dummyData6Month = new int[] { 3, 4, 4, 3, 2, 3 };
	private int[] dummyDataMonth = new int[] { 1, 3, 2, 4, 5, 4, 3, 4, 4, 3, 4, 3, 2, 2, 2, 2, 5, 4, 3, 4, 4, 3, 2, 4,
			1, 3, 2, 4, 5, 3, 3 };

	@SuppressWarnings("unused")
	//private BarometerModel model; Model einbinden, sobald dieses geschrieben ist!
	private BarometerView view;

	public BarometerPresenter(BarometerModel model, BarometerView view) {
		//this.model = model;
		this.view = view;
		view.showChart("year", dummyDataYear);
		view.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();

		// TODO add links
		switch (buttonID) {
		case "buttonQuestions":
			view.getUI().getNavigator().navigateTo(Views.QUESTIONNAIRE_VIEW);
			break;
		// case "buttonStatistic":
		// view.getUI().getNavigator().navigateTo(Views.STATISTIC_VIEW);
		// break;
		case "buttonMonat":
			view.showChart("month", dummyDataMonth);
			break;
		case "button6Monate":
			view.showChart("6month", dummyData6Month);
			break;
		case "buttonJahr":
			view.showChart("year", dummyDataYear);
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}
}