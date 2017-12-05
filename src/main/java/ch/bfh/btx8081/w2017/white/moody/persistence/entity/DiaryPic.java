package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Moritz expression of a diaryelement with an additional picture
 * 
 */
@Entity
@DiscriminatorValue(value = "PE")
public class DiaryPic extends DiaryElement implements Serializable {

	//private BufferedImage image;
	private String description;

	public DiaryPic(String name, String description, BufferedImage image, Date creationDate, String entrydate) throws IOException {
		super(name, creationDate, entrydate);
		this.description = description;
		//this.image = ImageIO.read(new File(name + ".png"));

	}

	public DiaryPic() {
	}

	/*public BufferedImage getImage() {
		return image;
	}
*/
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
