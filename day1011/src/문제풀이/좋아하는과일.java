package 문제풀이;

import java.util.Scanner;

public class 좋아하는과일 {

	public static void main(String[] args) {
		// 굳이 배열을 사용하지 않아도 됨
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int g = 0;
		int k = 0;
		final int c2 = 2000;
		final int c3 = 3000;

		while (true) {
			// 1. UI먼저 만들기
			System.out.println("-------------------");
			System.out.println("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료");
			System.out.println("-------------------");
			int no = sc.nextInt();
			if (no == 0) {
				System.out.println("시스템이 종료됩니다.");
				break;
			}
			if (no == 1) {
				a++;
				System.out.println("사과가 선택되었습니다.");
			} else if (no == 2) {
				b++;
				System.out.println("바나나가 선택되었습니다.");
			} else if (no == 3) {
				g++;
				System.out.println("포도가 선택되었습니다.");
			} else if (no == 4) {
				k++;
				System.out.println("키위가 선택되었습니다.");
			}
		} // while
		System.out.println("사과 : " + a + "개");
		System.out.println("바나나 : " + b + "개");
		System.out.println("포도 : " + g + "개");
		System.out.println("키위 : " + k + "개");
		
		int total = a *c2 + b * c2 + g * c3 +  k * c3;
		System.out.println("전체금액은 " + total + "원 입니다.");
		sc.close();

	}
}
