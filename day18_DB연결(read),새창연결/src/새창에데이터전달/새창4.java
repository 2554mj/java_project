package 새창에데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {
	public void open4(String d) {
		{
			JFrame f = new JFrame("새창4화면@@");
			f.setSize(800,1000);
			int d1 =Integer.parseInt(d); 
			if (d1 > 30) {
				JOptionPane.showMessageDialog(f, "폭염");
			}
			else {
				JOptionPane.showMessageDialog(f, "견딜만해요!");
			}
			
			
			JButton b1 = new JButton("종료");
			f.add(b1);
			b1.setBackground(Color.blue);
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "새창4를 종료");
					System.exit(0);
					//f.dispose();//이 프레임만 종료
				}
			});
			f.setVisible(true);
		}
		
	}

}
