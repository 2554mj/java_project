package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 태어난연도 {

	public static void main(String[] args) {
		Date date = new Date();
		//자동 import : ctrl+shift+o, 하나씩import : f2 또는 위에 마우스 올리기
		int year = date.getYear()+ 1900;
		
		
		String no = JOptionPane.showInputDialog("나이를 입력해주세요");
		int age = Integer.parseInt(no);
		int bon = year - age + 1 ;
		JOptionPane.showMessageDialog(null, bon +"년에 태어나셨군요!");

	}

}
