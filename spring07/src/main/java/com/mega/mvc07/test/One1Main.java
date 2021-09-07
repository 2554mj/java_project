package com.mega.mvc07.test;

public class One1Main {
	public static void main(String[] args) {
		One o1 = new One();
		One o2 = new One();
		One2 o3 = One2.getInstance();
		
		System.out.println("프로토타입 주소 1 : " + o1);
		System.out.println("프로토타입 주소 2 : " + o2);
		System.out.println("싱글톤타입 주소 1 : " + o3);
		
	}

}
