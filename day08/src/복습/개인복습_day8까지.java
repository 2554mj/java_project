package 복습;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class 개인복습_day8까지 {
	public static void main(String[] args) {
		//제어문
		//-순차문 : 위에서 아래로, 왼쪽에서 오른쪽으로, 우선순위를 바꾸려면 괄호를 사용
		//-조건문 : if / if~ else~ / if~ else if~ else~ / switch ~case
		//-반복문 : for(무한에 주로사용) / while(유한에 주로사용)
		
		//램에 찌거기(=쓰레기)가 많은 상태로 변수선언이 되어서 컴파일(=번역오류) 에러가 뜸. 
		//그래서 깨끗하게 비운 뒤 선언을 하는 것이 좋음. 예) string=null, int=0
		//정리하면 처음에 공간을 할당할 때 쓰레기 값이 들어있어서 프린트와 연산이 불가능
		//이렇게 공간을 초기에 깨끗히 하는 작업 = 변수의 초기화

		//단위테스트, unit test : 함수 1개씩 테스트 하는 것
		
		//System.exit(0) : 클래스가 아예 종료
		//break; : 브레이크가 걸림, 해당하는 while/for/switch만 정지! if는 자동으로 걸림.
		
		
	//반복문_ for : for (int i = 시작값; i < 종료값; i++증가식) 
	     // 예) 1부터 5까지 반복해서 찍어보자
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);			}
	     //예) 10부터 20까지 중 2씩 점프해서 찍어보자
			for (int i = 10; i <= 20; i=i+2) {
				System.out.println(i);      	}
	
	//반복문_while		
			int i = 0; //시작값
			while (i < 10) { //조건식
				System.out.println("밥먹을 시간이예요");
				i++;  } //증감식  			
	
	//조건문_if~ else if~
			//1. 입력
			int jumsu = 66;			
			//2. 처리
			String result = null; //변수의 초기화 
		  if (jumsu >= 90) {
				result = "A학점";
		} else if (jumsu >= 80) {
			result = "B학점";
			
		} else if (jumsu >= 70) {
			result = "C학점";
	    } else  {
			result = "F학점";
			
		}	
	//클래스 사용법	  
			//클래스 : 벽돌과 망치 중 망치같은 기능을 하며 자주 사용하여 RAM에 이미 들어가 있음.
		    //이름으로 바로 사용가능 예)Integer, Double, System, JOptionPane 첫글자대문자.
	
	//Random 랜덤_클래스
			Date date = new Date();
			//아래와 같음 
			//Date name; ->변수선언(램에 저장공간을 만드는 것) 선언형식은 저장된타입+변수명;
			//name = new Date();
			//Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다
			//CPU는 모든 부품을 ram에 가져다놓고 조립한다
			int hour = date.getHours(); //10
			System.out.println("현재 시각은 " + hour + "시");
			System.out.println("지금은 " + date.getMinutes() + "분");
			 
			
	//Random 랜덤_클래스		
			
			Random r = new Random();
			//r이라는 변수를 선언함
			//랜덤은 임의의 값을 만들어내는 부품(class)
			//한번만 사용하면 같은 class 내 모든값에 적용가능
			//Random() 괄호안에 값을 넣으면 고정된 값이 도출되며 이를 씨앗값이라고한다 
			//주로 테스트를 하기위해서 사용
			int n1 = r.nextInt(100); 
			//무수히 많은 r의 값중에 정수하나를 가져옴(범위0~99)
			//n1은 첫번째 임의의 실수 값
			System.out.println(n1);  //n1값의 결과를 도출
						
			
			
			
			
	}
}