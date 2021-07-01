package 문제풀이;

import java.util.Scanner;

public class 연습문제_점수 {

	public static void main(String[] args) {
//		당신의 수학점수 입력 : 88
//		당신의 학점은 B학점입니다.
//		90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그것도 아니면 F
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("수학 점수를 입력해주세요.>> ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("당신은 A학점입니다.");
	    }else if (score >= 80) {
	    	System.out.println("당신은 B점입니다.");
	    }
	    else if (score >= 70) {
	    	System.out.println("당신은 C학점입니다.");
	    }
	    else if (score >= 60) {
	    	System.out.println("당신은 D학점입니다.");
	    }
	    else if (score >= 60) {
	    	System.out.println("당신은 F학점입니다.");
	    } 
	    else {
	    	System.out.println("점수를 다시 입력해주세요.");
	    }
		
		}
}
		
		
		
		
	


