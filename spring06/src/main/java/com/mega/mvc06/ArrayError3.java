package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class ArrayError3 {

	public static void main(String[] args) {
		ArrayError2 error = new ArrayError2();
		error.array();
		System.out.println("에러 발생 후 실행될까요....1");
		System.out.println("에러 발생 후 실행될까요....2");
		
		//ArrayError2 error = new ArrayError2();
		try {
		error.array2();
		} catch (Exception e) {
			System.out.println("이 방법은 메서드에서 throws해서 호출한 곳에서 처리함...");
		} 
		System.out.println("에러 발생 후 실행될까요....1");
		System.out.println("에러 발생 후 실행될까요....2");
		
	}

}
