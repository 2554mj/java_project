package 문제풀이;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
//		int a, b, c, d, e;
		int[] score = new int[5]; // 5개의 자리를 만듦
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("성적 입력>>>>>");
			score[i] = sc.nextInt(); // 입력받은 값을 i값 => 각자의 자리에 넣음

		}
		for (int x : score) {
			System.out.println(x); // 배열의 자리값에 변수x를 순서대로 넣어서 출력
		}
	}
}