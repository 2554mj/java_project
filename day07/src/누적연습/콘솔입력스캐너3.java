package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
//		나이입력 >>100 -> nextint()
//		내년 나이는 101세
//		키는 입력 >>88.8 -> nextDouble
//		내년 키는 98.8
//		저녁을 먹었는지 입력(true/false)>>true  ->  nextBoolean
//		배가 부르시겠군요!
//		올해의 목표는 >> 열심히 살자    -> nextLine
//		올해의 목표는 열심히살자!!!
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		System.out.println("내년에 당신은 " + (age+1) +"세 이군요." );
		
		System.out.println("==============");
		
		System.out.println("당신의 키는? >> ");
		Double heigh = sc.nextDouble();
		System.out.println("내년에 당신의 키는 " + (heigh+10) +"cm 이군요." );
		
		System.out.println("==============");
		
		System.out.println("당신은 저녁을 먹었습니까?(true/false) >> ");
		Boolean dinner = sc.nextBoolean();
		if (dinner) {
			System.out.println("배가 부르시겠군요!");
		}else {
			System.out.println("배가 고프시겠군요ㅜㅜ");
		}
//		if (true) {
//			System.out.println("배가 부르시겠군요!");
//		}else {
//			System.out.println("배가 고프시겠군요ㅜㅜ");
//		} 
		
		
		System.out.println("==============");
		
		sc.nextLine();
		System.out.println("올해의 목표는 >> ");
		String goal = sc.nextLine();
		System.out.println("올해의 목표는 "+ goal +"!!!");

		
		
	
	}

}
