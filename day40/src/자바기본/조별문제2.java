package 자바기본;

import java.util.Scanner;

public class 조별문제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
			System.out.print("식사인원이 몇 분이신가요?");
			int personnel = sc.nextInt();
			//식사 인원이 5명 이상이면 룸/ 4명이하면 홀			
			if (personnel >= 5) {
				System.out.println("룸으로 안내하겠습니다.");
			} else {
				System.out.println("홀로 안내하겠습니다.");
			} 
			System.out.println(personnel);
			
			String[] order = new String[personnel];
			for (int i = 0; i < order.length; i++) {
				System.out.print("메뉴를 알려주세요! ==짜장면, 짬뽕, 볶음밥, 탕수육==");
				String menu = sc.next();
				order[i] = menu;
				
			}
		System.out.println("식사인원은 >> "+ personnel);
		
		for (int i = 0; i < order.length; i++) {
			System.out.println("주문한 메뉴는 >> " + order[i]);	
		}
		
		
		sc.close();//입력스트림 닫기

	}

}
