package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력응용3 {
	public static void main(String[] args) {

		//1. 입력받기 : 시작값, 종료값
		//2. 10의 배수만 더해서 출력
	Scanner sc = new Scanner(System.in);
	System.out.println("시작값 입력>> ");
	int start = sc.nextInt();
	System.out.println("종료값 입력>> ");
	int finish = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
	int sum = 0;
	double count = 0;

	for (int i = start; i <= finish; i++) {
		if(i % 10 == 0) {
		sum += i ;
		//3. 10의 배수의 개수
	    //4. 10의 배수의 목록
	    //5. 10의 배수의 평균값
		list.add(i);
	}
	
	}
	System.out.println("총 합계는>> " + sum);
	System.out.println("10의 배수 개수는>> " + list.size());
	System.out.println("10 배수 목록은>> " + list);
	double avg = sum / list.size(); //int avg =(double)sum / list.size(); 
	System.out.println("10의 배수 평균값은>> " + avg);
 
	sc.close();
	
	
}
	}
