package 자바기본;

import java.util.Scanner;

public class 기본입출력응용2 {

	public static void main(String[] args) {
		// 문제 입력값 받아서 누적값, 배열/array list 활용하기
		// => 4일동안 사용한 금액을 입력받고, 금액에 따라 안내창을 띄우기. 마지막에 하루 소계금액 출력
		Scanner sc = new Scanner(System.in);
		int[] total = new int[5];
		//day 반복
		for (int d = 1; d < total.length; d++) {
		
			//하루 사용한 금액 입력하기
			int sum = 0;
			for (int i = 1; i < 4; i++) {
				System.out.print(d + "일에 사용한 금액을 알려주세요(" + i + ")");
				//입력값 int로 받아오기
				int amount = sc.nextInt();
				//하루 소계 계산식
				sum = sum + amount;
			}
			//하루 소계 금액에 따른 안내창
			if (sum >= 100000) {
				System.out.println("내일은 아끼자");
			} 
			else {
				System.out.println("오늘도 많이 아끼셨네요!");
			} // 사용금액 for end
			//하루 소계를 배열에 넣어주기
			total[d] = sum; 
		}//day for end
		//하루 소계를 배열에서 하나씩 꺼내기
		for (int i = 1; i < total.length; i++) {
			System.out.println(i+ "일>>" + total[i] + " ");
		}
		sc.close();// 입력스트림 닫기

	}

}
