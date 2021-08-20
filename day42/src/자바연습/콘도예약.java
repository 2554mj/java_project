package 자바연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 콘도예약 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<>();
		while (true) {
			System.out.println("================콘도 예약을 진행합니다==============");
			System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 신청가능");
			System.out.println("-----------------------------------------------");
			System.out.println("1)강원도 2)전라도 3)파주 4)제주도 5)충청도");
			System.out.println("-----------------------------------------------");
			System.out.println("신청현황: " + list);
			System.out.println("===============================================");
			System.out.println("신청자 성함을 입력하세요.>> ");
			String name = sc.next();
			System.out.println("원하시는 지역코드를 입력하세요. (종료는 0)>> ");
			int answer = sc.nextInt();
			System.out.println();
			
			
			if (answer == 0) {
             System.out.println("시스템을 종료합니다.");
             break;
			} 
			else if (answer == 1) {
				if (list.size() >= 2) {
					System.out.println("인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른지역을 신청해주세요.");
				} else {
					list.put(name, answer);
					System.out.println("신청이 가능합니다.");
					System.out.println("신청이 완료되었습니다.");
				}
			} 
			else if (answer == 2) {
				if (list.size() >= 2) {
					System.out.println("인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른지역을 신청해주세요.");
				} else {
					list.put(name, answer);
					System.out.println("신청이 가능합니다.");
					System.out.println("신청이 완료되었습니다.");
				}
			} 
			else if (answer == 2) {
				if (list.size() >= 2) {
					System.out.println("인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른지역을 신청해주세요.");
				} else {
					list.put(name, answer);
					System.out.println("신청이 가능합니다.");
					System.out.println("신청이 완료되었습니다.");
				}
			}
				else if (answer == 3) {
					if (list.size() >= 2) {
						System.out.println("인원이 초과되어 신청이 불가능합니다.");
						System.out.println("다른지역을 신청해주세요.");
					} else {
						list.put(name, answer);
						System.out.println("신청이 가능합니다.");
						System.out.println("신청이 완료되었습니다.");
					}
			} 
			else if (answer == 4) {
				if (list.size() >= 2) {
					System.out.println("인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른지역을 신청해주세요.");
				} else {
					list.put(name, answer);
					System.out.println("신청이 가능합니다.");
					System.out.println("신청이 완료되었습니다.");
				}
			} 
			else if (answer == 5) {
				if (list.size() >= 2) {
					System.out.println("인원이 초과되어 신청이 불가능합니다.");
					System.out.println("다른지역을 신청해주세요.");
				} else {
					list.put(name, answer);
					System.out.println("신청이 가능합니다.");
					System.out.println("신청이 완료되었습니다.");
				}

			} 
			else {
				System.out.println("잘못입력하셨습니다. 확인 후 다시 입력해주세요.");
			} 
			
		}
		sc.close();	
	}

}
