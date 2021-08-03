package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.게시판DAO;
import dao.회원DAO;
import dao.회원DAO2;
import dto.게시판Bag;
import dto.회원Bag;

public class 게시판UI {

	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		//1. 게시판정보 입력받기
		//2. 가방을 만들어서, 입력받은 데이터를 넣기
		//3. DAO를 만들어서, DAO에게 create기능을 호출(가방으로)
		
		JFrame f = new JFrame("게시판");
		f.getContentPane().setBackground(Color.gray);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 56, 145, 46);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("날짜");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(58, 99, 145, 46);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("제목");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(58, 150, 145, 46);
		f.getContentPane().add(lblNewLabel_1_1);
		
			t1 = new JTextField();
			t1.setBounds(215, 56, 229, 41);
			f.getContentPane().add(t1);
			t1.setColumns(10);
			
			t2 = new JTextField();
			t2.setColumns(10);
			t2.setBounds(215, 105, 229, 41);
			f.getContentPane().add(t2);
			
			t3 = new JTextField();
			t3.setColumns(10);
			t3.setBounds(215, 156, 229, 41);
			f.getContentPane().add(t3);
			
			JButton b = new JButton("완료");
			b.setForeground(Color.BLACK);
			b.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
			b.setBackground(Color.ORANGE);
			b.setBounds(132, 397, 195, 31);
			f.getContentPane().add(b);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("내용");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 23));
			lblNewLabel_1_1_1.setBounds(58, 251, 145, 46);
			f.getContentPane().add(lblNewLabel_1_1_1);
			
			t4 = new JTextField();
			t4.setColumns(10);
			t4.setBounds(215, 219, 229, 145);
			f.getContentPane().add(t4);
			f.setSize(500, 500);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String id = t1.getText();
					String date = t2.getText();
					String title = t3.getText();
					String content = t4.getText();
					
					게시판DAO dao = new 게시판DAO();
					게시판Bag bag = new 게시판Bag();
					bag.setId(id);
					bag.setDate(date);
					bag.setTitle(title);
					bag.setContent(content);
					
					JOptionPane.showMessageDialog(null, "게시완료");
					dao.create(bag);
					System.out.println();
				}
			});
		
		f.setVisible(true);
		
//		String id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
//		String date = JOptionPane.showInputDialog("날짜를 입력해주세요.");
//		String title = JOptionPane.showInputDialog("제목을 입력해주세요.");
//		String content = JOptionPane.showInputDialog("내용을 입력해주세요.");
//		
//		게시판DAO dao = new 게시판DAO();
//		게시판Bag bag = new 게시판Bag();
//		bag.setId(id);
//		bag.setDate(date);
//		bag.setTitle(title);
//		bag.setContent(content);
//		
		
		
		
	}
}
