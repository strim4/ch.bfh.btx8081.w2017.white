package ch.bfh.btx8081.w2017.white.moody;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.BasePresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SuppressWarnings({"serial", "unused"})
@Theme("mytheme")
public class MyUI extends UI {
	
		public final static String HEIGHT = "";
		public final static String WIDTH = "";
	
	BaseModel model = new BaseModel();
	BaseView view = new BaseView();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	BasePresenter presenter = new BasePresenter(model, view);
    	
    	getPage().setTitle("Moody");
    	setWidth(HEIGHT);
    	setHeight(HEIGHT);
    	
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
