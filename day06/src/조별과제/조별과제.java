package 조별과제;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 조별과제 {

	public static void main(String[] args) {
		// JFrame을 이용해서 버튼을 150개 만드세요.
		//1. 이름 : 버튼 150
		//2. 사이즈 700 * 700
		//3. 각 버튼에 번호 적기
		JFrame f = new JFrame ("버튼 150");
		f.setSize(700, 700);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 150; i++) {
			JButton b = new JButton((i+1)+"");
			f.add(b);
		}
			
		f.setVisible(true);
		
		
		
		
  }
}



