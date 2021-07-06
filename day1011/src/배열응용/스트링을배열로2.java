package 배열응용;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		//공백제거하기
		//해결책1) trim
		String s1 = " 감자";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		String s3 = "    감자          ";
		System.out.println(s3.length());
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s1.replace("    ","");
		System.out.println(s5.length());
		
		System.out.println("=============");
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파 ";
		System.out.println(data.length());
		String data2 = data.trim();
		System.out.println(data2.length());
		String data3 = data2.replace(" ","");
		System.out.println(data3);
		//원본의 내용을 안바꾸는 replace, trim => 비파괴함수
		
		System.out.println("=============");
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);//원본의 내용을 바꾸는 함수 => 파괴함수
		for (int i : num) {
			System.out.print(i + " ");
		}
			


	}
}

