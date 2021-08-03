package 새창에데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	public void open3(String id, String pw) {
		{
			JFrame f = new JFrame("새창3화면@@");
			f.setSize(400,400);
			
			if (id.equals("root") && pw.equals("pass")) {
				JOptionPane.showMessageDialog(f, "로그인 성공");
			}
			else {
				JOptionPane.showMessageDialog(f, "로그인 실패");
			}
			
			JButton b1 = new JButton("종료");
			f.add(b1);
			b1.setBackground(Color.blue);
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "새창3을 종료");
					System.exit(0);//main도 종료
					//f.dispose();//이 프레임만 종료
				}
			});
			f.setVisible(true);
		}
		
	}

}
