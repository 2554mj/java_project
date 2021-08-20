package 자바기본;

import java.util.Scanner;

public class 기본입출력7 {
	public static void main(String[] args) {

	//1. 입력받기 : 시작값, 종료값
	//2. 5의 배수만 더해서 출력
	Scanner sc = new Scanner(System.in);
	System.out.println("시작값 입력>> ");
	int start = sc.nextInt();
	System.out.println("종료값 입력>> ");
	int finish = sc.nextInt();
    
	int sum = 0;
	for (int i = start; i <= finish; i++) {
		if(i % 5 == 0)
		sum += i ;
	}
	System.out.println(" 총합계는 " + sum);
	
	
//	int i = start + (start % 5);
//    System.out.println("@@@" + (start % 5));
//	while(i <= finish) {
//		i = i + 5;
//		System.out.println(i);
//		sum += i;
//	}
//	System.out.println(sum);
		
	
	
	
	sc.close();
	
	
}
	}
