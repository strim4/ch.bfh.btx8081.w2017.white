package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.navigator.View;

/**
 * MoodyView interface
 * @author Chantal
 * Last edit: 16.01.18
 */

public interface MoodyView extends View, ViewListener{

    /**
     * The public method addListener adds objects to the listener.
     */
	public void addListener(ViewListener listener);
	
}
