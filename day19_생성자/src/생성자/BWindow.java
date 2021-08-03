package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BWindow {
	
	public BWindow() {
		System.out.println("B객체가 생성");
	}

	public void open() {
		JFrame f = new JFrame("B");
		f.setSize(300, 300);
		
		JButton a = new JButton("a open");
		f.add(a);
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			AWindow a = new AWindow();
			a.open();
			f.dispose();//b가 오픈되면 a가 사라짐
				
			}
		});
		f.setVisible(true);
		
	}

}
