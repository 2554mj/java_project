package 배열복습;

public class 배열복습 {

	public static void main(String[] args) {
		// 배열을 만들때 값을 처음부터 알고 있는경우
		int[] num = { 100, 200, 300 }; // 4*4 + 8 byte 가 사용됨(총5개)
		// 위치값 index는 0부터 시작한다.
		num[1] = 500; // num 이 가르키고 있는 2번째 자리의 값을 500으로 변경
		// 값을 처음에 모르고 있다가 나중에 넣는경우

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {
			System.out.println(x);
		}
		int[] num2 = new int[3]; // {0,0,0} + length // 자동초기화가 됨!

		num2[0] = 1000;
		num2[num2.length - 1] = 2000;
		for (int x2 : num2) {
			System.out.println(x2);

		}

	}
}
