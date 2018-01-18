package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.Question;
import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.QuestionnairePresenter;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * This class is the view of the Questions screen on this screen the user recive
 * everyday 4 questions to answer.
 * 
 * @author Sandra
 * @author Silvan Last Edit: 2017-12-07
 */

public class QuestionnaireView extends BaseView implements MoodyView {

	private QuestionnairePresenter presenter = null;

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	private String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
	private DBManager dbm = DBManager.getInstance();
	private List<Question> ListQ = dbm.getQuestion();
	
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	private Date entryDate;
	private Question question;

	private VerticalLayout vertical;
	private HorizontalLayout yn;
	private HorizontalLayout e;
	private Label questionYN;
	private Label questionE;

	public QuestionnaireView() {
		super();
		super.setTitle("Tägliche Fragen");
		question =getRandomQuestion();
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createLayout();
	}

	@SuppressWarnings("serial")
	private void createLayout() {
		vertical = new VerticalLayout();
		yn = new HorizontalLayout();
		e = new HorizontalLayout();
		question =getRandomQuestion();
		questionYN= new Label(question.getQuestionText());
		questionE=new Label("Wie fühlst du dich heute?");

		vertical.addComponent(questionYN);
		vertical.addComponent(yn);
		vertical.addComponent(questionE);
		vertical.addComponent(e);
		vertical.setComponentAlignment(questionYN, Alignment.MIDDLE_CENTER);
		vertical.setComponentAlignment(yn, Alignment.MIDDLE_CENTER);
		vertical.setComponentAlignment(questionE, Alignment.MIDDLE_CENTER);
		vertical.setComponentAlignment(e, Alignment.MIDDLE_CENTER);

		super.content.addComponent(vertical);
		super.content.setComponentAlignment(vertical, Alignment.MIDDLE_CENTER);

		Button buttonYes = new Button("Ja");
		buttonYes.addClickListener(this);
		buttonYes.setId("buttonYes");
		buttonYes.setWidth(BUTTON_WIDTH);
		buttonYes.setHeight(BUTTON_HEIGHT);
		yn.addComponent(buttonYes);

		Button buttonNo = new Button("Nein");
		buttonNo.addClickListener(this);
		buttonNo.setId("buttonNo");
		buttonNo.setWidth(BUTTON_WIDTH);
		buttonNo.setHeight(BUTTON_HEIGHT);
		super.content.addComponent(buttonNo);
		super.content.setComponentAlignment(buttonNo, Alignment.MIDDLE_CENTER);
		yn.addComponent(buttonNo);

		Button buttonVS = new Button("");
		buttonVS.addClickListener(this);
		buttonVS.setId("buttonVerySad");
		buttonVS.setWidth(BUTTON_WIDTH);
		buttonVS.setHeight(BUTTON_HEIGHT);
		buttonVS.setIcon(new FileResource(new File(basepath + "/VAADIN/images/verysadIcon.png")));
		super.content.addComponent(buttonVS);
		super.content.setComponentAlignment(buttonVS, Alignment.MIDDLE_CENTER);
		e.addComponent(buttonVS);

		Button buttonS = new Button("");
		buttonS.addClickListener(this);
		buttonS.setId("buttonSad");
		buttonS.setWidth(BUTTON_WIDTH);
		buttonS.setHeight(BUTTON_HEIGHT);
		buttonS.setIcon(new FileResource(new File(basepath + "/VAADIN/images/sadIcon.png")));
		super.content.addComponent(buttonS);
		super.content.setComponentAlignment(buttonS, Alignment.MIDDLE_CENTER);
		e.addComponent(buttonS);

		Button buttonN = new Button("");
		buttonN.addClickListener(this);
		buttonN.setId("buttonNeutral");
		buttonN.setWidth(BUTTON_WIDTH);
		buttonN.setHeight(BUTTON_HEIGHT);
		buttonN.setIcon(new FileResource(new File(basepath + "/VAADIN/images/SmileyIcon.png")));
		super.content.addComponent(buttonN);
		super.content.setComponentAlignment(buttonN, Alignment.MIDDLE_CENTER);
		e.addComponent(buttonN);

		Button buttonH = new Button("");
		buttonH.addClickListener(this);
		buttonH.setId("buttonHappy");
		buttonH.setWidth(BUTTON_WIDTH);
		buttonH.setHeight(BUTTON_HEIGHT);
		buttonH.setIcon(new FileResource(new File(basepath + "/VAADIN/images/happyIcon.png")));
		super.content.addComponent(buttonH);
		super.content.setComponentAlignment(buttonH, Alignment.MIDDLE_CENTER);
		e.addComponent(buttonH);

		Button buttonVH = new Button("");
		buttonVH.addClickListener(this);
		buttonVH.setId("buttonVeryHappy");
		buttonVH.setWidth(BUTTON_WIDTH);
		buttonVH.setHeight(BUTTON_HEIGHT);
		buttonVH.setIcon(new FileResource(new File(basepath + "/VAADIN/images/veryhappyIcon.png")));
		super.content.addComponent(buttonVH);
		super.content.setComponentAlignment(buttonVH, Alignment.MIDDLE_CENTER);
		e.addComponent(buttonVH);
	}

	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);
	}
	
	public Question getShowedQuestion(){
    	return question;
    }
	
	public Date getDate() {
		return entryDate;
	}
	
	private Question getRandomQuestion(){
		Random random = new Random();
		int i = random.nextInt(ListQ.size());
		Question q = ListQ.get(i);
		return q;
	}

}