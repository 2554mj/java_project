package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyledEditorKit.BoldAction;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton b1 = new JButton("나는 왼쪽");
		JButton b2 = new JButton("나는 오른쪽");
		JButton b3 = new JButton("나는 가운데");
		JButton b4 = new JButton("나는 아랫쪽");
		JButton b5 = new JButton("나는 윗쪽");
		//b1.addActionListener(new ac =>까지 입력하고 Ctrl+Spacebar
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1을 눌렀을 때 처리하는 내용을 쓴다
				Up up = new Up();
				up.up();
				//함수는 기능을 적어둘때 실행되는 것이 아니라 
				//위와같이 실제로 불러서 기능을 작동시킬때 실행됨
				//이렇게 불러내는 행위를 호출(콜)한다고 말함
				
			}
		});
		
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);
		
		b1.setBackground(Color.black);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.green);
		b4.setBackground(Color.blue);
		b5.setBackground(Color.yellow);
		
		Font font = new Font("궁서", Font.BOLD , 30);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		
		
		
		f.setVisible(true);
		
		
	}

}
