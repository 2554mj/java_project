package 문제풀이;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		//전화번호입력>> 011-245-1234
		//문1) 양쪽 공백을 제거하시오.
		//문2) -를 기준으로 분리해내세요.(String)
		//문3) 첫번째 문자열 : 011->SK / 019->LG / 나머지->Apple
		//문4) 두번째 문자열 길이 : 4개이상->최신폰 / 아니면->올드폰
		//문5) 전체 전화번호 길이 : 10글자이상 -> 유효한번호 / 아니면 -> 유효하지않은전화번호
		
		//모두 비파괴함수
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력해주세요.>> ");
		String t = sc.nextLine();
		String t2 = t.trim();
		String[] t3 = t2.split("-");
		//t3 = {"011", "245", "1234"}
		
		for (int i = 0; i < t3.length; i++) {
		}//for
		if (t3[0].equals("011")) {
			System.out.println("011 > SK");
		}
		else if (t3[0].equals("019")) {
			System.out.println("019 > LG");
		}
		else {
			System.out.println("나머지 > Apple");
		}
		//======================================
		
		if (t3[1].length() >= 4) {
			System.out.println("최신폰");
		}
		else {
			System.out.println("올드폰");
		}
		//=====================================
		
		int no = t3[0].length()+t3[1].length()+t3[2].length();
		
		if (no >= 10) {
			System.out.println("유효한 전화번호입니다.");
		}
		else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
		
		
		
		
		 
		
		
		
	}

}
