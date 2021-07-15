package pack05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextPane;

public class Test05 {
	private static JTextField tf1;
	private static JTextField tf2;

	public static void main(String[] args) {
		JFrame f = new JFrame("계산기_TEST");
		f.getContentPane().setBackground(Color.white);//배경색 : 하얀
		f.getContentPane().setLayout(null);
		f.setSize(500, 500);
		//레이아웃을 지정하지 않으면, 내가 넣고 싶은 위치에 넣을 수 있음 지정하면 5개만 들어감
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(36, 10, 409, 90);
		f.getContentPane().add(lblNewLabel);
		ImageIcon cal = new ImageIcon("cal.jpg");
		lblNewLabel.setIcon(cal);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.PLAIN, 25));
		textPane.setText("숫자1");
		textPane.setBounds(97, 163, 68, 36);
		f.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("숫자2");
		textPane_1.setFont(new Font("굴림", Font.PLAIN , 25));
		textPane_1.setBounds(97, 253, 68, 36);
		f.getContentPane().add(textPane_1);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBackground(Color.YELLOW);
		tf1.setBounds(222, 148, 199, 67);
		f.getContentPane().add(tf1);
		
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBackground(Color.YELLOW);
		tf2.setBounds(222, 235, 199, 67);
		f.getContentPane().add(tf2);
		
		JButton b1 = new JButton("더하기");
		b1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1.setBounds(48, 344, 157, 59);
		f.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() { //b1버튼을 눌렀을때 다음을 수행해라
			public void actionPerformed(ActionEvent e) {
				String no1 = tf1.getText(); //첫번째 텍스트필드에서 값을 가져와라
				String no2 = tf2.getText(); //두번째 텍스트필드에서 값을 가져와라
				int n1 = Integer.parseInt(no1); //가져온 첫번째 스트링값을 인트로 변환
				int n2 = Integer.parseInt(no2); //가져온 두번째 스트링값을 인트로 변환
				int add = n1+n2; //두 값을 더해줌
					JOptionPane.showMessageDialog(b1, add);					
				}
			});
		
		JButton b1_1 = new JButton("빼기");
		b1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1_1.setBounds(236, 344, 157, 59);
		f.getContentPane().add(b1_1);
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no1 = tf1.getText();
				String no2 = tf2.getText();
				int n1 = Integer.parseInt(no1);
				int n2 = Integer.parseInt(no2);
				int min = n1-n2;
					JOptionPane.showMessageDialog(b1, min);					
				}
			});
		
		
		
		
	
		
		
		f.setVisible(true);//얘는 맨끝에 들어가야함
	}
}
