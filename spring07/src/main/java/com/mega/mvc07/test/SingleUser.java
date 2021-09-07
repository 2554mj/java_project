package com.mega.mvc07.test;

public class SingleUser {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SingleObject single1 = new SingleObject();	
		}
		System.out.println(SingleObject.count + "개");
		System.out.println("프로토타입 사용으로 저장된 램의 용량 >>" + SingleObject.count * 8 + 4);

	}

}
