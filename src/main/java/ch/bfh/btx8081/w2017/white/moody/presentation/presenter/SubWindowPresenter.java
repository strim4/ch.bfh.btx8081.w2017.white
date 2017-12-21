package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.SubWindowView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * 
 * @author Roberto
 *
 */

@SuppressWarnings("serial")
public class SubWindowPresenter implements ViewListener {
	
	@SuppressWarnings("unused")
	private SubWindowView view;
	
	public SubWindowPresenter(SubWindowView view) {
		this.view = view;
	}

	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}
