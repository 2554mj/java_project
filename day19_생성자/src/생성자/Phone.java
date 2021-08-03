package 생성자;

public class Phone {
	String company;
	String no;
	String user;
	
	public Phone(String company, String no, String user) {
		this. company = company;//변수명을 맞춰주려고 하면 노란줄에러뜸 같은애가 두번들어감
		//첫번째 company가 class의 company인줄 몰라서 this.를 써주면 됨
		this. no = no;
		this. user = user;
	}
	
	public String toString() {
		return company + ", " + no + ", " + user;
	}

}
