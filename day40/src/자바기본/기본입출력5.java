package 자바기본;

import java.util.Scanner;

public class 기본입출력5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = new int[5];
		int i2 = 0;
		while (i2 < 5) { //while을 유한으로 사용하고 싶다면 둘 중에 하나를 선택하여 사용
			//(true) + while 끝내는 조건문 or (i2 < 5) 
			System.out.print("오늘 온도는 몇 도인가요? ");
			int answer = sc.nextInt();
			if (answer >= 30) {
				System.out.println("오늘은 너무 더워요!!");
			} else {
				System.out.println("오늘은 덥지않고 괜찮네요~");
			} 
			jumsu[i2] = answer; 
			sum = sum + answer;
			i2++;
		}
		double avg = sum / 5.0;//while로 변경되서 끝나는지점이 없어서 뜨는 에러!
		
		System.out.println("평균은 " + avg);
		System.out.println("=================");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		
		sc.close();//입력스트림 닫기

	}

}
