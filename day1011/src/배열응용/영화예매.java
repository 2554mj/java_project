package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		//1. UI를 먼저만들기
		int[] seat = new int[10];//배열은 자동으로 초기화됨, 누적된 값을 나타낼땐 반복문 밖으로
		Scanner sc = new Scanner(System.in);//반복문안에 들어갈필요없음. 1개만있어두되니까!
		
		int count = 0;
		final int Money = 10000;//int앞에 final이 붙어있으면 고정값임! 
		//항상 똑같은 수가 들어가는 변수 = 상수 
		//final은 상수를 나타냄, 변경불가능! 
		//상수의 변수명의 첫글자는 주로 대문자로 기입, 소문자도 문제는 없음
	
		
		while (true) {
			System.out.println("---------------------");
			
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			System.out.println("---------------------");
			
			for (int j = 0; j < seat.length; j++) {
				System.out.print(seat[j] + " ");
			}
			System.out.println();
			System.out.println("원하는 자리 번호 입력(종료:-1)>>");
			System.out.println();
			
			int no = sc.nextInt();
			
			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다.");
				int total = count * Money;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			}
			//예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인!해야함.
			//종료조건을 먼저 적기
			//0번을 입력했으면, 배열의 인덱스 0을 1로 변경하고 예약되었다는 것을 저장
			if (seat[no] !=1) {
				seat[no] = 1;
				System.out.println(no + "번 예약 완료.");
				count++;
				System.out.println(count + "자리 예약됨");
				System.out.println();
	    	}
			else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("");
			} 
		} 
		sc.close();
	
	//문1) 지금까지 배열에 저장된 값들 중 1이 몇개인지 카운트
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if(seat[i]==1) {
				count2++;
		}
	} System.out.println("총" + count2 + "석이 예약됨"); 
		
	//문2) 1로 예약된 자리가 어디인지 프린트
	String sum = "";//목록이 많을땐 스트링으로 묶어서 통째로 사용
	for (int i = 0; i < seat.length; i++) {
		if(seat[i]==1) {
			//System.out.println(i+"번 자리가 예약되었습니다.");
			sum = sum + i + "번 ";
		}
	}
	System.out.println("예약된 자리 목록 : " + sum);

	}

}
