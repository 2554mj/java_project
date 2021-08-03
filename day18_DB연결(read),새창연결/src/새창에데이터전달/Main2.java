package 새창에데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창>> 여기서 시작");
		f.getContentPane().setEnabled(false);
		f.setSize(520, 553);
		Font font = new Font("궁서", Font.BOLD, 45);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(43, 35, 104, 49);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("굴림", Font.BOLD, 20));
		lblPw.setBounds(43, 96, 104, 49);
		f.getContentPane().add(lblPw);
		
		t1 = new JTextField();
		t1.setBackground(Color.MAGENTA);
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(198, 35, 260, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBackground(Color.MAGENTA);
		t2.setBounds(198, 96, 260, 49);
		f.getContentPane().add(t2);
		

		JButton b1 = new JButton("로그인처리");
		b1.setBounds(124, 208, 269, 61);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 w3 = new 새창3();
				w3.open3(t1.getText(),t2.getText());
			}
		});
		
		JLabel lblPw_1 = new JLabel("오늘의 온도");
		lblPw_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblPw_1.setBounds(43, 332, 189, 49);
		f.getContentPane().add(lblPw_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBackground(Color.MAGENTA);
		t3.setBounds(198, 332, 260, 49);
		f.getContentPane().add(t3);
		
		JButton b2 = new JButton("결정");
		b2.setBounds(124, 427, 269, 61);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d = t3.getText();
				새창4 w2 = new 새창4();
				w2.open4(d);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		
		
		
		
		

		f.setVisible(true);

	}
}
