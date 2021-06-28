package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속 {

	public static void main(String[] args) {
	//1. 무한루프
    //2. 게임 계속 물어보고
    //3. 답변에 따라 다르게 처리

		while (true) {
			String data = JOptionPane.showInputDialog("계속진행하시겠습니까?(0:계속,1:중지)");
			int data2 = Integer.parseInt(data);
			if (data2 == 1) {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다.");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "게임을 계속합니다.");
			}
		
		
	//첫번째 사람 숫자입력
	String p1 = JOptionPane.showInputDialog(null, "P1:숫자를입력하세요.");
		
	//두번째 사람 숫자입력
	String p2 = JOptionPane.showInputDialog(null, "P2:숫자를입력하세요.");

	//p1,p2를 정수로 변경
	int p1i = Integer.parseInt(p1);
	int p2i = Integer.parseInt(p2);
	
	//더 큰 숫자를 낸 사람이 승리
				if (p1i > p2i) {
				JOptionPane.showMessageDialog(null, "P1 승리!");
			} else if (p1i < p2i) {
				JOptionPane.showMessageDialog(null, "P2 승리!");
			} else {
				JOptionPane.showMessageDialog(null, "무.승.부");
			} 
		
	
		}//while
   }//main

}//class
