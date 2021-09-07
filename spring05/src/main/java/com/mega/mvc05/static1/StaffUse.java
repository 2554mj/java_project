package com.mega.mvc05.static1;

public class StaffUse {

	public static void main(String[] args) {
		Staff st1 = new Staff("홍길동", "남", 25);
		Staff st2 = new Staff("김길동", "여", 26);
		Staff st3 = new Staff("송길동", "남", 27);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("직원의 수는 " + Staff.no + "명");
		System.out.println("직원의 나이 평균은 " + Staff.sumAge/Staff.no + "세");

	}

}
