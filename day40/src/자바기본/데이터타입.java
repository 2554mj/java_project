package 자바기본;

public class 데이터타입 {

	public static void main(String[] args) {
		// 기본데이터 : 정수, 실수, 문자, 논리 => 값
		// 참조데이터 : 배열, 클래스 등 나머지 다 => 주소
		
		//정수 
		byte b = 100; //-128 ~ 127 => 1byte(=8bit) 비트 : 신호하나, 1/0으로 표현
		//1비트로 표현할 수 있는 글자 : 0, 1 (2개 = 2의1승)
		//2비트로 표현할 수 있는 글자 : 00, 01, 10, 11 (4개 = 2의2승)
		//3비트로 표현할 수 있는 글자 : 000, 001, ...  (8개)
		//8비트로 표현할 수 있는 글자 : (256개 = 2의 8승) -128 ~ 127, 중간에 0
		
		short s = 30000; //+-3만 => 2byte
		int i = 1000000000; //+-21억 => 4byte
		long l = 100000000000L; //+-21억 이상 => 8byte, 에러)숫자뒤에 L,l 붙여줘야함
		
		double d = 4.123589; //8byte
		float f = 1.234456f; //8자리까지 => 4byte, 에러)숫자뒤에 F,f 붙여줘야함
		
		char c = 'a'; //소문자 a에 해당하는 숫자가 들어감 => 2byte
		System.out.println(c + 1); //a = 97
		char c2 = 'A'; 
		System.out.println(c2 + 1); //A = 66
		char c3 = '가'; 
		System.out.println(c3 + 1); //가 = 44032
		char c4 = '나'; 
		System.out.println(c4 + 1); //가 = 45208
		char c5 = '강'; 
		System.out.println(c5 + 1); //가 = 44053
		
		boolean boo = true; // true,false => 1byte

	}

}
