package ch.bfh.btx8081.w2017.white.moody.persistence.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * @author Moritz
 * Superclass for DiaryElements
 * Provides common attributes for subclasses
 */

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class DiaryElement  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private  String name;
	private Date creationDate;


	public DiaryElement(int id, String name, Date creationDate) {
		this.id = id;
		this.name = name;
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
	
	  public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = new Date(creationDate.getTime());
    }

}
