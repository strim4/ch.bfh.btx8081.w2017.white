package ch.bfh.btx8081.w2017.white.moody.persistence.entity;

public class DiaryText extends DiaryElement{
	
	public String note;

	public DiaryText(int id, String name,  String note) {
		super(id, name);
		this.note = note;
		
	}

}
