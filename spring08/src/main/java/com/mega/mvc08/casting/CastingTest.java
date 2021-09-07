package com.mega.mvc08.casting;

import java.util.ArrayList;

public class CastingTest {

	public static void main(String[] args) {
		//나에 대한 데이터를 모아보세요. 
		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		//1.전체 목록을 프린트
		System.out.println(list);
		
		//2.돈 1000을 꺼내서 2000을 더해 프린트
		int money = (Integer)list.get(0);//int <--오토언박싱-- Integer <--다운캐스팅-- Object
		int money2 = money + 2000;
		System.out.println(money2);
		
		//3.키 189.1을 꺼내서 10을 더해 프린트
		Double height = (Double)list.get(1); //double <--오토언박싱-- double <--다운캐스팅-- Object
		Double height2 = height + 10;
		System.out.println(height2);
		
		//4.아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요.
		boolean food = (boolean)list.get(2);
		if (food) {
			System.out.println("배불러요>0<");
		}else {
			System.out.println("배고파요ㅠ0ㅠ");
		}
	
		//5.성별 남 꺼내서 남이면 주민번호는 1,3이예요. 아니면 주민번호는 2,4예요.
		char gender = (char)list.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1,3입니다!");
		}else {
			System.out.println("주민번호는 2,4입니다!");
		}
		
		//6.2~3에서 형변환(업캐스팅, 다운캐스팅)(오토박싱,오토언박싱)과정을 순서대로 작성
		
	
		
		
	}

}
