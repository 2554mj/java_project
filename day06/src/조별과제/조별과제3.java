package 조별과제;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 조별과제3 {

	public static void main(String[] args) {
		//JFrame으로 날짜와 시간 버튼을 만들고 
		//현재 날짜와 시간창이 나오게 하세요.

		JFrame f = new JFrame ("날짜와 시간");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(700, 700);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(null);
		Date date = new Date();
		JButton b = new JButton("오늘 날짜");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int mon = date.getMonth();
				int day = date.getDay();
				
				JOptionPane.showMessageDialog(null, "오늘은 "+mon+"월 "+day+"일 입니다.");
			}
		});
		b.setBackground(Color.PINK);
		b.setFont(new Font("나눔스퀘어_ac Bold", Font.BOLD, 25));
		b.setBounds(105, 79, 471, 173);
		f.getContentPane().add(b);
		
		JButton b2 = new JButton("현재시간");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hour = date.getHours();
				int min = date.getMinutes();
				
				JOptionPane.showMessageDialog(null, "지금은 "+hour+"시 "+min+"분 입니다.");
				
			}
		});
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("나눔스퀘어_ac Bold", Font.BOLD, 25));
		b2.setBounds(105, 287, 471, 173);
		f.getContentPane().add(b2);
		
		
			
		f.setVisible(true);
		
		
		
		
  }
}



