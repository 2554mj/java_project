package com.mega.mvc05.static1;

public class Day {
	
	//멤버변수, 전역변수, 자동초기화
	String doing;
	int time;
	String location;
	static int count;
	static int doingTime;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		doingTime += time;
	}
	//static메서드는 객체생성하지 않아도 아무때나 클래스 이름을 접근해서 그 기능을 처리하게 할 수 있다.
	//자주쓰는 기능은 static메서드로 만들어 놓으면 아무때나 쓸 수 있어서 편하다!
	
	public static int getAvg() {
		return doingTime/count;
	}
	
//	public static int getAvg2() {
//		return doing;              //=> doing은 객체생성해야 접근가능함. 
//	   }	
		//즉, static메서드 안에는 static변수만 사용가능. instance변수 사용 불가능!
		//instance변수는 객체 생성 후 접근 가능하기 때문!!
		//static메서드는 객체생성하지 않아도 접근해서 처리를 해야함.


	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	

}
