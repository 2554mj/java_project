package 문제풀이;

import java.util.Scanner;

public class 연습문제_점수2 {

	public static void main(String[] args) {
//		당신의 수학점수 입력 : 88
//		당신의 학점은 B학점입니다.
//		90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그것도 아니면 F
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("안정성를 입력해주세요.>> ");
		Double a= sc.nextDouble();
		System.out.println("속도를 입력해주세요.>> ");
		Double b= sc.nextDouble();
		System.out.println("연비를 입력해주세요.>> ");
		Double c= sc.nextDouble();
		
		Double result = (0.3 * a) + (0.5 * b) + (0.2 * c);
		
		if (result >= 90) {
			System.out.println("-최우수-입니다.");
	    }else if (result >= 80) {
	    	System.out.println("-우수-입니다.");
	    }
	    else if (result >= 70) {
	    	System.out.println("-보통-입니다.");
	    }else if (result < 70) {
	    	System.out.println("-미달-입니다.");
	    }
	    else {
	    	System.out.println("점수를 다시 입력해주세요.");
	    }
		
		}
}
		
		
		
		
	


