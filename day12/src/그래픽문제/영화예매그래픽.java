package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class 영화예매그래픽 {

	public static void main(String[] args) {
	//JFrame은 무한루프 거의 쓰지않음(채팅에서사용)
	//1)===============기본창만들기
	JFrame f = new JFrame("영화 예매 그래픽 버젼");
	f.setSize(560, 750);//시작
	
	//2)===============좌석 버튼만들기(200개)
	//JButton b = new JButton(0); 괄호안에는 스트링만 들어갈 수 있음, int는 안됨
	//int => string (0 + "") or String.valuOF(0)
	//보더레이아웃은 무조건 가운데 넣음. 줄지어 넣으라고 메서드넣기
	FlowLayout flow = new FlowLayout();
	f.setLayout(flow);
	//4.1)===============각 버튼의 액션을 할 수 있게
	int[] seat = new int[200]; //{0, 0, ...}
	for (int i = 1; i < 201; i++) {
		JButton b = new JButton(i + "");
		
		//4)===============버튼을 눌렀을때 무언가를 할 수 있게
		//b.addActionListener(new ac =>까지 입력하고 Ctrl+Spacebar
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 
			//e=변수임 익셉션도 e로 많이 쓰임
			String s = e.getActionCommand();
			//seat[s] = 1; => 배열의[] 안에는 int만 가능 string은 안됨
			int index = Integer.parseInt(s);
			seat[index] = 1;
			JOptionPane.showMessageDialog(f, index + "번 예약됨");
			//4.2)===============이미예약된 버튼을 비활성화+컬러변경
			b.setEnabled(false);
			b.setBackground(Color.red);
			
			}
		}); 
		
		f.add(b);
	}
	
	//3)===============결제하기 버튼만들기
	JButton b2 = new JButton("<<<  결제하기  >>>");
	b2.setBackground(Color.yellow);
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//5.1)===============결제하기버튼을 눌렀을때 배열안에 1이 몇개인지 세서 
			//5.2)===============한자리 1만원씩 계산 후에 
			//5.3)===============출력:결제금액알려주세요
			//5.4)===============출력:예약한좌석번호를 모두 알려주세요
			
			int count = 0;
			String sum = "";
			//액션리스너는 클래스를 새로만든 개념이라서 count를 mian에 넣으면
			//실행이 안됨. 위치: JButton b2 = new JButton("<<<  결제하기  >>>"); 이 앞에 넣으면!
			for (int i = 0; i < seat.length; i++) {
				if(seat[i]==1) {
					count++;
					sum = sum + i + "번 ";
			}
			} 
			JOptionPane.showMessageDialog(f,"예약된 자리 목록 : " + sum);
			JOptionPane.showMessageDialog(f,"결제금액 : " + (count*10000) + "원");
			
		}
	});
	
	f.add(b2);
	
	
	

	
	//1)===============기본창만들기
	f.setVisible(true);

	}

}
