package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 태어난시간 {

	public static void main(String[] args) {
		
		String no = JOptionPane.showInputDialog("태어난 시간을 입력해주세요");
		int time = Integer.parseInt(no);
		
		if (time <= 11) {
			System.out.println("오전에 태어나셨군요");
		}else if (time <= 17) {
			System.out.println("오후에 태어나셨군요");
		}else if (time <= 23) {
			System.out.println("밤에 태어나셨군요");
		}else {
			System.out.println("새벽에 태어나셨군요");
		}
	}

}
