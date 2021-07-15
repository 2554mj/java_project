package DB연결;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame("");
		f.getContentPane().setBackground(Color.GRAY);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(75, 34, 68, 43);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(172, 43, 189, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(75, 103, 106, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(172, 103, 189, 34);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(75, 156, 68, 43);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(172, 165, 189, 34);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(75, 220, 106, 43);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(172, 229, 189, 34);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1~t4에 입력값 가져오기
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//member테이블에 저장하려고 함=> 원하는 기능인 메소드가 있는 클래스가 필요
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);//원본에서 void를 return으로 수정
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공!");
					}
					else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}//입력한거 지워버리자!
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(55, 327, 88, 71);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id를 입력 받아야함.
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력해주세요.");
				//db처리해야함.
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1 ) {
						JOptionPane.showMessageDialog(f, "탈퇴처리 성공!");
					}
					else {
						JOptionPane.showMessageDialog(f, "없는 아이디입니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(199, 327, 88, 71);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("수정");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id를 입력받아야함
				String id = JOptionPane.showInputDialog("본인의 id를 입력해주세요.");
				String tel = JOptionPane.showInputDialog("수정할 전화번호를 입력해주세요");
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result == 1 ) {
						JOptionPane.showMessageDialog(f, "수정완료");
					}
					else {
						JOptionPane.showMessageDialog(f, "없는 아이디입니다.");
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setBounds(336, 327, 88, 71);
		f.getContentPane().add(btnNewButton_1_1);
		f.setSize(500, 500);
	
		
		
		f.setVisible(true);//얘는 맨끝에 들어가야함
	}
}
