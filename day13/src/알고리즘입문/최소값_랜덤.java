package 알고리즘입문;

import java.util.Arrays;
import java.util.Random;

public class 최소값_랜덤 {

	public static void main(String[] args) {
		// 1~1000까지의 값을 랜덤하게 10000개 만들어서 
		//1.최소값  2.개수  3.위치값
		Random r = new Random(100);
		int[] a = new int[10000];
		for (int i = 0; i < a.length; i++) {
			a[i]=r.nextInt(1000) + 1;
		}//배열을 만듬
		
		//최소값찾기
		int min = a[0];
		int count = 0;//1이 몇개인가?
		for (int i = 1; i < a.length; i++) { 
			if (a[i] < min) {
				min = a[i];
				//count++; 여기다 카운트 넣지 말아야함
			}
		}
		System.out.println("최소값은 " + min);
		
		//개수, 위치값 찾기
		String loca = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				count++;
				//System.out.println("위치는 " + i +"번"); 이걸 한줄로 표현할때는
				//String loca = ""; loca += i; 이렇게 써줌
				loca += i + " ";//아래와 동일한 의미임
				//loca = loca + i + " ";
			}
		}
		System.out.println("개수는 " + count);
		System.out.println("위치는 " + loca);
		
		//파괴함수를 써서 정렬한 뒤 최소값/최대값을 찾아보자! ==> 시험볼땐 이렇게사용하면 안됨
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length -1]);
		
	}
}

