package ch.bfh.btx8081.w2017.white.moody;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.BasePresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SuppressWarnings("serial")
@Theme("mytheme")
public class MyUI extends UI {
	
		public final static String HEIGHT = "";
		public final static String WIDTH = "";
	
		Navigator navigator;
		BaseModel model;
		BaseView view;
		BasePresenter presenter;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    		
    		final VerticalLayout layout = new VerticalLayout();
    		setContent(layout);
    		
        	getPage().setTitle("Moody");
    		layout.setWidth(WIDTH);
    		layout.setHeight(HEIGHT);
    		
    		ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(layout);
    		navigator = new Navigator(UI.getCurrent(), viewDisplay);
    		model = new BaseModel();
    		view = new BaseView();
    		navigator.addView("", view);
    		navigator.addView("Tagebuch", new DiaryView());
    		presenter = new BasePresenter(model, view);
    	
    	//habe dies in die BaseView genommen, hoffe das ist gut so
//   	 final VerticalLayout layout = new VerticalLayout();
//       layout.setHeight(HEIGHT);
//       layout.setWidth(WIDTH);
//       layout.setMargin(false);
//       layout.setSpacing(false);
//       setContent(layout);
       
   }

   @WebServlet(urlPatterns = "/*", name = "Moody", asyncSupported = true)
   @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
   public static class HealthVisAppUIServlet extends VaadinServlet {
   }
    }
