package ch.bfh.btx8081.w2017.white.moody.presentation.views;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import ch.bfh.btx8081.w2017.white.moody.MyUI;

@SuppressWarnings("serial")
public class BaseView extends VerticalLayout{
	
	protected VerticalLayout header = new VerticalLayout();
	protected VerticalLayout content = new VerticalLayout();
	protected HorizontalLayout navigation = new HorizontalLayout();
	protected VerticalLayout verticalNavigation = new VerticalLayout();
	
	public BaseView(){
		
		this.setBaseStyle();
			
	}
		
	protected void setBaseStyle(){
	
		this.setWidth(MyUI.WIDTH);
		this.setHeight(MyUI.HEIGHT);
		this.setMargin(true);
		this.setSpacing(true);
		
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
}