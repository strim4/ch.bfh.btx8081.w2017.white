package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DiaryElement {

	protected  int id;
	protected  String name;
	private SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
   public String strDate;;


	public DiaryElement(int id, String name) {
		this.id = id;
		this.name = name;
		strDate = sdfDate.format(new Date());
		

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

}
