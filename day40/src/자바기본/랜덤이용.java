package 자바기본;

import java.util.Random;

public class 랜덤이용 {

	public static void main(String[] args) {
		// 1. 시작할 값 (~10) 발생
		Random r = new Random(100); //()안의 값은 씨앗값, seed값
		int start = r.nextInt(10); //0~9 사이의 값에서 랜덤으로 추출 
		// 2. 종료할 값 (1000~)을 발생
		int finish = r.nextInt(10) + 1000; //1000~1009 사이의 값에서 랜덤으로 추출
		// 3. 3의 배수만 더하기
		int sum = 0;
		for (int i = start; i < finish; i++) {
			if (i % 3 == 0) {
				sum += i;
			}//if end
		}//for end
		System.out.println("3의 배수의 총합은 : " + sum);

	}

}
