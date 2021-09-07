package com.mega.mvc07.test;

public class MyGirlMain {
	public static void main(String[] args) {
	Girl girl1 = new Girl("길순", 13);
	Girl girl2 = new Girl("길숙", 10);
	
	//11.전체 소녀들의 정보를 프린트
	System.out.println(girl1);
	System.out.println(girl2);

	//12.소녀객체가 만들어졌을 때 나이를 누적할 수 있는 static변수를 만들어서
	//     누적처리를 하세요.
	System.out.println(girl2.ageTotal);
	
	//13.소녀객체가 만들어졌을 때 인원을 누적할 수 있는 static변수를 만들어서
	//     누적처리를 하세요.
	System.out.println(girl2.count);
	
	//14.전체 소녀수와 나이의 평균을 구하세요
	System.out.println(girl2.ageTotal/girl2.count);
	//정수와 정수의 계산 결과 => 정수
	//하나라도 실수 계산 결과 => 실수
	
	}
}
