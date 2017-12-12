package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.StatisticModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.StatisticView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/* *
 * StatisticPresenter Class
 * 
 * @author Sandra
 * LastEdit: 12.12.17
 */

public class StatisticPresenter implements ViewListener {
	@SuppressWarnings("unused")
	private StatisticModel statisticModel;
	private StatisticView statisticView;

	public StatisticPresenter(StatisticModel statisticModel, StatisticView statisticView) {
		this.statisticModel = statisticModel;
		this.statisticView = statisticView;
		statisticView.addListener(this);
	}

	public void buttonClick(ClickEvent event) {

		String buttonID = event.getButton().getId();
		
		switch (buttonID) {
		case "buttonBack":
			statisticView.getUI().getNavigator().navigateTo(Views.BAROMETER_VIEW);			
			break;
		}
	}
}