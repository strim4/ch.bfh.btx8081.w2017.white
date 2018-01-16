package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Button.ClickEvent;

/**
 * InformationsView shows basic information about depression
 * @author Chantal
 * Last Edit: 10.12.17
 */
@SuppressWarnings("serial")
public class InformationsView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	Panel pdef = new Panel();
	Panel porg = new Panel();

	public InformationsView() {
		
		super();
		super.setTitle("Informationen");
		this.createInformations();
	}
	
	/**
	 * The private method createInformations shows informations about depression
	 */
	@SuppressWarnings("deprecation")
	private void createInformations() {
		
		Label definition = new Label("Was ist eine Depression?");
		Label text = new Label("Die Depression ist eine psychische Störung. Typisch für sie sind gedrückte Stimmung, negative Gedankenschleifen "
				+ "und ein gehemmter Antrieb. Häufig gehen Freude und Lustempfinden, Selbstwertgefühl, Leistungsfähigkeit, Einfühlungsvermögen "
				+ "und das Interesse am Leben verloren. Diese Symptome treten auch bei gesunden Menschen zeitweise auf. Bei einer Depression "
				+ "sind sie jedoch länger vorhanden, schwerwiegender ausgeprägt und senken deutlich die Lebensqualität. In der Psychiatrie "
				+ "wird die Depression den affektiven Störungen zugeordnet. Die Diagnose wird nach Symptomen und Verlauf (z. B. einmalige oder "
				+ "wiederholte depressive Störung) gestellt. Zur Behandlung werden nach Abklärung möglicher Ursachen Antidepressiva eingesetzt "
				+ "oder eine Psychotherapie durchgeführt, je nach Schweregrad einzeln oder auch kombiniert. Aufgrund der Digitalisierung im "
				+ "Gesundheitswesen kommen zunehmend auch Online-Therapieprogramme zum Einsatz.Im alltäglichen Sprachgebrauch wird der Begriff "
				+ "depressiv häufig für eine normale Verstimmung verwendet. Im medizinischen Sinne ist die Depression jedoch eine ernste, "
				+ "behandlungsbedürftige und oft folgenreiche Erkrankung, die sich der Beeinflussung durch Willenskraft oder Selbstdisziplin "
				+ "des Betroffenen entzieht. Sie stellt eine wesentliche Ursache für Arbeitsunfähigkeit oder Frühverrentung dar und ist an rund "
				+ "der Hälfte der jährlichen Selbsttötungen in Deutschland beteiligt.");
		text.setWidth(1040, UNITS_PIXELS);
		pdef.setContent(text);
		
		Label symp = new Label("Symptome einer Depression");
		Label text2 = new Label("Depressive Stimmung: Ich leide fast den ganzen Tag sowie fast jeden Wochentag unter gedrückter, depressiver Stimmung. "
				+ "Meine Stimmung ist dabei nicht von irgendwelchen bestimmten Umständen oder Ereignissen beeinflusst. Interessensverlust und "
				+ "Freudlosigkeit: Aktivitäten, die ich sonst gerne gemacht habe, machen mir nun keine Freude mehr bzw. interessieren mich nicht mehr."
				+ "Antriebsmangel und erhöhte Ermüdbarkeit: Ich ermüde viel leichter als sonst und/oder meine Energie, mein Antrieb sind deutlich verringert.");
		text2.setWidth(1040, UNITS_PIXELS);
		porg.setContent(text2);
		
		super.content.addComponents(definition, pdef, symp, porg);
		super.content.setComponentAlignment(definition, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(pdef, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(symp, Alignment.MIDDLE_CENTER);
		super.content.setComponentAlignment(porg, Alignment.MIDDLE_CENTER);
		
	}
	
    /**
     * The public method addListener adds objects to the listener.
     */
	@Override
	public void addListener(ViewListener listener) {
		listeners.add(listener);	
	}

	/**
	 * The public method buttonClick handles the click event.
	 */
	@Override
	public void buttonClick(ClickEvent event) {
		for (ViewListener listener : this.listeners) {
			listener.buttonClick(event);
		}
	}
	
}