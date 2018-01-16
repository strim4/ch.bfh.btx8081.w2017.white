package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.ContactView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * ContactPresenter Class
 * @author Chantal
 * Last edit: 16.01.18
 */
@SuppressWarnings("serial")
public class ContactPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private ContactView view;
	
	public ContactPresenter(ContactView view) {
		this.view = view;
	}
	
	/**
	 * The public method buttonClick handles the events.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}
