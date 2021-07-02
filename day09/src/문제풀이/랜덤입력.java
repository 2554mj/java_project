package 문제풀이;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] jumsu = new int[100]; // 0-99까지 랜덤한 숫자, 배열로 만듦

		// 랜덤한 값을 하나 만들어서 특정한 값을 인덱스에 저장
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100); // 랜덤 숫자를 배열의 각자자리에 넣음 +1씩 증가
			System.out.println(jumsu[i]); // 랜덤숫자 100개를 출력
//		for (int x : jumsu) {
//			System.out.print(x); 
		}
	}

}
