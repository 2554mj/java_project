package 조별과제;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 조별과제5 {

	public static void main(String[] args) {
		//버튼 4개만들기 
		//각 버튼에 사진넣기(짜장 우동 떡볶이 집밥)
		//각 버튼 더블클릭시 안내창 
		//(짜장->중국집으로 우동->일식집으로 떡볶이->분식집으로 집밥->집밥으로)

		JFrame f = new JFrame ("어디로");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(700, 700);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(null);
		
		
		JButton b1 = new JButton("짜장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "중국집으로 가세요");
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		b1.setBounds(49, 36, 259, 244);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일식집으로 가세요");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		b2.setBounds(379, 36, 259, 244);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("떡볶이");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "분식집으로 가세요");
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		b3.setBounds(49, 340, 259, 244);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("집밥");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "집으로 가세요");
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		b4.setBounds(379, 340, 259, 244);
		f.getContentPane().add(b4);
		
		ImageIcon a = new ImageIcon("zz.jpg");
		ImageIcon b = new ImageIcon("uu.png");
		ImageIcon c = new ImageIcon("dd.jpg");
		ImageIcon d = new ImageIcon("jib.jpg");
		b1.setIcon(a);
		b2.setIcon(b);
		b3.setIcon(c);
		b4.setIcon(d);
		
		f.setVisible(true);
		
		
		
		
  }
}



