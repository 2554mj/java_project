package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class ArrayError2 {

	public void array() {
		try {
			int[] num = {1,2,3};
			num[3] = 4;//3번 인덱스는 없다. 인덱스는 0~2
		} catch (Exception e) {
			System.out.println("이 방법은 호출할 메서드에서 try/catch 처리....!");
		}
	}
	public void array2() throws IOException, ArithmeticException, Exception{
		int[] num = {1,2,3};
		num[3] = 4;
	}

}
