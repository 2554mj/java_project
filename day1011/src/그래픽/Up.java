package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up {
	//위 버튼을 눌렀을때 작동하는 
	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300,300);
		JButton b = new JButton("나를 눌러요");
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1을 눌렀을 때 처리하는 내용을 쓴다
				Up2 up2 = new Up2();
				up2.up();
				
			}
		});

		
		
		f.setVisible(true);

 }
}