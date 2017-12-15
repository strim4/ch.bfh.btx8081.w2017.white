package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.AdviceMessage;

/**
 * @author Roberto Tangarife
 * Model for advice messages
 * 
 * Last Edit: 13.12.17
 */

public class AdviceMessageModel extends BaseModel{
	
private AdviceMessage adviceMessage;
	
	public AdviceMessageModel() {
		
		adviceMessage = new AdviceMessage();
		
	}
	
	public AdviceMessage getAdviceMessage() {
		return adviceMessage;
	}
	
	public void setAdviceMessage(AdviceMessage adviceMessage) {
		this.adviceMessage = adviceMessage;
	}
}