package 자바기본;

import java.util.ArrayList;
import java.util.Random;

public class 조별문제1 {

	public static void main(String[] args) {
		Random r = new Random(100); 
		// 1. 시작할 값 (~100) 발생
		int start = r.nextInt(101); 
		// 2. 종료할 값 (500~)을 발생
		int finish = r.nextInt(100) + 500; 
		// 3. 배수 값(1~10) 발생
		int no = r.nextInt(10) + 1; 
		System.out.println(start);
		System.out.println(no);
		System.out.println(finish);
		
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = start; i < finish; i++) {
			if (i % no == 0) {
				sum += i;
				list.add(i);
				
			}//if end
		}//for end
		System.out.println(no + " 의 배수의 총합은 : " + sum);
		System.out.println(no + "의 배수 개수는 : " + list.size());
		double avg = sum / (double)list.size();
		System.out.println(no + "의 배수의 평균은 : " + avg);

	}

}
