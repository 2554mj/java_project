package com.mega.mvc07.test;

public class One2 {
	static One2 object;
	
	private One2() {
		System.out.println("One2객체 생성됨@@");
	}
	
	public static One2 getInstance() {
		if (object == null) {
			object = new One2();
		}
		else {
		}
		return object;
	}

}
