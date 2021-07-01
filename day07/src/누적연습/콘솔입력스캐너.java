package 누적연습;

import java.util.Scanner; //java.util 아래 있는 모든것을 사용할때 가능 => import java.util.*;
//but (import java.util.a.Test;)는 (import java.util.*;)이렇게 가져와서는 쓸 수 없음

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은? ▶ ");
		String name = sc.next();//String 입력, next는 단어만 입력가능 공백이 있으면 가져오지 못함
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("당신의 소속은? ▶ ");
		String com = sc.next(); //nextln은 한줄(엔터치기 전까지 입력내용까지!)
		System.out.println("당신의 소속은 " + com);
	}

}
