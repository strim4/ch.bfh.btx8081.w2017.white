package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.StatisticPresenter;

/**
 * This class is the view of the Statistics screen on this screen the user can
 * define his statistics for a month a half year and a year.
 * 
 * @author Sandra Last
 * Edit: 12.12.17
 */

public class StatisticView extends BaseView implements MoodyView {

	private StatisticPresenter presenter = null;

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_MONAT = "Monat";
	private static final String BUTTON_6MONATE = "6 Monate";
	private static final String BUTTON_JAHR = "Jahr";
	private static final String BUTTON_BACK = "BACK";

	public StatisticView() {
		super();
		super.setTitle("Auswertung");
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {		

		Button buttonMonat = new Button("Monat");
		buttonMonat.addClickListener(this);
		buttonMonat.setId("buttonMonat");
		buttonMonat.setWidth(BUTTON_WIDTH);
		buttonMonat.setHeight(BUTTON_HEIGHT);

		Button button6Monate = new Button("6 Monate");
		button6Monate.addClickListener(this);
		button6Monate.setId("button6Monate");
		button6Monate.setWidth(BUTTON_WIDTH);
		button6Monate.setHeight(BUTTON_HEIGHT);

		Button buttonJahr = new Button("Jahr");
		buttonJahr.addClickListener(this);
		buttonJahr.setId("buttonNeutral");
		buttonJahr.setWidth(BUTTON_WIDTH);
		buttonJahr.setHeight(BUTTON_HEIGHT);

		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonMonat, button6Monate, buttonJahr);
		content.addComponent(contentRow);
		content.setComponentAlignment(contentRow, Alignment.MIDDLE_CENTER);


		Label labelGraf = new Label("Hier wird in Zukunft die Grafik der Auswertung angezeigt");
		super.content.addComponent(labelGraf);
		super.content.setComponentAlignment(labelGraf, Alignment.MIDDLE_CENTER);
		// Chart statisticChart = new Chart();
		// super.content.addComponent(statisticChart);
		// super.content.setComponentAlignment(statisticChart, Alignment.MIDDLE_CENTER);
		// Mit Chart geht das nicht, dazu braucht es eine Lizenz....
		// L�sung m�ssen wir besprechen...

		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("500px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		super.addComponent(buttonBack);
		super.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	}
}