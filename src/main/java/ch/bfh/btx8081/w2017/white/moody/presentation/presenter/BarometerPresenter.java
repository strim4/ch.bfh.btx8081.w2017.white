package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import java.util.Calendar;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BarometerModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ComputeResultEmoji;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ComputeResultYesNo;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BarometerView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * Activity Presenter class does the connection from the Activity to the
 * ActivityView.
 * 
 * @author Milena Last edit: 17.01.2018 Sandra Last edit 19.12.2017
 */

// @SuppressWarnings("serial")
public class BarometerPresenter implements ViewListener {

	private static final long serialVersionUID = -1374394707047431893L;
	// Note: Dummy data - should be generated dynamically in the model
	private int[] dummyDataYear = new int[] { 1, 3, 2, 4, 5, 4, 3, 4, 4, 3, 2, 3 };
	private int[] dummyData6Month = new int[] { 3, 4, 4, 3, 2, 3 };
	private int[] dummyDataMonth = new int[] { 1, 3, 2, 4, 5, 4, 3, 4, 4, 3, 4, 3, 2, 2, 2, 2, 5, 4, 3, 4, 4, 3, 2, 4,
			1, 3, 2, 4, 5, 3, 3 };
	
	private ComputeResultYesNo compYN = new ComputeResultYesNo();
	private ComputeResultEmoji compE = new ComputeResultEmoji();
	private String strain;

	@SuppressWarnings("unused")
	//private BarometerModel model; Model einbinden, sobald dieses geschrieben ist!
	private BarometerView view;

	public BarometerPresenter(BarometerModel model, BarometerView view) {
		//this.model = model;
		this.view = view;
		int[] year = compE.computeYear(Calendar.getInstance());
		view.showChart("year",year);
		//view.showChart("year", dummyDataYear);
		strain = compYN.computeMonth(Calendar.getInstance());
		view.showStrain(strain);
		view.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		Calendar cal = Calendar.getInstance();
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
			int[] month = compE.computeMonth(cal);
			view.showChart("month",month);
			strain = compYN.computeMonth(Calendar.getInstance());
			view.showStrain(strain);
			break;
		case "button6Monate":
			int[] sixMonth = compE.computeSixMonths(cal);
			view.showChart("6month",sixMonth);
			strain = compYN.computeSixMonths(Calendar.getInstance());
			view.showStrain(strain);
			break;
		case "buttonJahr":
			int[] year = compE.computeYear(cal);
			view.showChart("year",year);
			strain = compYN.computeYear(Calendar.getInstance());
			view.showStrain(strain);
			break;
		case "buttonBack":
			view.getUI().getNavigator().navigateTo(Views.START_VIEW);
			break;
		}
	}
}