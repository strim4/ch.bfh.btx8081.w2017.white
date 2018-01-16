package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.InformationsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * Informations Presenter Class
 * @author Chantal
 * Last edit: 10.12.17
 */
@SuppressWarnings("serial")
public class InformationsPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private InformationsView view;
	
	public InformationsPresenter(InformationsView view) {
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