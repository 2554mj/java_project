package 문제풀이;

import javax.net.ssl.SNIHostName;
import javax.swing.JOptionPane;

public class 사원번호_직급 {

	public static void main(String[] args) {
		// 사원번호 입력:기103
	String no = JOptionPane.showInputDialog("사원번호를 입력해주세요.");
	char lv= no.charAt(1); 
	if (lv == '1' || lv == '2' ) {
		System.out.println("임원");
	} else if (lv == '3') {
		System.out.println("부장");
	} else if (lv == '4' || lv == '5') {
		System.out.println("평사원");
	} 
	else {
		System.out.println("해당직급없음");
	} 
	
	
	
	
	}

}
