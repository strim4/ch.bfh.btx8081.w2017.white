package ch.bfh.btx8081.w2017.white.moody;

import javax.servlet.annotation.WebServlet;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.navigator.Navigator.ComponentContainerViewDisplay;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BarometerModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.DiaryModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.NotificationModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.ProfileModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.QuestionModel;
import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.SettingsModel;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Activity;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryPic;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.ActivityPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.BarometerPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.BasePresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.ContactPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryElementListPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryElementPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPicPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryTextPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.ExercisesPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.InformationsPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.NotificationPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.ProfilePresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.QuestionPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.SettingsPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.TipsPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ActivityView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BarometerView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ContactView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementListView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryElementView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryPicView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ExercisesView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.InformationsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.NotificationView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.ProfileView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionSmileyView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.QuestionYesNoView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.SettingsView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.StartView;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.TipsView;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of an HTML page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 * 
 * @author Moritz
 * @author Chantal Last edit: 12.12.17
 * @author Milena Last edit: 30.11.17
 * @author Zoran Last edit: 05.12.2017
 */
@Push
@SuppressWarnings("serial")
@Theme("mytheme")
public class MyUI extends UI {

	public final static String HEIGHT = "100%";
	public final static String WIDTH = "100%";

	Navigator navigator;

	// Base
	BaseModel model = new BaseModel();
	BaseView view = new BaseView();
	StartView start = new StartView();

	// Settings
	SettingsView settings = new SettingsView();
	SettingsModel settingsModel = new SettingsModel();
	ProfileView profile = new ProfileView();
	ProfileModel profileModel = new ProfileModel();
	
	// Diary
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

	//Exercises
	ExercisesView exercises = new ExercisesView();
	
	//Informations
	InformationsView informations = new InformationsView();
	
	//Tips
	TipsView tips = new TipsView();
	
	//Contact
	ContactView contact = new ContactView();
	
	// Barometer
	BarometerView barometer = new BarometerView();
	BarometerModel barometerModel = new BarometerModel();

	// Questions
	// QuestionView question = new QuestionView(); Wird nicht gebraucht, da dem User nur Yes/No und Smiley angezeigt werden
	QuestionYesNoView questionYesNo = new QuestionYesNoView();
	QuestionSmileyView questionSmiley = new QuestionSmileyView();
	QuestionModel questionModel = new QuestionModel();

	// Notification
	NotificationView notification = new NotificationView();
	NotificationModel notificationModel = new NotificationModel();
	
	//Statistic
	//StatisticView statistic = new StatisticView();	
	//StatisticModel statisticModel = new StatisticModel();
	
	// NotificationUI
	PushNotificationUI pNotificationUI;

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
		navigator.addView("contact", contact);
		navigator.addView("exercises", exercises);
		navigator.addView("exercises", exercises);
		navigator.addView("informations", informations);
		navigator.addView("tips", tips);
		navigator.addView("barometer", barometer);
		navigator.addView("settings", settings);
		navigator.addView("profile", profile);

		// navigator.addView("question", question); Begruendung siehe oben
		navigator.addView("questionyesno", questionYesNo);
		navigator.addView("questionsmiley", questionSmiley);

		navigator.addView("notification", notification);
		
		//navigator.addView("statistic", statistic);

		new BasePresenter(model, start);
		new SettingsPresenter(settingsModel, settings);
		new ProfilePresenter(profileModel, profile);
		
		new DiaryPresenter(diaryModel, diary);
		new DiaryTextPresenter(diaryText, text);
		new DiaryPicPresenter(diaryPic, pic);
		new ActivityPresenter(activity, activityView);
		new DiaryElementListPresenter(list);
		new DiaryElementPresenter(diaryElement, element);

		new ContactPresenter(contact);
		new ExercisesPresenter(exercises);
		new InformationsPresenter(informations);
		new TipsPresenter(tips);
		
		//new StatisticPresenter(statisticModel, statistic); warum ist das wieder da? Es gibt keinen Statisticpresenter mehr.
		// den musste ich raus nehmen! Siehe ein paar Zeilen weiter unten...

		new BarometerPresenter(barometerModel, barometer);
		// new QuestionPresenter(questionModel, question); Begruendung siehe oben
		new QuestionPresenter(questionModel, questionYesNo);
		new QuestionPresenter(questionModel, questionSmiley);
		new NotificationPresenter(notificationModel, notification);
		
		//new StatisticPresenter(statisticModel, statistic);
	

		// NotificationUI launch with his concurrent Thread
		pNotificationUI = new PushNotificationUI(UI.getCurrent(), layout);
		pNotificationUI.start();

	}

	@WebServlet(urlPatterns = "/*", name = "Moody", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MoodyUIServlet extends VaadinServlet {
	}
}