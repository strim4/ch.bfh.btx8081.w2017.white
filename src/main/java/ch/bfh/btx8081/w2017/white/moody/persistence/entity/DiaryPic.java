package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DiaryPic extends DiaryElement{
	
	public BufferedImage image;
	public String description;


	public DiaryPic(int id, String name, String description) throws IOException {
		super(id, name);
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
	


	
	
	
}
