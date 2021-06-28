package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속_본인해석 {

	public static void main(String[] args) {
		// 문제)1. 무한루프
		// 문제)2. 게임 계속 물어보고
		// 문제)3. 답변에 따라 다르게 처리

		while (true) {
			// while은 주로 무한 반복문에 사용, 반복문에는 for도 사용가능
			String data = JOptionPane.showInputDialog("계속진행하시겠습니까?(0:계속,1:중지)");
			// 진행여부에 대한 안내창
			int data2 = Integer.parseInt(data); // 입력된 결과값을 정수로 변환
			if (data2 == 1) {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다."); // 결과값(중지)에 따른 안내창
				System.exit(0);
				// while이 반복되지 않고 종료되도록
				// break; -> while에 대한 중지, 따라서 while 아래 내용이 더 있다면 실행됨(
				// if에 대한 중지가 아님!
				// System.exit(0); -> class가 종료, 더이상 실행되는 것X
			} else {
				JOptionPane.showMessageDialog(null, "게임을 계속합니다."); // 결과값(계속)에 따른 안내창
			}

			String p1 = JOptionPane.showInputDialog(null, "P1:숫자를입력하세요."); // 첫번째 사람 숫자입력창
			String p2 = JOptionPane.showInputDialog(null, "P2:숫자를입력하세요."); // 두번째 사람 숫자입력창

			// p1,p2의 입력값을 정수로 변환
			int p1i = Integer.parseInt(p1);
			int p2i = Integer.parseInt(p2);

			// 더 큰 숫자를 낸 사람이 승리
			if (p1i > p2i) {
				JOptionPane.showMessageDialog(null, "P1 승리!"); // p1의 숫자가 더 큰 경우 안내창
			} else if (p1i < p2i) {
				JOptionPane.showMessageDialog(null, "P2 승리!"); // p2의 숫자가 더 큰 경우 안내창
			} else {
				JOptionPane.showMessageDialog(null, "무.승.부"); // p1과 p2의 숫자가 같을 경우 안내창
			}

		} // while
		
	}// main

}// class
