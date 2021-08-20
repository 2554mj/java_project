package 자바기본;

import java.util.Scanner;

public class 기본입출력응용1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    //문제 입력값 2개 받아서 반복문, 조건문 활용하기 => 최소 주문금액
	    
	    for (int i = 0; i < 3; i++) {
			System.out.print("주문하실 음식의 가격은?");
			int price = sc.nextInt();
			System.out.print("주문하실 음식의 수량은?");
			int qty = sc.nextInt();
			int result = price * qty;
			if (result < 15000) {
				System.out.println("최소 주문 금액이 안돼요ㅠㅠ");
			} else {
				System.out.println("주문을 진행하겠습니다.");
			} 
		}
		sc.close();//입력스트림 닫기

	}

}
