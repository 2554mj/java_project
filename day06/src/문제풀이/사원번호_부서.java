package 문제풀이;

import javax.net.ssl.SNIHostName;
import javax.swing.JOptionPane;

public class 사원번호_부서 {

	public static void main(String[] args) {
		// 사원번호 입력:기103
	String no = JOptionPane.showInputDialog("사원번호를 입력해주세요.");
	char part = no.charAt(0); 
	if (part == '기') {
		System.out.println("기획부입니다");
	} else if (part == '인') {
		System.out.println("인사부입니다");
	} else if (part == '개') {
		System.out.println("개발부입니다");
	} 
	else {
		System.out.println("잘못입력하셨습니다.");
	} 
	
	
	
	
	}

}
