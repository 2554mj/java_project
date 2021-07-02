package 배열응용;

import java.util.Random;
import java.util.Scanner;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101);//(100)은 100까지의 범위를 지정한것
			
		System.out.println(jumsu[i]);
		}
		for (int x : jumsu) {
			System.out.println(x);
			
		}
		

}
}