package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		
		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); //{"감자","고구마","양파"}
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));
		
		//일,월,화 날씨를 순서대로 입력해보세요.("흐림,맑음,흐림") (스캐너이용)
		//흐림이 몇개인지, 맑음이 몇개인지
		//1. sc.next()로 받아서
		//2. 스트링을 배열로 변환해서 넣으세요.
		//3. 카운트해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일, 월, 화요일의 날씨를 순서대로 입력해주세요.>> ");
		String w = sc.nextLine();
		String[] w2 = w.split(",");
		//w2 = {"흐림", "맑음", "흐림}

		int cloud = 0;
		int sun = 0;
		
		for (int i = 0; i < w2.length; i++) {
			if (w2[i].equals("흐림")) {
				cloud++;
			}
			else {
				sun++;
			}
		}
		System.out.println("흐렸던 날은>>" + cloud + "일");
		System.out.println("맑았던 날은>>" + sun + "일");

	}
}

