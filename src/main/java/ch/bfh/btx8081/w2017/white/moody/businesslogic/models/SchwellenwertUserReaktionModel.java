package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.SchwellenwertUserReaktion;

/**
 * This class is the model for the SchwellenwertUserReaktion table.
 * In cowork with all the Warningnotification classes
 * 
 * @author Sandra
 * Last Edit: 18.01.2018
 */

public class SchwellenwertUserReaktionModel extends BaseModel {

private SchwellenwertUserReaktion schwellenwertUserReaktion;
	
	public SchwellenwertUserReaktionModel() {
		
		schwellenwertUserReaktion = new SchwellenwertUserReaktion();
	}
	
	public SchwellenwertUserReaktion getSchwellenwertUserReaktion() {
		return schwellenwertUserReaktion;
	}
	
	public void setSchwellenwertUserReaktion(SchwellenwertUserReaktion schwellenwertUserReaktion) {
		this.schwellenwertUserReaktion = schwellenwertUserReaktion;
	}
}