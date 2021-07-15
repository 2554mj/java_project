package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽_타이틀_선택해제 {
	static int count2 = 0;

	public static void main(String[] args) {
		// 1)== J프레임만들기
		JFrame f = new JFrame();
		f.setSize(560, 750);

		// 2)== 좌석 버튼만들기(200개)
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 버튼이 가운데만 생기니까 줄지어생기도록

		int[] seat = new int[200]; // {0, 0, ...}
		ArrayList list = new ArrayList();
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
					// 4.1)== 예약확인 안내창
					JOptionPane.showMessageDialog(f, index + "번 예약됨");
					// 4.2)== 예약된 버튼 비활성화, 배경색변경:레드
					b.setEnabled(false);
					b.setBackground(Color.red);
					//++)타이틀에 예약된좌석수 띄우기 이 위치에선 클릭하면 액션추가이므로 
					//++)굳이 for,if문을 넣어줄 필요가 없음 
					//++)static int count2 = 0; count2를 메인밖에 static을 붙여서 써주면
					//++)특정영역에서만 사용가능한 지역변수도 main전체에서 사용가능
					count2++;
					f.setTitle("예약된 좌석수 : " + count2+"");				}
			});
			f.add(b);
		}

		// 3)== 결제버튼 만들기
		JButton b2 = new JButton("<<<  결제하기  >>>");
		b2.setBackground(Color.yellow);

		// 5)== 결제버튼 액션넣어주기
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				final int Money = 10000;
				String sum = "";// null과 ""는 다름
				for (int i = 0; i < seat.length; i++) {
					// 5.1)== "seat[index]==1"이 몇 번되었는지 세기
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
					}
				}

				// 5.2)== 결제금액 계산하기
				int total = count * Money;
				// 5.3)== 결제금액 안내창
				JOptionPane.showMessageDialog(f, "결제금액 : " + total + "원");
				// 5.4)== 최종 예약좌석 확인 안내창
				JOptionPane.showMessageDialog(f, "예약된 자리 목록 : " + sum);
			}
		});
		b2.setBackground(Color.yellow);
		f.add(b2);
		
		JButton b3 = new JButton("선택 해제");
		f.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Object x : list) {
					JButton b = (JButton) x;
					b.setBackground(Color.LIGHT_GRAY);
					
				}
				
			}
		});
		f.setVisible(true);
	}

}
