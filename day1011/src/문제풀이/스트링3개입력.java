package 문제풀이;

import java.util.Scanner;

public class 스트링3개입력 {

	public static void main(String[] args) {
		String[] s = new String[3];
		//배열은 자동 초기화된 상태 {null, null, null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력 >>");
			s[i] = sc.next();
		}
		System.out.println(s[0] + "보다는" + s[1]);	
		sc.close();
		
	}

}
