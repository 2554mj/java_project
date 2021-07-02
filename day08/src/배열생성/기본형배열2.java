package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
    // type name = new type();
	// int[] : int배열을 가르키는 주소가 들어간다는 의미
	// s     : 힙 영역에 할당 된 저장공간의 주소
	// =     : 힙 영역에 할당 된 저장공간의 주소를 변수에 넣는다
	// new   : 힙 영역에 지정된 타입의 크기만큼 배열을 만들어라
	// int[10]: 배열로 만들어질 타입과 크기를 설정
	 	
		int[] s = new int [10];
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}//배열 자동초기화 되었는지 확인
		System.out.println();		
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
			System.out.print(s[i]);
		}//배열안에 1,2,3..넣어줌
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	

		
		
	}

}
