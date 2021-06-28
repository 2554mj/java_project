package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
		// new: 벽돌처럼 사용할 때 RAM에 새롭게 복사해서 부품을 사용함.
//		JFrame f = new JFrame();
//		JButton b1 = new JButton();
//		JTextField t1 = new JTextField();
//		JLabel 1 = new JLabel();
		
		Random r = new Random(4); 
		//Random() 괄호안이 빈칸->랜덤이 계속돌아감
		//괄호안에 숫자하나(=씨앗값)를 넣으면 대응하는 하나의 값이 나옴
		int num = r.nextInt(100); //0~99(범위를 정해줄 때 시작값은 무조건0)
		System.out.println(num);
		// int r2 = System.out.println(num); 보이드값이라서 r2로 변수에 넣을 수 없음
		
		//50보다 작은 임의의 수 생성 범위 : 0~49
		int num1 = r.nextInt(50); 
		System.out.println(num1);
		//50보다 작은 임의의 수 생성 범위 : 5~49
				int num1_1 = r.nextInt(45) + 5; 
				System.out.println(num1_1);
		
		//1000보다 작은 임의의 수 생성 범위: 0~999
		int num3 = r.nextInt(1000); 
		System.out.println(num3);
		//1000보다 작은 임의의 수 생성 범위: 100~999
				int num3_1 = r.nextInt(900) + 100; 
				System.out.println(num3_1);
	            //3~22
				int num4 = r.nextInt(20)+3;
	
	
	}

}
