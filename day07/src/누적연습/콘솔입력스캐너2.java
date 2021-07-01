package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
//		문1) 숫자1 입력>>200
//		숫자2 입력>>100
//		앞 숫자가 크다 n1=200,n2=100
//		당신이 좋아하는 과목은>> java
//		JSP로 점프
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력>> ");
		int n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력>> ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("첫번째 숫자가 더 크군요!");
		} else {
			System.out.println("두번째 숫자가 더 크군요!");
		}
		
		System.out.println("==============");
		System.out.println("좋아하는 과목을 입력(자바, c++, 파이썬)>> ");
		String date=sc.next();
		if (date.equals("자바")) {
			System.out.println("JSP점프@@");
	    }else if (date.equals("c++")) {
	    	System.out.println("ASP점프@@");
		}else {
			System.out.println("파이썬으로 점프@@");
		}
		
//		switch (date) {
//		case "자바":
//			System.out.println("JSP점프@@");
//			break;
//		case "c++":
//			System.out.println("ASP점프@@");
//			break;	
//		default:
//			System.out.println("파이썬으로 점프@@");
//			break;
//		}
		//switch문은 코드가 복잡해지면, 안될때가 있음
	

	}

}
