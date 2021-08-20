package 자바연습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 영웅문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		
		System.out.println("1. 영웅을 입력해주세요.>> ");
		String hero1 = sc.next();
		boolean check = list.contains("슈퍼맨");
		if (check == true) {
			System.out.println("슈퍼맨은 이미 존재합니다.");
		}
		else if (check == false) {
			System.out.println("슈퍼맨을 추가합니다.");
			list.add(hero1);
		}
		boolean check2 = list.contains("배트맨");
		if (check == true) {
			System.out.println("배트맨은 이미 존재합니다.");
		}
		else if (check == false) {
			System.out.println("배트맨을 추가합니다.");
			list.add(hero1);
		}
		
		
		System.out.println("2. 영웅을 입력해주세요.>> ");
		String hero2 = sc.next();
		
		boolean check3 = list.contains("슈퍼맨");
		if (check3 == true) {
			System.out.println("슈퍼맨은 이미 존재합니다.");
		}
		else if (check3 == false) {
			System.out.println("슈퍼맨을 추가합니다.");
			list.add(hero2);
		}
		boolean check4 = list.contains("배트맨");
		if (check4 == true) {
			System.out.println("배트맨은 이미 존재합니다.");
		}
		else if (check4 == false) {
			System.out.println("배트맨을 추가합니다.");
			list.add(hero2);
		}
		
		System.out.println("3. 영웅을 입력해주세요.>> ");
		String hero3 = sc.next();
		list.add(hero3);
		

		
		

		int count = Collections.frequency(list, "슈퍼맨");
		System.out.println("슈퍼맨: " + count + "명");
		
		int count2 = Collections.frequency(list, "배트맨");
		System.out.println("배트맨: " + count2 + "명");
		
		int count3 = Collections.frequency(list, "아이언맨");
		System.out.println("아이언맨: " + count3 + "명");

	}

}
