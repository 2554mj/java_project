package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요?");
		try {
			
			System.out.println("2. 문제발생줄@@" + 10 / 0);
			FileWriter file = new FileWriter("a:\test.txt");
			file.write("내가 첫째 줄 \n ");
			file.write("내가 둘째 줄 \n ");
			file.close();
		}catch (ArithmeticException e1) {
			// 수학적에러
			e1.printStackTrace();
		}catch (IOException e2) {
			// 입출력 관련 에러
			System.out.println("파일에 쓰는 중 에러발생....@@");
		}catch (Exception e3) {
			//위의 명시된 에러말고 나머지 모든 에러를 잡아줘!!
			System.out.println("모든 에러를 처리함....");
		}finally {
			//에러 발생 유무와 상관없이 반드시 실행해주어야 하는 부분은 여기에 넣음! 예)close
			System.out.println("!!!!!!!예외처리 다했음, 이건 꼭 실행!!!!!!!");
		}
		
		System.out.println("3. 나는..나는?? 프린트 될까요?");

	}

}
