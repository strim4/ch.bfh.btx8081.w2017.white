package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

/**
 * @author Moritz
 * expression of a diaryelement with an additional picture
 * 
 */

public class DiaryPic extends DiaryElement{
	
	public BufferedImage image;
	public String description;


	public DiaryPic(int id, String name, String description, BufferedImage image , Date creationDate) throws IOException {
		super(id, name,  creationDate);
		this.description = description;
		this.image = ImageIO.read(new File(name + ".png"));
		
	}


	public BufferedImage getImage() {
		return image;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

	 @Override
	   public String toString() {
	       return "Picture Element{" +
	   
	               " id='" + id + '\'' +
	               ", name='" + name + '\'' +
	               ", description =" + description + '\'' +
	               ", image =" + image + '\'' +
	               ", creationDate=" + creationDate +
	               '}';
	   }
	
	
	
}
