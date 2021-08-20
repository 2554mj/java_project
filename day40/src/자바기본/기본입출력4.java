package 자바기본;

import java.util.Scanner;

public class 기본입출력4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = new int[5];
		//유한 반복 => count 초기값 / 반복할 조건 / 증가값
		//무한 반복 => 반복할 조건 count 초기값 : int i =0; , 증가값 필요 : i++;
		//for문은 세개의 값이 자동으로 생성되지만, while은 안나오므로 직접 적어줘야함
		int i2 = 0;
		while (true) {
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
			if (i2 == 5) {
				break;
			}
		}
		double avg = sum / 5.0;//while로 변경되서 끝나는지점이 없어서 뜨는 에러!
		
		System.out.println("평균은 " + avg);
		System.out.println("=================");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i] + " ");
		}
		
		sc.close();//입력스트림 닫기

	}

}
