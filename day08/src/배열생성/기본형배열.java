package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		//new int [크기] -> int 배열설정 heap에 넣어둠. 아직 아무것도 없음.
		//int[] s = new int [크기] -> 배열을 가지고 올 수 있게 변수 설정
		//int[] s = new int [크기] -> 타입은 int[] : int로만든 배열이란 뜻
		//배열은 쓰레기값을 자동으로 처리해줌 즉, 배열은 자동초기화해줌
		int[] s = new int [10];
		double[] s2 = new double [5];
		//String[] s3 = new char [100];
		
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s3[0]);

		
		
	}

}
