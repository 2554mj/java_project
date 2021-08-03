package 생성자;

public class 마스크 {
	//속성 (멤버변수):색, 가격 => 변수에 넣기로
	String color ;
	int price;
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	//객체생성시 클래스이름과 동일한 것이 있으면 자동호출 됨
	//객체생성시 넣어주어야하는 처음값을 넣어주기 위해서 사용함
	//생성자 메서드 = 생성자 안써도 상관없지만, 인터넷에서 가져온것은 생성자 사용이 많음
	
	//동작(멤버메서드) => 메서드에 넣기로
	public void cover() {
		System.out.println("마스크 쓰다.");
	}
	
	public String toString() {
		return color+" " + price;
	}

}
