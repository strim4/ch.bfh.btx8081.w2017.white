package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ThersholdValueUserReaction;

/**
 * This class is the model for the ThersholdValueUserReaction table.
 * In collaboration with all the WarningNotification classes
 * 
 * @author Sandra Last Edit: 18.01.2018
 */

public class ThersholdValueUserReactionModel extends BaseModel {

	private ThersholdValueUserReaction thersholdValueUserReaction;

	public ThersholdValueUserReactionModel() {

		thersholdValueUserReaction = new ThersholdValueUserReaction();
	}

	public ThersholdValueUserReaction getThersholdValueUserReaction() {
		return thersholdValueUserReaction;
	}

	public void setThersholdValueUserReaction(ThersholdValueUserReaction thersholdValueUserReaction) {
		this.thersholdValueUserReaction = thersholdValueUserReaction;
	}
}