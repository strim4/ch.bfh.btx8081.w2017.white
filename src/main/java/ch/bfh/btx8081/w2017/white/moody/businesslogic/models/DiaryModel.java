package ch.bfh.btx8081.w2017.white.moody.businesslogic.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryElement;
import ch.bfh.btx8081.w2017.white.moody.persistence.entity.DiaryText;

public class DiaryModel extends BaseModel{
	
	private Scanner s = new Scanner(System.in);
	public int id = s.nextInt();
	public  String name = s.nextLine();
	public String note = s.next();
	
	
	public List<DiaryElement> diaryelements = new ArrayList<DiaryElement> ();

	public DiaryModel() {
		// TODO Auto-generated constructor stub
	}
	
	public void createNewTextElement() {
		DiaryElement e = new DiaryText(id, name, note);
		diaryelements.add(e);
		
	};
	
	public List<DiaryElement> getElements() {
		return diaryelements;
	};
}
