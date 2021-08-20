package 자바기본;

import java.util.Scanner;

public class 기본입출력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		//int[] jumsu = {}; //배열의 값을 다 알고있을 경우 사용  
		int[] jumsu = new int[5]; //배열의 값을 모르니 공간만 만들자!
		//int[] jumsu = {0,0,0,0,0}; 이 둘은 같은코드
		//왜? 배열은 자동초기화를 해주기 때문에 둘이 똑같은 코드이다!
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇 도인가요? ");
			int answer = sc.nextInt();
			if (answer >= 30) {
				System.out.println("너무 더워요!!");
			} else {
				System.out.println("오늘은 덥지않고 괜찮네요~");
			} 
			jumsu[i] = answer; 
			sum = sum + answer; // sum += answer;
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		System.out.println("=================");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i] + " ");
		}
		
		sc.close();//입력스트림 닫기

	}

}
