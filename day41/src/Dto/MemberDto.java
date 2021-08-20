package Dto;

public class MemberDto {
	private String name;
	private int grade;
	private String credit;
	private String tel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
		
	}
	
	@Override
	public String toString() {
		return  name +"   "+ grade +"   "+ credit +"     "+ tel;
	}
	

}
