package 새창에데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
	public void open2(String m2) {
		{
			JFrame f = new JFrame("새창2화면@@");
			f.setSize(800,1000);
			JButton b1 = new JButton(m2 + " 창 화면닫기");
			f.add(b1);
			b1.setBackground(Color.blue);
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "새창2를 종료");
					System.exit(0);
					//f.dispose();//이 프레임만 종료
				}
			});
			f.setVisible(true);
		}
		
	}

}
