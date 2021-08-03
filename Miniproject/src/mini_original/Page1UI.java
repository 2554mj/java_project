package mini_original;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page1UI {

//	public static void main(String[] args) {
	
	private static JTextField tf1;

	public void open1() {

		JFrame f = new JFrame("예매확인_p.1");
		f.getContentPane().setBackground(Color.white);
		f.getContentPane().setLayout(null);

		JLabel LB1 = new JLabel("예매 확인");
		LB1.setFont(new Font("바탕체", Font.BOLD, 30));
		LB1.setForeground(Color.DARK_GRAY);
		LB1.setBounds(439, 131, 163, 89);
		f.getContentPane().add(LB1);

		JLabel LB2 = new JLabel("ID");
		LB2.setForeground(Color.DARK_GRAY);
		LB2.setFont(new Font("Javanese Text", Font.BOLD, 30));
		LB2.setBounds(381, 288, 46, 89);
		f.getContentPane().add(LB2);

		JTextField tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.PLAIN, 15));
		tf1.setBounds(542, 311, 239, 43);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);

		JButton NB = new JButton("확인");
		NB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력값받아와서
				String id = tf1.getText();
				// db처리하자
				Page1DAO db = new Page1DAO();
				String[] result;
				try {
					result = db.read(id);
					if (result[0] == null) {
						JOptionPane.showMessageDialog(f, "예약된 내역이 없습니다.");
					} else {
						JOptionPane.showMessageDialog(f,
								"예약된 공연은 " + result[2] + ", 예약좌석은 " + result[3] + ", 예약번호는 " + result[3] + "입니다");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				tf1.setText("");

			}
		});
		NB.setFont(new Font("굴림", Font.BOLD, 15));
		NB.setBounds(488, 465, 114, 43);
		f.getContentPane().add(NB);
		f.setSize(1000, 800);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
