package 연습문제;

import javax.swing.JOptionPane;

import 클래스사용.MemberDB;

public class 게시물등록 {

	public static void main(String[] args) {
		String title = JOptionPane.showInputDialog("제목을 입력하세요.");
		String input = JOptionPane.showInputDialog("내용을 입력하세요.");

		BbsDB db2 = new BbsDB();
		db2.creat(title, input);

	}

}
