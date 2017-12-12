package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.SettingsModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.SettingsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.Views;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */
@SuppressWarnings("serial")
public class SettingsPresenter implements ViewListener{

	private SettingsModel model;
	private SettingsView view;
	
	public SettingsPresenter(SettingsModel model, SettingsView view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	@Override
	public void buttonClick(ClickEvent event) {
		
		String buttonID = event.getButton().getId();
		
		switch(buttonID) {
		case "profile":
			view.getUI().getNavigator().navigateTo(Views.PROFILE_VIEW);
			break;
		case "profileB":
			break;
		}
		
	}

}
