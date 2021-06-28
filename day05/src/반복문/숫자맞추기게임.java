package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		
		Random r = new Random(4);
		int target = r.nextInt(100);
		
		while (true) {
			//1. 입력을 받아라
			String n1 = JOptionPane.showInputDialog("숫자를 입력하세요");
			
			//2. 숫자로 변환처리해라
		    int n2 = Integer.parseInt(n1);
			
		    //3. 정답인지 확인
		    if (n2 == target) {
				JOptionPane.showMessageDialog(null, "정답입니다");
				//break;//while에 대한 브레이크!
				System.exit(0);
			}// if 
			else {
				System.out.println("틀렸습니다.");
				if (n2 > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작습니다.");

				}
				
			}
		   //4. 정답이면 -> 프로그램 종료 / 정답이 아니면 1로 가라!
		}//while
		//System.out.println("게임이 모두 종료되었습니다.");

	}//main

}//class
