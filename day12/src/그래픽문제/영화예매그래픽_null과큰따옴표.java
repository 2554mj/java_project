package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽_null과큰따옴표 {

	public static void main(String[] args) {
		// 1)== J프레임만들기
		int result = 0;
		JFrame f = new JFrame("영화 예매 그래픽 버젼");
		f.setSize(560, 750);

		// 2)== 좌석 버튼만들기(200개)
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 버튼이 가운데만 생기니까 줄지어생기도록

		int[] seat = new int[200]; // {0, 0, ...}
		for (int i = 0; i < 200; i++) {
			// 버튼200개 반복작업 => for문으로
			JButton b = new JButton(i + "");// ()소괄호안에는 String

	    // 4)== 좌석 버튼에 액션 넣기
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					// seat[s]를쓰고싶음.[]안엔 int만 가능하니까 string을 int로 바꿔주기
					int index = Integer.parseInt(s);
					seat[index] = 1; // 클릭하면 1로 바뀜
					
					// 4.2)== 예약된 버튼 비활성화, 배경색변경:레드
					b.setEnabled(false);
					b.setBackground(Color.red);
				}
			});

			f.add(b);
		}

		// 3)== 결제버튼 만들기
		JButton b2 = new JButton("<<<  결제하기  >>>");
		b2.setBackground(Color.yellow);

		// 5)== 결제버튼 만들기
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sum = "";// null과 ""는 다름
				for (int i = 0; i < seat.length; i++) {
					// 5.1)== "seat[index]==1"이 몇 번되었는지 세기
					if (seat[i] == 1) {
						sum = sum + i + "번 ";
					}
				}

			
				// 5.4)== 최종 예약좌석 확인 안내창
				JOptionPane.showMessageDialog(f, "예약된 자리 목록 : " + sum);
			}
		});

		f.add(b2);

		f.setVisible(true);

	}

}
