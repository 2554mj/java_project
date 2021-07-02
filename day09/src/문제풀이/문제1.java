package 문제풀이;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = { "아이유", "유재석", "방탄" };

		int[] tv = new int[3]; // 투표수 {0,0,0}

		while (true) {

			System.out.println("당신이 좋아하는 연예인에 투표하세요. 1)아이유 2)유재석 3)방탄 4)종료");
			System.out.print("선택번호>>>>>>");

			int num = sc.nextInt();
			if (num == 4) {
				System.out.println("인기투표가 종료되었습니다");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				break;
			}
			tv[num - 1]++;
			System.out.println(name[num - 1] + " 득표");
		}

	}

}
