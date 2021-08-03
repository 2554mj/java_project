package 컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JFrame;

public class 시험일정 {

	public static void main(String[] args) {
		ArrayList test = new ArrayList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + test);
		test.remove(0);  
		System.out.println("1일차 시험본 후 남은 과목: " + test); 
		test.remove(0);  
		System.out.println("2일차 시험본 후 남은 과목: " + test); 
		test.remove(0);  
		System.out.println("3일차 시험본 후 남은 과목: " + test); 
		
		LinkedList test2 = new LinkedList();
		test2.add("국어");
		test2.add("수학");
		test2.add("영어");
		test2.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + test2);
		test2.remove();  
		System.out.println("1일차 시험본 후 남은 과목: " + test2); 
		test2.remove();  
		System.out.println("2일차 시험본 후 남은 과목: " + test2); 
		test2.remove();  
		System.out.println("3일차 시험본 후 남은 과목: " + test2);
	}

}
