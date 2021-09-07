package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnBoxing2 {

	public static void main(String[] args) {
		Integer i1 = new Integer(0); //타입 : 참조형
		int i2 = 0; //타입 : 기본형 정수
		int i3 = 0; //타입 : 기본형 정수
		i1 = i2; // 참조형(객체) <--오토박싱--기본형
		i3 = i1; // 기본형 <--오토언박싱--참조형(객체)
		//i1은 참조형(객체)에 i2는 기본형이 자동으로 참조형으로 변환됨 => 오토박싱
		//기본형과 기본형에 대한 포장클래스간만 가능! 다른경우엔 이렇게 되지 않음
		//참조형변수에 기본형을 넣음.
		//기본형변수에 참조형 값을 넣음!!
		//안되는 이유) 자바에서는 변수선언시 타입이 결정됨! 이 데이터 타입이 동일하지 않으면 넣을 수 없음.
		
	
	}

}
