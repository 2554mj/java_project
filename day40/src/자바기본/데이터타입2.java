package 자바기본;

public class 데이터타입2 {

	public static void main(String[] args) {
		//넣을 수 있다 없다의 기준
		byte b = 100; 
		int i = b; // 작 ---> 큰, 자동타입변환(자동형변환)
		
		int i2 = 100;
		byte b2 = (byte)i2; // 큰 ---> 작, 강제타입변환(강제형변환)
		System.out.println(b2);
		
		//기본형의 캐스팅
		//형변환 : CPU가 타입을 변환, 캐스팅(casting)
		//ram에 선언된 타입 변경 불가, 선언할 때 타입이 결정되기 떄문에 재선언 불가!!
		//자바스크립트의 경우엔, 선언할 때가 아니라 값을 넣을때 타입이 결정되므로 재선언 가능!
		//캐스팅의 종류 1)자동, 2)강제
		
		//강제캐스팅인 경우, 값의 범위가 해당되는 경우만 캐스팅이 가능!!
		int i3 = 1000;
		byte b3=(byte)i3;
		System.out.println(b3);//-24
	}

}
