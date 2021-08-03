package 생성자;

public class 통장 {
	//멤버변수
	String name;
	String ssn;
	int money;
	
	//public 통장() {
		//생성자중에서 입력값이 없는 생성자 -> 기본생성자 (default constructor)
		//다른생성자가 하나도 없으면 자동생성
	    //묵시적으로 만들어짐
	//}
	
	public 통장(String name, String ssn, int money) {
		super();//상속개념 지워도되고, 안지워도 됨
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	//멤버메서드
	public void 입금하다() {
		System.out.println("입금하다.");
	}

	@Override//오버라이드, 오버라이딩(재정의) = 오버라이트 : 기존의 메서드를 재정의한 메서드로 덮어쓰는 것. 
	//: 원래 메서드가 있던 것을 똑같은 형태로 다시 한번 정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어써짐.
	//@ :(Annotation,표시/여기선 지워도 됨 나중에 유용함) or (at,-에 ex.2554mj@gmail.com) 
	//vs 오버로딩(다형성) : 메서드 이름을 똑같이 쓰는 기능
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	//은행.java에서 account1값 => "생성자.통장@15db9742" toString으로 오버라이드해서
	//"통장 [name=홍길동, ssn=990101, money=10000]"란 내용으로 덮어씀

}
