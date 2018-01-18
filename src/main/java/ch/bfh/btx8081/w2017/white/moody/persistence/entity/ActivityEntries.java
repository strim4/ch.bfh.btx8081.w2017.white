package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

@Entity

public class ActivityEntries  implements Serializable, SEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private String name;

	
	
	public ActivityEntries(String name) {
		this.name = name;
		
	}
	
public ActivityEntries() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void creatAcEn(String name) {

		ActivityEntries ac = new ActivityEntries(name);
		DBManager dbm = DBManager.getInstance();
		dbm.persistObject(ac);

	}

}
