package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

/**
 * This class is the view of the Statistics screen on this screen the user can define his statistics
 * for a month a half year and a year.
 * 
 * @author Sandra
 * Last Edit: 05.12.17
 */

public class StatisticView extends BaseView {

	// private StatisticPresenter presenter = null; => sobald Presenter erstellt,
	// dies aktivieren

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private static final String BUTTON_WIDTH = "160px";
	private static final String BUTTON_HEIGHT = "160px";

	private static final String BUTTON_MONAT = "Monat";
	private static final String BUTTON_6MONATE = "6 Monate";
	private static final String BUTTON_JAHR = "Jahr";
	private static final String BUTTON_HOME = "HOME";

	public StatisticView() {
		super();
		super.setTitle("Auswertung");
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {

		Button buttonMonat = new Button("Monat");
		buttonMonat.setId("buttonMonat");
		buttonMonat.setWidth(BUTTON_WIDTH);
		buttonMonat.setHeight(BUTTON_HEIGHT);

		Button button6Monate = new Button("6 Monate");
		button6Monate.setId("button6Monate");
		button6Monate.setWidth(BUTTON_WIDTH);
		button6Monate.setHeight(BUTTON_HEIGHT);

		Button buttonJahr = new Button("Jahr");
		buttonJahr.setId("buttonNeutral");
		buttonJahr.setWidth(BUTTON_WIDTH);
		buttonJahr.setHeight(BUTTON_HEIGHT);

		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonMonat, button6Monate, buttonJahr);
		content.addComponent(contentRow);

		//Chart statisticChart = new Chart();
		//super.content.addComponent(statisticChart);
		//super.content.setComponentAlignment(statisticChart, Alignment.MIDDLE_CENTER);

		Button buttonHome = new Button("");
		buttonHome.setId("buttonHome");
		buttonHome.setWidth(BUTTON_WIDTH);
		buttonHome.setHeight(BUTTON_HEIGHT);
		buttonHome.setIcon(new FileResource(new File(basepath + "/VAADIN/images/HomeIcon.png")));
		super.content.addComponent(buttonHome);
		super.content.setComponentAlignment(buttonHome, Alignment.MIDDLE_CENTER);
	}
}