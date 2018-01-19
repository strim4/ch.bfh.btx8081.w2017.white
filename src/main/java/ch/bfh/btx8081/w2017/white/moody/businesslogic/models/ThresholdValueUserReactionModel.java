package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.ThresholdValueUserReaction;

/**
 * This class is the model for the ThresholdValueUserReaction table.
 * In collaboration with all the WarningNotification classes
 * 
 * @author Sandra Last Edit: 18.01.2018
 */

public class ThresholdValueUserReactionModel extends BaseModel {

	private ThresholdValueUserReaction thresholdValueUserReaction;

	public ThresholdValueUserReactionModel() {

		thresholdValueUserReaction = new ThresholdValueUserReaction();
	}

	public ThresholdValueUserReaction getThersholdValueUserReaction() {
		return thresholdValueUserReaction;
	}

	public void setThersholdValueUserReaction(ThresholdValueUserReaction thresholdValueUserReaction) {
		this.thresholdValueUserReaction = thresholdValueUserReaction;
	}
}