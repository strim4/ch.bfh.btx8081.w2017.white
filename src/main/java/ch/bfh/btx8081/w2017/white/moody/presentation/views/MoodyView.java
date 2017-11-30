package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.navigator.View;

/**
 * MoodyView interface
 * @author Chantal
 * Last edit: 30.11.17
 */

public interface MoodyView extends View, ViewListener{

	public void addListener(ViewListener listener);
	
}
