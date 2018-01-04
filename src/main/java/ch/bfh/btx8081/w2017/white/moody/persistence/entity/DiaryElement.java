package ch.bfh.btx8081.w2017.white.moody.persistence.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * @author Moritz
 * Superclass for DiaryElements
 * Provides common attributes for subclasses
 */

@SuppressWarnings("serial")
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type")
public class DiaryElement implements Serializable, SEntity  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private  String name;
	private String entrydate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;


	
	public DiaryElement(String name, Date creationDate, String entrydate) {


		this.name = name;
		this.entrydate = entrydate;
		this.creationDate = new Date(creationDate.getTime());
		
		

	}
	
	public DiaryElement() {}



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
	
	public void setEntryDate(String entrydate) {
		this.entrydate = entrydate;
	}
	
	public String getEntryDate() {
		return entrydate;
	}
	
	  public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = new Date(creationDate.getTime());
    }

}
