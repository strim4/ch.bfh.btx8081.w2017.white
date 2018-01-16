package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Transient;
import javax.xml.transform.stream.StreamSource;

import com.vaadin.server.StreamResource;
import com.vaadin.ui.Image;

import ch.bfh.btx8081.w2017.white.moody.persistence.repository.implementation.DBManager;

/**
 * @author Moritz expression of a diaryelement with an additional picture
 * 
 */
@Entity
@DiscriminatorValue(value = "PE")
public class DiaryPic extends DiaryElement implements Serializable, SEntity {

	@Lob
	private byte[] imageFile;
	private String description;
	


	public DiaryPic(String name,  byte[] imageFile, Date creationDate, String entrydate) throws IOException {
		super(name, creationDate, entrydate);
		
		this.imageFile = imageFile;
	}

	public DiaryPic() {
	}
	
public void creatDp(String name, byte[] imageFile,  Date creationDate, String entrydate) throws IOException {
		
		DiaryPic dp = new DiaryPic(name, imageFile, new Date(), entrydate);
		DBManager dbm = DBManager.getInstance( );
		dbm.persistObject(dp);
		
		
		
	}

	public byte[] getImageByte() {
		return imageFile;
	}
	
	public BufferedImage getImag()   {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new ByteArrayInputStream(this.getImageByte()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
		

		
	}
	
	/*
	
	
/*	@Override
	public String toString() {
		return "Picture Element{" +

				" id='" + getId() + '\'' + ", name='" + getName() + '\'' + ", description =" + getDescription() + '\''
				+ ", image =" + image + '\'' + ", creationDate=" + getCreationDate() + '}';
	}
*/
}
