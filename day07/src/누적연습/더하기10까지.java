package 누적연습;

public class 더하기10까지 { //맨앞에 숫자는 올 수 없음, 즉 '10까지더하기'란 이름 불가능

	public static void main(String[] args) {
		// 1-10까지 더해봅시다.
		int sum = 0 ; //누적되는 수가 저장 될 변수
		for (int i = 1; i <= 10000; i++) {
			//1+2+3+... 컴퓨터도 한번에 다 더할 수 없음. 각각 더하려면 각 수가 저장될 공간이 필요
			//저장될 공간을 for문 안에 넣으면 0이 되므로 for문 위에 써준다.
			
			sum = sum + i; //sum+i=>0+1 인 상태, 연산만 한 식은 쓸모X 램에 넣어둬야함.
			//System.out.println(sum); =>
		
		}//for
		System.out.println(sum);

	}//main

}//class
