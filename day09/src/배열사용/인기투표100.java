package 배열사용;

import java.util.Scanner;

public class 인기투표100 {

	public static void main(String[] args) {
		// 주소가 들어간 변수(예,스트링) : 참조형 변수(기본형제외는 다 참조형!!)

		String[] name = { "아이유", "유재석", "BTS" };
		int[] tv = new int[3]; // 투표수를 저장하기 위함
		// 각각 몇 표받았는지 어떻게 알지? -> 각각 이름의 배열이 하나더 필요

		// System.out.println(name[0] + ":"+tv[0]);

		Scanner sc = new Scanner(System.in);// 램에 가져다만 넣어둠
		// ()공란이라면 빨간밑줄->뭔가 부족해 어떻게가져올거야? -> System.in 입력

		// 1. 사용자가 사용가능하도록 화면을 만들어줘라
		// 반복되는 동작이 어딘지를 파악해서 그 구문을 while안에 넣어줌
		// 구문설정 > 위에 Source > surround
		while (true) {
			System.out.println("인기투표 0)아이유 1)유재석 2)BTS 3)종료");
			System.out.println("선택번호>> ");
			int num = sc.nextInt(); // 3일때 종료
			if (num == 3) {
				System.out.println("투표를 종료합니다.");
//				아이유, 유재석, BTS 득표수 나오게
//				System.out.println(name[0] + " : " + tv[0] + "표");
//				System.out.println(name[1] + " : " + tv[1] + "표");
//				System.out.println(name[2] + " : " + tv[2] + "표");
				// 반복이니까 for문 쓰자!
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + " : " + tv[i] + "표");
				}
				
				System.exit(0);
			}
			// 해당 인덱스에 있는 배열의 값을 1증가
			tv[num]++;

			System.out.println(name[num] + "표 득표");

		}

	}

}
