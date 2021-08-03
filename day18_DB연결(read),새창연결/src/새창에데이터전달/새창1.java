package 새창에데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창1 {
	public void open1(String m) {
		JFrame f = new JFrame("새창1화면@@");
		f.setSize(500,500);
		JButton b1 = new JButton(m + " 창 화면닫기");
		f.add(b1);
		b1.setBackground(Color.pink);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x클릭시 창은 없어지지만 실제로 프로그램은 돌아가고 있음,전체종료
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창1을 종료");
				//System.exit(0);
				f.dispose();//이 프레임만 종료
				
			}
		});
		f.setVisible(true);
	}

}
