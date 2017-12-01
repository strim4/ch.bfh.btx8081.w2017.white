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
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.DiaryModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.ActivityPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.BasePresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryElementListPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryElementPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPicPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryTextPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementListView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryPicView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.StartView;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 * 
 * @author Moritz
 * @author Chantal
 * Last edit: 30.11.17 
 */
@SuppressWarnings("serial")
@Theme("mytheme")
public class MyUI extends UI {
	
		public final static String HEIGHT = "100%";
		public final static String WIDTH = "100%";
	
		Navigator navigator;

		//Base
		BaseModel model = new BaseModel();
		BaseView view = new BaseView();
		StartView start = new StartView();
		
		//Diary
		DiaryView diary = new DiaryView();
		DiaryModel diaryModel = new DiaryModel();
		
		DiaryTextView text = new DiaryTextView();
		DiaryText diaryText = new DiaryText();
		DiaryPicView pic = new DiaryPicView();
		DiaryPic diaryPic = new DiaryPic();
		ActivityView activityView = new ActivityView();
		Activity activity = new Activity();
		DiaryElementListView list = new DiaryElementListView();
		DiaryElement diaryElement = new DiaryElement();
		DiaryElementView element = new DiaryElementView();

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    		
    		final VerticalLayout layout = new VerticalLayout();
    		setContent(layout);
    		
        	getPage().setTitle("Moody");
    		layout.setWidth(WIDTH);
    		layout.setHeight(null);
    		layout.setResponsive(true);
    		
    		
   
    		
    		ComponentContainerViewDisplay viewDisplay = new ComponentContainerViewDisplay(layout);
    		navigator = new Navigator(UI.getCurrent(), viewDisplay);
    		
    		navigator.addView("base", view);
    		navigator.addView("", start);
    		navigator.addView("diary", diary);
    		
  		navigator.addView("text", text);
  		navigator.addView("picture", pic);
   		navigator.addView("activity", activityView);
    		navigator.addView("list", list);
    		navigator.addView("element", element);
    		
    		new BasePresenter(model, start);
    		new DiaryPresenter(diaryModel, diary);
    		
    		new DiaryTextPresenter(diaryText, text);
    		new DiaryPicPresenter(diaryPic, pic);
    		new ActivityPresenter(activity, activityView);
    		new DiaryElementListPresenter(list);
    		new DiaryElementPresenter(diaryElement, element);
       
   }

   @WebServlet(urlPatterns = "/*", name = "Moody", asyncSupported = true)
   @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
   public static class MoodyUIServlet extends VaadinServlet {
   }
    }
