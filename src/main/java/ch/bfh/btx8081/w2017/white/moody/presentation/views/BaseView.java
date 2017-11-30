package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import ch.bfh.btx8081.w2017.white.moody.MyUI;

/**
 * BaseView class sets the basic layout for the web-app.
 * @author Chantal
 * Last edit: 30.11.17
 */

@SuppressWarnings("serial")
public class BaseView extends VerticalLayout implements MoodyView{
	
	protected VerticalLayout header = new VerticalLayout();
	protected VerticalLayout content = new VerticalLayout();
	protected HorizontalLayout navigation = new HorizontalLayout();
	protected VerticalLayout verticalNavigation = new VerticalLayout();
	
	private List<ViewListener> listeners= new ArrayList<ViewListener>();
	
	public BaseView(){
		
		this.setBaseStyle();
			
	}
	
	protected void setBaseStyle(){
	
		this.setWidth(MyUI.WIDTH);
		this.setHeight(MyUI.HEIGHT);
		this.setMargin(true);
		this.setSpacing(true);
		
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		FileResource resource = new FileResource(new File(basepath + "/VAADIN/images/moodyLogo.png"));
		Image logo = new Image("", resource);
		content.addComponent(logo);
		content.setComponentAlignment(logo, Alignment.TOP_CENTER);
		
	}
	
    protected void setTitle(String title) {

        Label titleLabel = new Label(title);
        titleLabel.setStyleName("h1");
        titleLabel.setHeight("30px");
        titleLabel.setWidth("305px");

        this.header.addComponent(titleLabel);
        this.header.setComponentAlignment(titleLabel, Alignment.TOP_CENTER);
   
    }

    protected void setLayouts(float headerRatio, float contentRatio, float navigationRatio, float verticalNavicationRatio) {

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
    
	public void addListener(ViewListener listener){
		listeners.add(listener);
	}
	
	public void buttonClick(ClickEvent event){
		for(ViewListener listener : this.listeners){
			listener.buttonClick(event);
		}
	}
    
}