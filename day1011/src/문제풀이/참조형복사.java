package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		int[] x = {1,2,3};
		//int[] y = x;//참조형 복사 (얕은shallow복사 : 주소만 복사됨)
		int[] y = x.clone(); //참조형복사(깊은deep복사 : 배열안에 들어있는 값 자체를 복사)
		
		
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==원본 x값 수정후==");
		//역슬러시 피하는 문자 이스케입문자라고 부르고 \n=줄바꿈 \t=tap
		x[0] = 9;
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		//배열값이 복사되는 것이 아니라 배열의 주소만 복사되는 것 = 얕은복사
		
				
	

	}

}
