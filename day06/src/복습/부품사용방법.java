package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {
		//망치는 이미 램에 있는 애
		//너무 자주 사용하여 RAM에 이미 들어가있음
		//클래스이름으로 바로 사용가능
		//Integer, Double, System, JOptionPane
		//기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고
		//함수를 가지고 있는 부품을 선택
		
		//벽돌
		
		Date date = new Date();
		//아래와 같음 
		//Date name; ->변수선언(램에 저장공간을 만드는 것) 선언형식은 저장된타입+변수명;
		//name = new Date();
		//Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다
		//CPU는 모든 부품을 ram에 가져다놓고 조립한다
		
		
		//Random r = new Random();
		//Scanner sc = new Scanner(System.in);
		
		int hour = date.getHours(); //10
		System.out.println("현재 시각은 " + hour + "시");
		
		System.out.println("지금은 " + date.getMinutes() + "분");
		//System.out.println(System.out.println());
		//함수는 반환이 있는 것이 있고 반환이 없는 것이 있음
		//반환은 return이라고 부르며, 반환이 없는 경우는 void라고 함
		//반환이 있는 함수만 프린트가 가능하다
		
	}

}
