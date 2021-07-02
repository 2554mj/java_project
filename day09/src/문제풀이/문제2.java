package 문제풀이;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3]; 
		String[] coffee = {"아메리카노", "바닐라콜드브루", "카페라떼"};
		int count = 0;

		while (true) {
			System.out.println("당신이 좋아하는 음료에 투표하세요. 1)아메리카노 2)바닐라콜드브루 3)카페라떼 4)종료");
			int x = sc.nextInt() ;
			if (x == 4 || count == 10 ) {
				System.out.println("시스템을 종료합니다.");
				
				for (int i = 0; i < num.length; i++) {
					System.out.println(coffee[i] + ": " + num[i] + "표");
					
				}
				System.out.println("총 투표수는 " + count + "표");
				System.exit(0);
			}
			count++;
			num[x -1 ]++;
			System.out.println(coffee[x -1] + " 득표");
		}
	}
}
