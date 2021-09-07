package com.mega.mvc05.static1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	//main이 static이므로, 객체생성하지 않아도 접근이 가능한 변수여야한다.
	//그러므로 main안에 사용하는 전역변수는 반드시 static으로 만들어주어야한다.
	//그러나 static을 많이 만들면 메모리가 너무 많이 할당되어 좋지 않은 코드가 된다!!
	final static int price = 5000;//상수
	static int total;

	public static void main(String[] args) {
		// main이 static인 이유는 객체생성하지 않아도 main부터 시작하기 때문!
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(900, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개 수 : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(563, 36, 309, 50);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setBounds(640, 21, 192, 82);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon("짬뽕.jpg");
		img.setIcon(icon);
		img.setBounds(39, 145, 804, 468);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액 ");
		result.setFont(new Font("굴림", Font.BOLD, 25));
		result.setBounds(124, 654, 309, 50);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sum++;
			count.setText(sum+"개");
			ImageIcon icon1 = new ImageIcon("짬뽕.jpg");
			img.setIcon(icon1);
			total += price;
			result.setText(Integer.toString(total)+"원");
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(39, 25, 110, 64);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				ImageIcon icon2 = new ImageIcon("우동.jpg");
				img.setIcon(icon2);
				total += price;
				result.setText(Integer.toString(total)+"원");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(181, 25, 110, 64);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("짜장");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				ImageIcon icon3 = new ImageIcon("짜장.jpg");
				img.setIcon(icon3);
				total += price;
				result.setText(Integer.toString(total)+"원");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(323, 25, 110, 64);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		
		
		
		
		f.setVisible(true);

	}
}
