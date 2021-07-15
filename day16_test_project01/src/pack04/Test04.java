package pack04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		String[] a = { "*", "*", "*", "*", "*", "*", "*", "*", "*", "*" };
		//처음부터 값을 알고 있을 때의 배열을 생성 
		System.out.print("1) ");
		for (int i = 0; i < a.length; i++) {//반복문으로 배열을 표현
			System.out.print(a[i]);
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 기호를 넣으세요.");
		String sb = sc.next();//입력값 받아오기 String
		System.out.println("원하는 횟수를 넣으세요.");
		int count = sc.nextInt();//입력값 받아오기 Int 
		System.out.print("2) ");
		String[] b = new String[count];
		for (int i = 0; i < b.length; i++) {
			b[i] = sb;
			System.out.print(b[i]);
		}
		System.out.println();

		int c1 = 0;
		while (true) { //무한루프로 여러번 반복이 가능하도록
			System.out.println("1)증가,2)감소,3)종료를 선택해주세요.>>");
			int an = sc.nextInt();
				if (an == 3) {
					System.out.println("시스템을 종료합니다. 현재까지의 카운트는 " + c1);
					break;
				}
				else {
					c1++;
					System.out.println("카운트: "+c1);
				}
			}
		} // while end
	}

