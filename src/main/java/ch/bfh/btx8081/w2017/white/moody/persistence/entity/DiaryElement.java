package ch.bfh.btx8081.w2017.white.moody.persistence.entity;


import java.util.Date;

/**
 * @author Moritz
 * Superclass for DiaryElements
 * Provides common attributes for subclasses
 */
public abstract class DiaryElement {

	protected  int id;
	protected  String name;
	protected Date creationDate;


	public DiaryElement(int id, String name, Date creationDate) {
		this.id = id;
		this.name = name;
		this.creationDate = new Date(creationDate.getTime());
		

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
	
	  public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = new Date(creationDate.getTime());
    }

}
