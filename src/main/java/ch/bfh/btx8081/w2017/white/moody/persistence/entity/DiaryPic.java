package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.transform.stream.StreamSource;

import com.vaadin.server.StreamResource;
import com.vaadin.ui.Image;

/**
 * @author Moritz expression of a diaryelement with an additional picture
 * 
 */
@Entity
@DiscriminatorValue(value = "PE")
public class DiaryPic extends DiaryElement implements Serializable {

	private byte[] imageFile;
	private String description;

	public DiaryPic(String name,  byte[] imageFile, Date creationDate, String entrydate) throws IOException {
		super(name, creationDate, entrydate);
		
		this.imageFile = imageFile;
	}

	public DiaryPic() {
	}

	public byte[] getImageByte() {
		return imageFile;
	}
	
	/*
	
	public Image getImage() {
		StreamSource streamSource = new StreamResource.StreamSource() {
			public InputStream getStream() {
				return (imageFile == null) ? null : new ByteArrayInoutStream(imageFile);
				
			}
		}
		
		return new Image(null, new StreamResource(streamSource, "streamedSourceFromByteArray"));
				
	}
	
	public void setImage(byte[] imageFile) {
		this.imageFile = imageFile;
	}                      

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

/*	@Override
	public String toString() {
		return "Picture Element{" +

				" id='" + getId() + '\'' + ", name='" + getName() + '\'' + ", description =" + getDescription() + '\''
				+ ", image =" + image + '\'' + ", creationDate=" + getCreationDate() + '}';
	}
*/
}
