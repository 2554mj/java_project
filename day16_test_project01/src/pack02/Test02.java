package pack02;

import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("건강 검진을 위해 회원의 정보를 입력해주세요.");
		System.out.println("-------------------------------------");
		
		System.out.println("당신의 소속은>> ");
		Scanner sc = new Scanner(System.in);//스캐너를 통해 입력값을 받아옴, 한번만써줌
		String s = sc.next();//받아온 입력값을 스트링으로 변수sc에 저장
		System.out.println("당신의 소속은 " + s +"이시군요!");
		
		System.out.println("당신의 나이는>> ");
		int s2 = sc.nextInt();//받아온 입력값을 int로 변수s2에 저장
		int age = s2 -1;//작년나이이므로 입력값에서 -1을 해줌
		System.out.println("당신의 작년 나이는 " + age +"세였겠군요!");
		
		System.out.println("현재 당신의 몸무게는>> ");
		Double s3 = sc.nextDouble();//받아온 입력값을 double로 변수s3에 저장
		if (s3 >= 90) { //입력값이 90이상일 경우 
			System.out.println("당신은 지금 과체중이시군요!");
		}
		else if (s3 >= 70) {//입력값이 70이상일 경우
			System.out.println("당신은 지금 보통이시군요!");
		}
		else {//그 외의 경우
			System.out.println("당신은 지금 미달이시군요!");
		}
		
		System.out.println("당신은 결혼하셨나요>> ");
		Boolean s4 = sc.nextBoolean(); //받아온 입력값을 Boolean로 변수s4에 저장
		if (s4 = true) {//입력값이 true일 경우
			System.out.println("당신은 배우자가 있겠군요.");
		}
		else {//입력값이 false일 경우
			System.out.println("당신은 배우자가 없겠군요.");
		}
		System.out.println("-------------------------------------");
		System.out.println("입력을 마무리합니다.");
	}

}
