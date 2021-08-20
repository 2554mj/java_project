package 자바기본;

import java.util.Scanner;

public class 기본입출력6 {

	//100부터 499까지 전체를 더하기
	public static void main(String[] args) {
		int sum = 0;
		int i = 100;
		while (i < 500) { 
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		int i2 = 100;
		while (true) { 
			sum2 = sum2 + i2;
			i2++;
			if (i2 == 500) {
				break;
			}
		}
		System.out.println(sum2);
		
	}

}
