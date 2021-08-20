package 자바기본;

import java.util.Scanner;

public class 기본입출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//누적용은 반복문을 사용하지 않는다!! for문을 쓰면 0으로 초기화되서 변한 값이 저장되지 않음	
		int sum = 0;
		//변수 초기화를 반드시 해줘야 함 => 어떤경우는 자동, 어떤 경우는 수동
		//자동 => 전역변수 : 클래스 전체 영역에서 사용가능한 변수 (예)멤버변수
		//수동 => 지역변수 : 괄호에서만 사용가능한 변수
		//변수가 선언되는 위치에 따라 전역변수(클래스 바로아래) / 지역변수(메서드안 즉, 괄호안에 선언)
		//지역변수를 전역변수로 변경하고 싶다면, 선언된 위치를 이동시켜!
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇 도인가요? ");
			int answer = sc.nextInt();
			if (answer >= 30) {
				System.out.println("너무 더워요!!");
			} else {
				System.out.println("오늘은 덥지않고 괜찮네요~");
			} 
			sum = sum + answer; 
			//에러 : sum에 쓰레기값이 들어있어서 값을 넣을수도없고 연산도 불가능! 초기화시켜주자!
			//쓰레기값이 뭐임? 연산도 할 수없고, 출력도 안되는 상태!!!!
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		//자바에서는 정수끼리 연산은 무조건 정수
		//자바에서는 하나라도 실수이면, 연산의 결과는 무조건 실수!
		//소수점아래를 살리고 싶다면 
		//(해결책1) 5를 실수로 변경! 5 -> 5.0
		//(해결책2) sum을 실수로 변경!
		//그럼 int sum = 0;을 위에서 선언하고 -> 여기서 double sum =0.0; 바꿀수 없음.
		//int로 태어난 애를 double로 바꾸는건 자바에서 허용하지않음. 파이썬은 가능!
		//double avg = (double)sum / 5.0; 이건 가능함!
		//(double)sum => CPU가 RAM에 있는 것을 가져다가 타입을 무조건 변경함!!
		
		
		sc.close();//입력스트림 닫기

	}

}
