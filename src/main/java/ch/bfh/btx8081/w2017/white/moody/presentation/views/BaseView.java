package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import ch.bfh.btx8081.w2017.white.moody.MyUI;

/**
 * BaseView class sets the basic layout for the web-app.
 * @author Chantal
 * Last edit: 10.12.17
 */

@SuppressWarnings("serial")
public class BaseView extends VerticalLayout implements MoodyView{
	
	protected VerticalLayout header = new VerticalLayout();
	protected HorizontalLayout headerLine = new HorizontalLayout();
	protected VerticalLayout content = new VerticalLayout();
	protected HorizontalLayout navigation = new HorizontalLayout();
	protected VerticalLayout verticalNavigation = new VerticalLayout();
	
	private List<ViewListener> listeners= new ArrayList<ViewListener>();
	
	Label titleLabel;
	Button buttonSettings;
	
	public BaseView(){
		
		this.setBaseStyle();
		this.setLayouts(0, 0, 0, 0);
		
		this.header.addComponent(headerLine);
		this.header.setComponentAlignment(headerLine, Alignment.MIDDLE_CENTER);
			
	}
	
	/**
	 * The protected method setBaseStyle sets the basic layout of the web-app with the logo on each page.
	 */
	protected void setBaseStyle(){
	
		this.setWidth(MyUI.WIDTH);
		this.setHeight(MyUI.HEIGHT);
		this.setMargin(true);
		this.setSpacing(true);
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		FileResource resource = new FileResource(new File(basepath + "/VAADIN/images/moodyLogo.png"));
		Image logo = new Image("", resource);
		this.headerLine.addComponent(logo);
		this.headerLine.setComponentAlignment(logo, Alignment.MIDDLE_LEFT);
	
	}
	
	/**
	 * The protected method setTitle defines the layout of the header with the title 
	 * and with the buttons for home and settings.
	 * @param title - head title for each page
	 */
    protected void setTitle(String title) {

        Label titleLabel = new Label(title);
        titleLabel.setStyleName("h1");
        titleLabel.setHeight("30px");
        titleLabel.setWidth("305px");

       	VerticalLayout titleLayout = new VerticalLayout();

      	titleLayout.addComponent(titleLabel);
        titleLayout.setComponentAlignment(titleLabel, Alignment.TOP_CENTER);
       	this.headerLine.addComponent(titleLayout);
        this.headerLine.setComponentAlignment(titleLayout, Alignment.MIDDLE_CENTER);
        this.headerLine.setSpacing(true);
   
        VerticalLayout standardbuttons = new VerticalLayout();
        this.headerLine.addComponent(standardbuttons);
   
        //Button for going to start-view
        Button home = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(Views.START_VIEW);
			}
		});
        home.setIcon(VaadinIcons.HOME);
        
		//Button for general settings
		Button buttonSettings = new Button("", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(Views.SETTINGS_VIEW);
			}
		});
		buttonSettings.setId("buttonSettings");
		buttonSettings.setIcon(VaadinIcons.COG);
		standardbuttons.addComponents(home, buttonSettings);
		standardbuttons.setComponentAlignment(home, Alignment.MIDDLE_RIGHT);
		standardbuttons.setComponentAlignment(buttonSettings, Alignment.MIDDLE_RIGHT);

	}

    /**
     * The protected method setLayout defines the layout of the web-app with header and content 
     * and defines the ratios.
     * @param headerRatio - ratio of the header layout
     * @param contentRatio - ratio of the content layout
     * @param navigationRatio - ratio of the navigation layout
     * @param verticalNavicationRatio - ratio of the verticalNavication layout
     */
    protected void setLayouts(float headerRatio, float contentRatio, 
    		float navigationRatio, float verticalNavicationRatio) {

        this.content.setMargin(true);
        this.content.setSpacing(true);

        this.addComponent(header);
        this.addComponent(content);

        this.setExpandRatio(header, headerRatio);
        this.setExpandRatio(content, contentRatio);

        if (navigationRatio == 0) {

            this.verticalNavigation.setMargin(true);
            this.verticalNavigation.setSpacing(true);
            this.addComponent(verticalNavigation);
            this.setExpandRatio(verticalNavigation, verticalNavicationRatio);

        } else {

            this.navigation.setMargin(true);
            this.navigation.setSpacing(true);
            this.addComponent(navigation);
            this.setExpandRatio(navigation, navigationRatio);

        }
    }
    
    /**
     * The public method addListener adds objects to the listener.
     */
	public void addListener(ViewListener listener){
		listeners.add(listener);
	}
	
	/**
	 * The public method buttonClick handles the click event.
	 */
	public void buttonClick(ClickEvent event){
		for(ViewListener listener : this.listeners){
			listener.buttonClick(event);
		}
	}
    
}
