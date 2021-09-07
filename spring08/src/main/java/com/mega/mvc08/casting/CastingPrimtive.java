package com.mega.mvc08.casting;

public class CastingPrimtive {

	public static void main(String[] args) {
		// 기본형 형변환(CastingPrimitive) -> 정수, 실수, 문자, 논리
		// 형변환(데이터 type변환)
		byte b1 = 100; // (1byte = 256글자) -128 ~ 127
		int i1 = 200; // (4byte)
		
		i1 = b1; //가능  int(큰)<--byte(작)
		//자동으로 byte에 들어있던 100 데이터가 int로 변환되어 저장됨!!
 		//자동 데이터 변환 => 자동형변환(Casting)
		//연산자는 CPU가 처리
		
//		b1 = i1; //불가능 byte(작)<--int(큰)
		b1 = (byte)i1;
		//강제로 int에 들어있던 200 데이터가 byte로 변환되어 저장됨!!
 		//강제 데이터 변환 => 강제형변환
		
		int i2 = 3000;
		byte b2 = (byte)i2;
		System.out.println(b2);
		//강제형변환이 가능한 경우는 범위의 값만 가능!

	}

}
