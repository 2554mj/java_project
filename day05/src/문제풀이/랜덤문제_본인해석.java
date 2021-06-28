package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

//문제)랜덤한 숫자를 2개 발생시켜서 
//문제)첫번째 랜덤숫자가 더 크면 첫번째가 더 커요!
//문제)두번째 랜덤숫자가 더 크면 두번째가 더 커요!
public class 랜덤문제_본인해석 {

	public static void main(String[] args) {
		
		Random r = new Random(); 
		//r이라는 변수를 선언함
		//랜덤은 임의의 값을 만들어내는 부품(class)
		//한번만 사용하면 같은 class 내 모든값에 적용가능
		//Random() 괄호안에 값을 넣으면 고정된 값이 도출되며 이를 씨앗값이라고한다 
		//주로 테스트를 하기위해서 사용
		int n1 = r.nextInt(100); 
		//무수히 많은 r의 값중에 정수하나를 가져옴(범위0~99)
		//n1은 첫번째 임의의 실수 값
		int n2 = r.nextInt(100); //n2는 두번째 임의의 실수 값
		System.out.println(n1);  //n1값의 결과를 도출
		System.out.println(n2); //n2값의 결과를 도출

		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "첫번째가 더 커요!");
			//n1과 n2을 비교한 뒤, n1값이 큰 경우 메세지 띄우기
		} else {
			JOptionPane.showMessageDialog(null, "두번째가 더 커요!");
			//n1과 n2을 비교한 뒤, n2값이 큰 경우 메세지 띄우기
		}



	}//main

}//class
