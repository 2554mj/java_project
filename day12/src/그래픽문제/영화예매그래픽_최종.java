package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽_최종 {
	static boolean flag = false; // 36. 버튼 활성/비활성 트리거로 boolean flag 선언 (초기값은 false로)

	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매 그래픽"); // 1. 새로운 frame f에 복사 (생성)
		f.setSize(800, 800); // 2. f의 크기 (가로, 세로)
		FlowLayout flow = new FlowLayout(); // 4. 버튼 배치 방식을 FlowLayout으로 (물흐르듯이 좌라락)(미지정시 기본은 Border)
		f.setLayout(flow); // 5. flow를 f에 설정
		Font font = new Font(null, Font.BOLD, 30); // 10. 버튼에 적용시킬 new Font font 생성
		int[] seat = new int[200]; // 16. 좌석 별 예약 현황용(0,1) int 배열 seat 생성 (초기값: 0) { 0, 0, 0, 0, ... 0 }
		ArrayList list = new ArrayList(); // 44. list라는 ArrayList 생성..(?)

		for (int i = 0; i < 200; i++) { // 6. 200번 반복
			JButton b = new JButton(String.valueOf(i)); // 7. JButton b 생성 (i는 int라 ()사이에 넣을 때 String으로 넣어줘야 한다)
			b.setLayout(flow); // 8. b의 레이아웃을 flow로
			b.addActionListener(new ActionListener() { // 17. b를 클릭했을때 아래가 실행

				@Override
				public void actionPerformed(ActionEvent e) { // 18. actionPerformed 메서드, 이벤트가 e라는 변수에 저장된다
					String s = e.getActionCommand(); // 19. e를 발생시킨 객체(b 버튼) 문자열을 String s에 저장
//					System.out.println(s); // (19가 잘 찍히나 확인용)
					int s2 = Integer.parseInt(s); // 20. s를 스트링에서 int로 변환해서 s2에 저장
					list.add(e.getSource()); // 45. b를 누르면 e의 주소값이 list에 들어간다
					if (flag) { // 37. flag가 true면 (이 경우 버튼을 누르면)
						seat[s2] = 1; // 21. s2의 index값을 가진 seat배열 속 값을 1로 (예약된 자리로 변경)
//					b.setEnabled(false); // 22. b 버튼을 비활성화
						b.setBackground(Color.DARK_GRAY); // 23. 회색으로 색상 변경
						b.setOpaque(true); // 24-1. mac용
						b.setBorderPainted(false); // 24-2. mac용
						flag = false; // 39. flag boolean을 false로
					} else { // 38. flag가 false라면 (버튼을 다시 누르면)
						seat[s2] = 0; // 40. s2 index의 seat값을 다시 0으로 (빈 자리로)
						b.setBackground(null); // 41. b의 색상을 원래대로
						b.setOpaque(true); // 42-1. mac용
						b.setBorderPainted(true); // 42-2. mac용
						flag = true; // 43. flag boolean을 true로
					} // if
				} // b1.actionPerformed
			}); // b1.ActionListener
			f.add(b); // 9. f에 b를 추가
		}

		JButton b2 = new JButton("<<< 결제하기 >>>"); // 11. 결제하기 버튼 생성
		b2.setFont(font); // 12. font를 b2의 Font로
		b2.setBackground(Color.yellow); // 13. b2의 색깔 yellow로
		b2.setOpaque(true); // 14-1. mac에서 버튼 색깔 추가 함수
		b2.setBorderPainted(false); // 14-2. mac에서 버튼 색깔 추가 함수
		b2.addActionListener(new ActionListener() { // 25. b2를 클릭했을때 아래가 실행

			@Override
			public void actionPerformed(ActionEvent e) { // 26. actionPerformed 메서드, 이벤트가 e라는 변수에 저장된다
				int count = 0; // 27. 예매 좌석 갯수 변수 (계산용)
				final int MONEY = 10000; // 28. 상수 int 변수 MONEY에 10000 값저장 (계산용)
				String book = ""; // 29. 예매 좌석 번호용 빈칸 스트링
				for (int i = 0; i < seat.length; i++) { // 30. seat배열 길이만큼 반복
					if (seat[i] == 1) { // 31. seat[i] 가 1 이라면
						count++; // 32. count + 1
						book = book + i + "번 "; // 33. 스트링 변수 book에 "i번" 결합
					}
				} // for
				int payment = count * MONEY; // 34. 총 금액 계산
				// 35. 선택한 좌석 수, 위치, 총 금액 출력
				JOptionPane.showMessageDialog(f, count + "좌석 ( " + book + ")" + "\n계산하실 금액은 " + payment + "원입니다.");
				for (Object x : list) { // 46. list에 들어있는 주소값을 Object x 넣기 { 버튼 0의 주소, 버튼 1의 주소, 버튼 2의 주소 }
					JButton b = (JButton) x; // 47. x를 JButton b로 형변환
					b.setBackground(null);
					b.setOpaque(true);
					b.setBorderPainted(true);
				}
				for (int i = 0; i < seat.length; i++) {
					seat[i] = 0; // 48. 배열 초기화
				}
			} // b2.actionPerformed
		}); // b2.ActionListener
		f.add(b2); // 15. f에 b2 추가

		JButton b3 = new JButton("좌석 다시 선택하기"); // 49. 초기화 버튼 생성
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Object x : list) { // { 버튼 0의 주소, 버튼 1의 주소, 버튼 2의 주소 }
					JButton b = (JButton) x;
					b.setBackground(null);
					b.setOpaque(true);
					b.setBorderPainted(true);
				}
				for (int i = 0; i < seat.length; i++) {
					seat[i] = 0;
				}
			} // b3.actionPerformed
		}); // b3.ActionListener
		f.add(b3); // 50. f에 b3 추가

		f.setVisible(true); // 3. true: f 보이기 (가장 마지막에 놓는다)

	}

}