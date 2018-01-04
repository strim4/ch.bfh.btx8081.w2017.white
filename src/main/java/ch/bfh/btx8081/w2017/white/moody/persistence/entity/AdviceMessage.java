package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

/**
 * @author Roberto Advice messages Last edit: 28.11.17
 */

public class AdviceMessage implements SEntity {

	private String advice;
	private int adviceId;

	public AdviceMessage() {
	}

	public String getAdvice() {
		return advice;
	}

	public int getAdviceId() {
		return adviceId;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public void setAdviceId(int adviceId) {
		this.adviceId = adviceId;
	}
}

