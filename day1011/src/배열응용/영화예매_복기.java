package 배열응용;

import java.util.Scanner;

public class 영화예매_복기 {

	public static void main(String[] args) {
		//5. 반복동작 -> 무한루프만들기->먼저 구문밖으로 뺄거빼기->필요한영역잡아서 서라운드로 while
		int[] check = new int[10]; //변수선언 한번이면 ok, 더 할 필요없으니 구문밖으로
		Scanner sc = new Scanner(System.in); //클래스는 한번만 불러주면 됨. CPU힘들게 무한루프 돌리지말자
		
		int count = 0;
		final int Money = 10000;
		
		while (true) {
			//1. UI먼저 만들기
			System.out.println("-------------------");
			//2. 좌석번호 만들기
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-------------------");
			
			//3. 좌석번호 별 예매여부 확인창
			for (int a = 0; a < check.length; a++) {
				System.out.print(check[a] + " ");
			}
			//4. 입력받기
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력하세요.(종료 : -1)");
			int no = sc.nextInt();
						
			//7. 입력값이 -1이면, 종료
			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다.");
				int total = count * Money;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
				}
			//6. 입력값에 따라 예매여부란에 0/1로 표현
			if (check[no] !=1) {
					check[no] = 1;
					System.out.println(no + "번 예약 완료.");
					count++;
					System.out.println(count + "자리 예약됨");
					System.out.println();
		    	}
				else {
					System.out.println("이미 예약된 자리입니다.");
					System.out.println("");
				} 
			
	
	}//while
		sc.close();// break가 걸리지않으면 무한루프가 계속돌아가므로 에러가 발생
		
		//문1) 지금까지 배열에 저장된 값들 중 1이 몇개인지 카운트
				int count2 = 0;
				for (int i = 0; i < check.length; i++) {
					if(check[i]==1) {
						count2++;
				}
			} System.out.println("총" + count2 + "석이 예약됨"); 
				
			//문2) 1로 예약된 자리가 어디인지 프린트
			String sum = "";//목록이 많을땐 스트링으로 묶어서 통째로 사용
			for (int i = 0; i < check.length; i++) {
				if(check[i]==1) {
					//System.out.println(i+"번 자리가 예약되었습니다.");
					sum = sum + i + "번 ";
				}
			}
			System.out.println("예약된 자리 목록 : " + sum);

	}//main

}//class
