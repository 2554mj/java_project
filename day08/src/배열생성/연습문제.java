package 배열생성;

public class 연습문제 {

	public static void main(String[] args) {
		//문1) int크기 5인 배열을 생성해보세요.
		int[] s = new int [5];
		//문2) 배열의 크기를 프린트하세요.
		System.out.print(s.length);

		//문3) 배열의 첫번째 위치에 100을 넣어서 프린트
            s[0] = 100;
		    System.out.println(s[0]);
		
		//문4) 배열의 마지막 위치에 500을 넣어서 프린트
       		s[s.length-1] = 500;
			System.out.println(s[s.length-1]);
	
		//문5) 배열의 3번째 위치에 200을 넣어서 프린트
			s[2] = 200;
			System.out.println(s[2]);
			System.out.println();
		
		//문6) 배열의 전체 데이터를 프린트
        for (int i = 0; i < s.length; i++) {
        	System.out.print(s[i] + " ");
		}   System.out.println();	
		
		//문7) 배열의 전체 데이터를 인덱스와 함께 프린트
        for (int i = 0; i < s.length; i++) {
			System.out.println(i + ":" + s[i]);
        }
		//문8) 그림으로 그려보세요.
		
		
	}
}


