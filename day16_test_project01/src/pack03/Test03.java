package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("숫자 크기 판별");
		System.out.println("------------");
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		while (true) {  //반복하므로 무한루프
			System.out.println("숫자입력>> ");
			int s = sc.nextInt(); //첫번째 숫자 입력받음
			System.out.println("숫자입력>> ");
			int s2 = sc.nextInt();//두번째 숫자 입력받음

			if (s > s2) { //첫번째 숫자가 클 경우의 조건식
				System.out.println("판결은 앞 숫자가 크다");
				a++;
			} else { //두번째 숫자가 클 경우의 조건식
				System.out.println("판결은 뒷 숫자가 크다");
				b++;
			}

			System.out.println("계속 하시겠습니까(계속:o, 중단:x) ");
			String s3 = sc.next();
			if (s3.equals("o")) { //입력값이 o일 경우의 조건식
				c++; // 시도횟수 카운트
			} else if (s3.equals("x")) { //입력값이 x일 경우의 조건식
				c++;  // 시도횟수 카운트
				System.out.println("프로그램을 종료합니다.");
				System.out.println("시도횟수: " + c + ", " + "앞숫자가 큰횟수: " + a + "," + "뒷숫자가 큰횟수: " + b);
				break; //프로그램종료! 
			}

		} // while end

	}

}
