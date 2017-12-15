package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BarometerModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BarometerView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

	/**
	 * Activity Presenter class does the connection from the Activity to the ActivityView.
	 * 
	 * @author Milena
	 * Last edit: 30.11.17
	 */

	@SuppressWarnings("serial")
	public class BarometerPresenter implements ViewListener{

		@SuppressWarnings("unused")
		private BarometerModel model;
		private BarometerView view;
		
		public BarometerPresenter(BarometerModel model, BarometerView view) {
			this.model = model;
			this.view = view;
			view.addListener(this);
		}
		
		public void buttonClick(ClickEvent event) {
			
			String buttonID = event.getButton().getId();
			
			//TODO add links
			switch(buttonID) {
			case "buttonQuestions":
				view.getUI().getNavigator().navigateTo(Views.QUESTIONNAIRE_VIEW);
				break;
			//case "buttonStatistic":
				//view.getUI().getNavigator().navigateTo(Views.STATISTIC_VIEW);
				//break;
			case "buttonBack":
				view.getUI().getNavigator().navigateTo(Views.START_VIEW);
				break;
			}
		}
	}