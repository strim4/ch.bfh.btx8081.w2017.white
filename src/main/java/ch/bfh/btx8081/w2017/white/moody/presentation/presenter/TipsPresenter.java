package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.TipsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */
@SuppressWarnings("serial")
public class TipsPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private TipsView view;
	
	public TipsPresenter(TipsView view) {
		this.view = view;
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}