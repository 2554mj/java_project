package com.mega.mvc07.test;

public class One2Main {
	public static void main(String[] args) {
		One2 o1 = One2.getInstance();
		One2 o2 = One2.getInstance();
		
		System.out.println("싱글톤타입 주소 1: " + o1);
		System.out.println("싱글톤타입 주소 2: " + o2);
		
	}

}
