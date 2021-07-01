package 그래픽;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 아이디입력 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 처리 화면");
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.setVisible(false);
		f.getContentPane().setLayout(null); //레이아웃을 지정하지 않으면, 내가 넣고 싶은 위치에 넣을 수 있음 지정하면 5개만 들어감
		
		JLabel lblNewLabel = new JLabel("아이디:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 93, 122, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(95, 205, 122, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel result = new JLabel("결과보이는곳");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 20));
		result.setBounds(65, 382, 173, 44);
		f.getContentPane().add(result);
		
		t1 = new JTextField();
		t1.setBounds(195, 96, 219, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(195, 208, 219, 44);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("로그인 확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//로그인확인 버튼을 눌렀을 때 실행됨
				String s1 =t1.getText();
				String s2 =t2.getText();
				if (s1.equals("apple") && s2.equals("pass")) {
					result.setText("로그인 성공@@@");
					
				}else {
					result.setText("로그인 실패@@@");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(65, 280, 135, 90);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				
			}
		});
		btnNewButton_1.setBounds(242, 280, 135, 90);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
