package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.vaadin.highcharts.HighChart;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * This class is the view of the Mood-Barometer
 * 
 * @author Milena Last Edit: 17.01.2018 Sandra Last Edit: 19.12.2017
 */

// @SuppressWarnings("serial")
public class BarometerView extends BaseView {

	private static final long serialVersionUID = -6026931252073823269L;
	private static final String BUTTON_WIDTH = "120px";
	private static final String BUTTON_HEIGHT = "120px";

	String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

	private static final String BUTTON_MONAT = "Monat";
	private static final String BUTTON_6MONATE = "6 Monate";
	private static final String BUTTON_JAHR = "Jahr";
	private static final String BUTTON_BACK = "BACK";
	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	private HighChart chart = new HighChart();
	private VerticalLayout pictures = new VerticalLayout();
	private HorizontalLayout pChart = new HorizontalLayout();

	Label strain = new Label();
	Label strainTxt = new Label("Deine Aktuelle Belastung:");

	// private static final String IMAGE_WIDTH = "60px";
	// private static final String IMAGE_HEIGHT = "60px";

	// private static final String IMAGE_VERYSAD = "VERYSAD";
	// private static final String IMAGE_SAD = "SAD";
	// private static final String IMAGE_NEUTRAL = "NEUTRAL";
	// private static final String IMAGE_HAPPY = "HAPPY";
	// private static final String IMAGE_VERYHAPPY = "VERYHAPPY";

	public BarometerView() {
		super();
		super.setTitle("Barometer");
		super.setLayouts(0.35f, 0.65f, 0, 0);
		this.createButtons();
	}

	@SuppressWarnings("serial")
	private void createButtons() {
		// HorizontalLayout newBarometerElement = new HorizontalLayout();
		// super.content.addComponent(newBarometerElement);
		// super.content.setComponentAlignment(newBarometerElement,
		// Alignment.MIDDLE_CENTER);

		Button buttonQuestions = new Button("Taegliche Fragen");// Text
																// entfernen,
																// sobald Icon
																// funktioniert
		buttonQuestions.addClickListener(this);
		buttonQuestions.setId("buttonQuestions");
		buttonQuestions.setWidth("380px");
		buttonQuestions.setHeight(BUTTON_HEIGHT);
		// buttonQuestions.setIcon(new ThemeResource("images/Questions.png"),
		// BUTTON_TEXT); Es besteht noch kein Image
		// newBarometerElement.addComponent(buttonQuestions);
		// newBarometerElement.setComponentAlignment(buttonQuestions,
		// Alignment.MIDDLE_CENTER);
		super.content.addComponent(buttonQuestions);
		super.content.setComponentAlignment(buttonQuestions, Alignment.MIDDLE_CENTER);

		Image vh = getImage("veryhappyIcon.png");

		pictures.addComponent(vh);
		pictures.setComponentAlignment(vh, Alignment.MIDDLE_LEFT);

		Image h = getImage("happyIcon.png");
		pictures.addComponent(h);
		pictures.setComponentAlignment(h, Alignment.MIDDLE_LEFT);

		Image n = getImage("happyIcon.png");
		pictures.addComponent(n);
		pictures.setComponentAlignment(n, Alignment.MIDDLE_LEFT);

		Image s = getImage("happyIcon.png");
		pictures.addComponent(s);
		pictures.setComponentAlignment(s, Alignment.MIDDLE_LEFT);

		Image vs = getImage("happyIcon.png");
		pictures.addComponent(vs);
		pictures.setComponentAlignment(vs, Alignment.MIDDLE_LEFT);

		pChart.addComponent(pictures);
		pChart.addComponent(chart);
		super.content.addComponent(pChart);
		super.content.setComponentAlignment(pChart, Alignment.MIDDLE_CENTER);

		super.content.addComponent(strainTxt);
		super.content.setComponentAlignment(strainTxt, Alignment.MIDDLE_CENTER);

		super.content.addComponent(strain);
		super.content.setComponentAlignment(strain, Alignment.MIDDLE_CENTER);

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
		buttonJahr.setId("buttonJahr");
		buttonJahr.setWidth(BUTTON_WIDTH);
		buttonJahr.setHeight(BUTTON_HEIGHT);

		HorizontalLayout contentRow = new HorizontalLayout();
		contentRow.addComponents(buttonMonat, button6Monate, buttonJahr);
		content.addComponent(contentRow);
		content.setComponentAlignment(contentRow, Alignment.MIDDLE_CENTER);

		Button buttonBack = new Button("");
		buttonBack.addClickListener(this);
		buttonBack.setId("buttonBack");
		buttonBack.setWidth("380px");
		buttonBack.setHeight(BUTTON_HEIGHT);
		buttonBack.setIcon(new FileResource(new File(basepath + "/VAADIN/images/backIcon.png")));
		super.content.addComponent(buttonBack);
		super.content.setComponentAlignment(buttonBack, Alignment.MIDDLE_CENTER);
	}

	public void showChart(String type, int[] data) {
		// Note: Logic (if/else) should be refactored to at least presenter if
		// not model
		// Note: categories should be generated dynamically based on current
		// month/day
		// Beware of JavaScript merged into java strings abomination
		if (type.equals("year")) {
			chart.setHcjs("var options = { " + "title: { text: 'mood diagram' }, "
					+ "xAxis: {categories:[" + getChartString("year") + "]},"
					+ "series: [{ name: 'Yearly mood', data: "+ Arrays.toString(data) + "}] };");
		} else if (type.equals("6month")) {
			chart.setHcjs("var options = { " + "title: { text: 'mood diagram' }, "
					+ "xAxis: {categories:[" + getChartString("6month") + "]},"
					+ "series: [{ name: 'Half yearly mood', data: " + Arrays.toString(data) + "}] };");
		} else if (type.equals("month")) {
			chart.setHcjs("var options = { " + "title: { text: 'mood diagram' }, "
					+ "series: [{ name: 'Monthly mood', data: " + Arrays.toString(data) + "}] };");
		}
	}

	public void showStrain(String strainNow) {
		strain.setCaption(strainNow);
	}

	private String getChartString(String type) {
		Calendar date = Calendar.getInstance();
		int month = date.get(Calendar.MONTH);
		String[] names = new String[] { "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'",
				"'Oct'", "'Nov'", "'Dec'" };
		String xAxis = "";
		switch (type) {
		case "6month":
			for (int i = 0; i < 6; i++) {
				if (month > 0) {
					xAxis = names[month] + xAxis;
					month--;
				} else {
					xAxis = names[month] + xAxis;
					month = 11;
				}
				if (i < 5) {
					xAxis = ", " + xAxis;
				}
			}
			break;
		case "year":
			for (int i = 0; i < 12; i++) {
				if (month > 0) {
					xAxis = names[month] + xAxis;
					month--;
				} else {
					xAxis = names[month] + xAxis;
					month = 11;
				}
				if (i < 11) {
					xAxis = ", " + xAxis;
				}
			}
			break;
		}
		return xAxis;
	}

	private Image getImage(String name) {
		FileResource resource = new FileResource(new File(basepath + "/VAADIN/images/" + name));
		Image image = new Image("", resource);
		image.setHeight("40px");
		image.setWidth("40px");
		return image;
	}

	// VERSUCH eine Statistik einzufügen =>
	// protected Component getPlotlyApi() {
	// PlotlyApi plotlyApi = new PlotlyApi();
	// plotlyApi.setWidth("380px");
	// plotlyApi.setHeight(BUTTON_HEIGHT);
	// super.content.addComponent(plotlyApi);
	// super.content.setComponentAlignment(plotlyApi, Alignment.MIDDLE_CENTER);
	// LineData Line1 = new LineData("Random Line 1 ");
	// categories: [@SuppressWarnings("serial")

	// ICONS, welche links bei der Statistik eingefügt werden sollten=>
	// private void Image() {
	// Image imageVerySad = new Image("");
	// imageVerySad.setWidth(IMAGE_WIDTH);
	// imageVerySad.setHeight(IMAGE_HEIGHT);
	// imageVerySad.setIcon(new FileResource(new File (basepath
	// +"/VAADIN/images/VerySadIcon.png")));

	// Image imageSad = new Image("");
	// imageSad.setWidth(IMAGE_WIDTH);
	// imageSad.setHeight(IMAGE_HEIGHT);
	// imageSad.setIcon(new FileResource(new File (basepath
	// +"/VAADIN/images/SadIcon.png")));

	// Image imageNeutral = new Image("");
	// imageNeutral.setWidth(IMAGE_WIDTH);
	// imageNeutral.setHeight(IMAGE_HEIGHT);
	// imageNeutral.setIcon(new FileResource(new File (basepath
	// +"/VAADIN/images/SmileyIcon.png")));

	// Image imageHappy = new Image("");
	// imageHappy.setWidth(IMAGE_WIDTH);
	// imageHappy.setHeight(IMAGE_HEIGHT);
	// imageHappy.setIcon(new FileResource(new File (basepath
	// +"/VAADIN/images/HappyIcon.png")));

	// Image imageVeryHappy = new Image("");
	// imageVeryHappy.setWidth(IMAGE_WIDTH);
	// imageVeryHappy.setHeight(IMAGE_HEIGHT);
	// imageVeryHappy.setIcon(new FileResource(new File (basepath
	// +"/VAADIN/images/VeryHappyIcon.png")));
	// ]

	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);
	}

	@Override
	public void buttonClick(ClickEvent event) {
		for (ViewListener listener : this.listeners) {
			listener.buttonClick(event);
		}
	}
}