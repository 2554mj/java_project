package 클래스생성;

public class Car {
	//클래스마다 메인을 넣지 않음
	//전역변수 (global variable, 글로벌변수) <-> 지역(로컬)변수
	//성질 => 변수로 만들어라 많은것중에 이것만 쓸래 => 멤버변수 
	//색(color), 바퀴수(count) 
	String color; //자동초기화 null
	int count; //자동초기화 0
	//클래스 밑에 바로 변수, 이렇게 사용하면 자동초기화 됨.
	//자동초기화 여부 / 메모리위치
	
	//동작
	//다른 것도 많지만, 이 두가지 동작만 쓰거야 => 멤버메서드
	public void run() { //아무데서나 사용 / 리턴하는 유형 / 함수이름
	//함수의 기능을 정의
	//접근을 어디까지 가능하냐에 따라 4가지
		System.out.println("네 바퀴로 달리다.");
	}
	public void up() { 
		System.out.println("속도를 20씩 올려라");
	}
}
