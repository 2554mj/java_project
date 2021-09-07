package com.mega.mvc08;

public class 실수처리2 {
	public static void main(String[] args) {
		double data = -3.12345;
		System.out.println(Math.abs(data)); //절대값
		System.out.println(Math.ceil(data)); //올림
		System.out.println(Math.floor(data)); //내림
		System.out.println(Math.round(data)); //반올림
		
		System.out.println(Math.random()); // 0 ~ 1사이(1미포함)로 범위가 없음
	}
	

}
