package ch.bfh.btx8081.w2017.white.moody.presentation.presenter;

import ch.bfh.btx8081.w2017.white.moody.businesslogic.models.BaseModel;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.BaseView;

public class BasePresenter {
	
	private BaseModel model;
	private BaseView view;

	public BasePresenter(BaseModel model, BaseView view) {
		this.model = model;
		this.view = view;
	}
	
	// TODO Handling click events

}
