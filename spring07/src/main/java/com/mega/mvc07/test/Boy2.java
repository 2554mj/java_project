package com.mega.mvc07.test;

public class Boy2 {
static Boy2 object;
	
	private Boy2() {
		System.out.println("Boy2객체 생성됨@@");
	}
	
	public static Boy2 getInstance() {
		if (object == null) {
			object = new Boy2();
		}
		else {
		}
		return object;
	}

}
