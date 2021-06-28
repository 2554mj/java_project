package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		
		// 1. 입력
		String no1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요.");
		String no2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		
		// 2. 처리
		int ino1 = Integer.parseInt(no1); //첫번째 입력값 정수변환
		int ino2 = Integer.parseInt(no2); //두번째 입력값 정수변환
		
		int result_p = ino1 + ino2; //두 수의 더하기식
		int result_m = ino1 - ino2; //두 수의 빼기식
		
		// 3. 출력/ sysout + ctrl + space bar
		System.out.println("두 수의 합 = " + result_p);
		System.out.println("두 수의 차 = " + result_m);
		
	} //main

} //class
