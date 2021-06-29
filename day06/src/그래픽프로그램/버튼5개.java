package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개");
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("가운데");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("동쪽");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("북쪽");
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
				
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("서쪽");
		btnNewButton_3.setBackground(Color.YELLOW);
				btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_3, BorderLayout.WEST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
				
			}
		}); 
		
		
		f.setVisible(true);
		

	}

}
