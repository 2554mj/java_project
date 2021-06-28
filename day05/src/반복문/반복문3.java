package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		//시작값:3
		//종료값:10
		//3,4 ~10까지 프린트
		
		String start = JOptionPane.showInputDialog("시작값은?");
		String finish = JOptionPane.showInputDialog("종료값은?");
		
		int start_i = Integer.parseInt(start);
		int finish_i = Integer.parseInt(finish);
		
		int i = start_i; //시작값
		while (i <= finish_i) { //조건식
			System.out.println(i);
			i++;  //증감식
		}

	}

}
