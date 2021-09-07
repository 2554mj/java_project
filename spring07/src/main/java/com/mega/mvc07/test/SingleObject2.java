package com.mega.mvc07.test;

public class SingleObject2 {
	static int count;
	static SingleObject2 object;
	
	private SingleObject2() {
		System.out.println("SingleObject객체 생성됨@@");
		count++;
	}
	
	//싱글톤은 객체를 하나만 만들고, 더 이상 많들지 않는 방법이다.
	//getInstance라는 static메서드를 만들어서 객체가 만들어졌는지 확인한다.
	public static SingleObject2 getInstance() {
		if (object == null) {
			//object이 null이라는 것은 아직 객체가 하나도 안만들어졌다라는 의미
			//객체가 만들어지면, 주소가 들어가야 하는데 null이므로 아직 안만들어졌다.
			object = new SingleObject2();
		}
		else {
			//object이 null이 아니라면, 객체가 만들어져서 주소가 들어갔다라는 의미
		}
		return object;
	}

}
