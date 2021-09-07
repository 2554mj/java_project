package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class ArrayError {

	public static void main(String[] args) {
		try {
			
			int[] num = {1,2,3};
			num[3] = 4;
		}catch (ArithmeticException e1) {
			// 인덱스에러
		    System.out.println("인덱스 에러!!");
		}catch (Exception e2) {
			// 다른에러, 이 에러가 인덱스 에러 앞으로 위치가 바뀌면 이 에러가 모두 잡음.
			System.out.println("다른 에러 발생@@");
		}finally {
			System.out.println("!!!배열에 문제가 사라지게 해결했어요.!!!");
		}
	}

}
