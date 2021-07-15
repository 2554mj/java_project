package 연습문제;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		String title = JOptionPane.showInputDialog("제목을 입력하세요.");

		BbsDB db2 = new BbsDB();
		db2.delete(title);

	}

}
