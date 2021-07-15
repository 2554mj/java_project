package 클래스생성;

public class TV extends Object { //extends Object이 부분이 자동으로 들어가서 생략됨 
	//틀을 만드는 것
	//클래스를 만들때는 그 부품들이 가지는 특징을 선택해서 만들게 됨
	//특징 : 성질과 동작으로  
	//1)성질(=멤버변수) : 채널, 볼륨, 전원 
    //2)동작(=멤버메서드) : tv켜다, tv끄다, 볼륨up
	
	public int ch;//자동초기화가 됨, 메인안에 변수는 자동초기화되지 않음 
	//클래스 안에 만들어지는 변수를 멤버변수
	//변수선언 위치 : 클래스 전부 => 전역변수
	//즉, 전역변수는 자동초기화 됨/ 지역변수는 자동초기화되지 않음
	
	public int vol;
	public boolean onOff;
	//3가지의 멤버변수가 만들어짐
	
	//멤버메서드, 메서드 정의해야함
	//메서드 정의할 때 고려할 사항
	//1. 입력값이 있는가?
	//2. 반환값이 있는가?
	//Object이 모든 클래스의 부모
	
	public void tv켜다() {
		System.out.println("리모콘으로 ON버튼을 누르다.");
	}
	public void tv끄다() {
		System.out.println("리모콘으로 OFF버튼을 누르다.");
	}
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 UP시키다.");
	}

}
