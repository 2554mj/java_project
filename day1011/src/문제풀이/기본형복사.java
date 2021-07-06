package 문제풀이;

public class 기본형복사 {

	public static void main(String[] args) {
		// ram의 변수에 들어있는 값을 복사 (2가지 : 기본형/참조형 = 기본형/주소)
		// 기본형 변수 복사
		
		int x = 100;
		int y = x;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		System.out.println("-------------");
		
		x = 200;
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		
	}

}
