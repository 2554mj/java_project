package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); //레이아웃을 지정하지 않으면, 내가 넣고 싶은 위치에 넣을 수 있음
		
		JButton btnNewButton = new JButton("커피◆");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피◆");
					
				}
			}
		});
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton.setBounds(120, 127, 251, 97);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("별10개");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");;
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_1.setBounds(120, 20, 251, 97);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피*우유3");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_2.setBounds(120, 234, 251, 97);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("1:짱!");
		btnNewButton_2_1.setBackground(Color.PINK);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println( (i + 1) + "짱!");
					
				}
		
			}
		});
		btnNewButton_2_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(120, 341, 251, 97);
		f.getContentPane().add(btnNewButton_2_1);
		
		
		
		
		f.setVisible(true);
		

	}
}
