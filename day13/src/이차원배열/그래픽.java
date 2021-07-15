package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class 그래픽 {
	private static JTable table;

	public static void main(String[] args) {
		JFrame f = new JFrame("이차배열");
		f.setSize(400, 200);
		
		//제목
		String[] title = { "컴퓨터", "영어", "수학" };
		
		//내용
	    String[][] contents= {
				{ "77", "88", "95" }, 
				{ "87", "69", "90" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				{ "100", "85", "70" }, 
				};
		
	    JTable table = new JTable(contents, title);
		JScrollPane scroll = new JScrollPane(table);
		//내용이 길어서 하단이 안보일 경우 스크롤안에 테이블을 넣어라
		
		f.add(scroll);
		f.setVisible(true);
	}

}
