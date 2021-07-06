package 문제풀이;

import java.util.Scanner;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 정수 5개 10,20,30,40,50 첫번째 세번째 더해서 프린트
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자입력>>");
			num[i]=sc.nextInt();
		} System.out.println(num[0] + num[2]);
		//스캐너와 같은 입출력 스트림을 사용하는 애는 닫아주기
		sc.close();
		
		
		
	

	}

}
