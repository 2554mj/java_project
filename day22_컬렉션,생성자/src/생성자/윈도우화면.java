package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나는 기본 프레임");
		f.setSize(300, 300);
		
		JButton b = new JButton("나는 버튼");
		f.add(b);
		
		JButton b2 = new JButton("나는 버튼");
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 20);
		//new Font("궁서", Font.BOLD, 20); new 다음 Font는 메서드, Font.BOLD 뒤에 BOLD는 변수
		b.setFont(font);
		//font(는 변수)에 들어가있는것은 주소
		b2.setFont(font);
		//동일한 font양식을 여러개에 적용하고 싶다면 아래보다 위와같은 코드가 좋음
		
		b.setFont(new Font("궁서", Font.BOLD, 20));
		//Font font = new Font("궁서", Font.BOLD, 20);
		//b.setFont(font); 이 두줄과 동일한 코드임, 한번만 쓴다면 이런식으로 사용
		
		f.setVisible(true);

	}

}
