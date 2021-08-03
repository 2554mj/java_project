package test;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import test.jgUI;

import java.awt.Font;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("main_민정원");
		f.getContentPane().setBackground(Color.white);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("========================================================================================================================================");
		lblNewLabel.setBounds(12, 82, 960, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel wel = new JLabel("");
		wel.setHorizontalAlignment(SwingConstants.CENTER);
		wel.setBounds(12, 107, 960, 644);
		f.getContentPane().add(wel);
		ImageIcon p1 = new ImageIcon("welcome.png");
		wel.setIcon(p1);
		
		JButton b1 = new JButton("로그인");
		b1.setBounds(93, 33, 90, 25);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("회원가입");
		b2.setBounds(193, 33, 90, 25);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("정보수정");
		b3.setBounds(293, 33, 90, 25);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("공연정보");
		b4.setBounds(443, 33, 90, 25);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("공연검색");
		b5.setBounds(543, 33, 90, 25);
		f.getContentPane().add(b5);
		
		JButton b8 = new JButton("예매확인");
		b8.setBounds(693, 33, 90, 25);
		f.getContentPane().add(b8);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jgUI w11 = new jgUI();
				w11.open10();
				//f.setVisible(false);//b8버튼을 누르면 main창이 안보여짐
			}
		});
		
		JButton b9 = new JButton("투표하기");
		b9.setBounds(793, 33, 90, 25);
		f.getContentPane().add(b9);
		
		
		
		
//		b9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Page2UI w2 = new Page2UI();
//				w2.open2();
//				//f.setVisible(false);//b9버튼을 누르면 main창이 안보여짐
//			}
//		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 800);
		f.setVisible(true);

	}
}
