package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

/**
 * 
 * @author Chantal
 * Last Edit: 10.12.17
 */
@SuppressWarnings("serial")
public class TipsView extends BaseView implements MoodyView {

	private List<ViewListener> listeners = new ArrayList<ViewListener>();
	
	private Accordion tips;
	
	private Label tip1;
	private Label tip2;
	private Label tip3;

	public TipsView() {
		
		super();
		super.setTitle("Tipps");
		this.createFutureContent();
	}
	
	/**
	 * The private method createFutureContent is for the following content.
	 */
	private void createFutureContent() {
		
		tips = new Accordion();
		tips.setHeight("250px");
		
		tip1 = new Label("Tägliche Bewegung ist für einen gesunden Körper es­sen­zi­ell. "
				+ "Sport kann auf depressive Personen lang anhaltende positive Effekte "
				+ "haben, da der Körper dabei Endorphine (natürliche, antidepressiv "
				+ "wirkende Hormone) ausschüttet. Diese fördern positive Gedanken und "
				+ "können Glücksgefühle hervorrufen. Ideal wäre es, dreimal wöchentlich "
				+ "für mindestens 20 Minuten zu trainieren – egal ob Joggen, Gewichte "
				+ "heben, Walken, Fahrrad fahren oder Yoga.");
		tip1.setWidth("1000px");
		tips.addTab(tip1, "Tipp 1: Bewegung");
		
		tip2 = new Label("Eine Handvoll Kürbiskerne am Tag kann Ängstlichkeit und "
				+ "depressive Gefühle mildern. Kürbiskerne enthalten L-Tryptophan, "
				+ "welches beruhigend wirkt und den Blutdruck senkt.");
		tip2.setWidth("1000px");
		tips.addTab(tip2, "Tipp 2: Kürbiskerne");
		
		tip3 = new Label("Trink einen bis zwei Kaffee, um Depressionen zu verringern – "
				+ "Koffein hebt die Stimmung. Trink aber nicht mehr als zwei Tassen täglich "
				+ "(ansonsten kann es zum gegenteiligen Effekt kommen, also zu einer "
				+ "Verstärkung der depressiven Stimmung).");
		tip3.setWidth("1000px");
		tips.addTab(tip3, "Tipp 3: Kaffee");
		
		super.content.addComponent(tips);
		super.content.setComponentAlignment(tips, Alignment.MIDDLE_CENTER);
		
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
