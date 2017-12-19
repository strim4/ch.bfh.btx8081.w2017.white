package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * This class shows the popup to store a new activity
 * 
 * @author Roberto
 *
 */

//@suppressWarnings("serial")
public class PopupView extends BaseView implements MoodyView {
    private VerticalLayout layout;
    private TextField textField;
    private DateField date;
    Button hinzufügen;

    
    
    private PopupView() {

        // Content for the PopupView
        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(textField);
        layout.addComponent(date);
        layout.addComponent(hinzufügen);
    }

    //@Override
    public final Component getPopupComponent() {
        return layout;
    }

    //@Override
    public final String getMinimizedValueAsHTML() {
        return textField.getValue();
    }
}