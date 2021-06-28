package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력 -> 처리 -> 출력의 순서
		// 1. 입력 (: 프로그램의 어떤 데이터를 가지고 오는 것)/경로못찾아서 빨간줄 뜨면 그위에 마우스 올리면 안내창나옴 안나오면-> 클릭하고 F2 / 마지막 글자를 지우고 다시 자동완성(ctrl+space bar)
		// 모든 입력 데이터(사용자가 기입하는)는 스트링으로 읽어옴
		// 숫자로 쓸지, 스트링으로 쓸지는 프로그래머가 결정하며 숫자로 사용을 원하면 숫자로 변환하는 처리를 해주어야한다
		// 변환하는 처리 즉 함수를 찾아서 사용해야함
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");
		// 2. 처리 
		String result = today + "은 " + temp + "도";

		// 3. 출력/ sysout + ctrl + space bar
		System.out.println(result);

		
	} //main

} //class
