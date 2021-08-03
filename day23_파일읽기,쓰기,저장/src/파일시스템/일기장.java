package 파일시스템;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class 일기장 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 일기장");
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 56, 145, 46);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(58, 112, 145, 46);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 내용");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(58, 257, 145, 46);
		f.getContentPane().add(lblNewLabel_1_1);
		
			t1 = new JTextField();
			t1.setBounds(215, 56, 229, 41);
			f.getContentPane().add(t1);
			t1.setColumns(10);
			
			t2 = new JTextField();
			t2.setColumns(10);
			t2.setBounds(215, 117, 229, 41);
			f.getContentPane().add(t2);
			
			t3 = new JTextField();
			t3.setColumns(10);
			t3.setBounds(215, 185, 229, 178);
			f.getContentPane().add(t3);
			
			JButton b = new JButton("파일에 일기저장");
			b.setForeground(Color.BLACK);
			b.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
			b.setBackground(Color.ORANGE);
			b.setBounds(132, 397, 195, 31);
			f.getContentPane().add(b);
			f.setSize(500, 500);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try
					{
					String day = t1.getText();
					String title = t2.getText();
					String content = t3.getText();
					FileWriter file = new FileWriter(day+".txt");
					
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
					JOptionPane.showMessageDialog(null, "일기가 기록됨");
					} 
					catch
					(IOException a) {
						System.out.println("파일 저장하는 동안 에러가 발생함");
					}
				}
			});
		
		f.setVisible(true);
		

	}
}
