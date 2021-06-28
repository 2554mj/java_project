package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		
		// 1. 입력
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
		
		// 2. 처리/ 금요일은 어제보다 덥다or안덥다
		int yes = 28; //어제온도
		//int temp2 = Integer.parseInt(temp);
		double temp3 = Double.parseDouble(temp);
		
		//int result = yes - temp2;
		double result2 = yes - temp3;
   
		// 3. 출력/ sysout + ctrl + space bar
		//System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");

		
	} //main

} //class
