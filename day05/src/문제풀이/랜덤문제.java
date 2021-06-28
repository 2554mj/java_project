package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

//랜덤한 숫자를 2개 발생시켜서 
//첫번째 랜덤숫자가 더 크면 첫번째가 더 커요!
//두번째 랜덤숫자가 더 크면 두번째가 더 커요!
public class 랜덤문제 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(100);
		System.out.println(n1);
		System.out.println(n2);

		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "첫번째가 더 커요!");
			
		} else {
			JOptionPane.showMessageDialog(null, "두번째가 더 커요!");

		}



	}

}
