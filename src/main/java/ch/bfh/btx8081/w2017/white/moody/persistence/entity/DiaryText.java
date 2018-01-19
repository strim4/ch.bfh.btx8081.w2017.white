package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;
import ch.bfh.btx8081.w2017.white.moody.presentation.presenter.DiaryTextPresenter;
import ch.bfh.btx8081.w2017.white.moody.presentation.views.DiaryTextView;

/**
 * @author Moritz expression of a diaryelement with an additional note
 * 
 */
@SuppressWarnings("serial")
@Entity


public class DiaryText extends DiaryElement implements Serializable, SEntity {

	private String note;

	public DiaryText(String name, String note, String entrydate, Date creationDate) {
		super(name, creationDate, entrydate);
		this.note = note;

	}

	public DiaryText() {
	}

	/**
	 * 
	 * Method creates a new DiaryText entries and stores it to the DB
	 * 
	 */
	public void creatDt(String name, String note, String entrydate, Date creationDate) {
		DiaryText dt = new DiaryText(name, note, entrydate, new Date());
		DBManager dbm = DBManager.getInstance();
		dbm.persistObject(dt);
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}



	@Override
	public String toString() {
		return "Text Element{" +

				" id='" + getId() + '\'' + ", name='" + getName() + '\'' + ", note=" + getNote() + '\'' + ", creationDate="
				+ getCreationDate() + '}';
	}

}
