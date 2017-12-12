package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.presentation.views.ContactView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ViewListener;

/**
 * 
 * @author Chantal
 * Last edit: 10.12.17
 */
@SuppressWarnings("serial")
public class ContactPresenter implements ViewListener{

	@SuppressWarnings("unused")
	private ContactView view;
	
	public ContactPresenter(ContactView view) {
		this.view = view;
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

}
