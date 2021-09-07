package com.mega.mvc06;

import java.io.IOException;

public class Problem06Main {

	public static void main(String[] args) {
	Problem06 error = new Problem06();
	try {
		error.call();
	} catch (Exception e) {
		System.out.println("호출한 곳에서 다르게 알아서 처리함...");
	} 
	System.out.println("에러 발생 후 실행될까요....1");
	System.out.println("에러 발생 후 실행될까요....2");
	System.out.println("에러 발생 후 실행될까요....3");
	System.out.println("에러 발생 후 실행될까요....4");
	}

}
