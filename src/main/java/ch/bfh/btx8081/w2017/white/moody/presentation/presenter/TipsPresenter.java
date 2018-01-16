package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.TipsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * Tips Presenter Class
 * @author Chantal
 * Last edit: 16.01.18
 */
@SuppressWarnings("serial")
public class TipsPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private TipsView view;
	
	public TipsPresenter(TipsView view) {
		this.view = view;
	}
	
	/**
	 * The public method buttonClick handles the events of the buttons.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}
