package 클래스생성;

public class 계산기 {
	//사칙연산계산기
	//여긴 메인이 없어서 f11이 실행되지 않음
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");
	}
	
	public void 더하기(int n1, int n2) {
		System.out.println("더하기 기능 처리 내용 구현");
		int result2 = n1 + n2 ;
		System.out.println("두 수의 더하기 결과는 " + result2);
	}
	public void 빼기() {
		System.out.println("빼기 기능 처리 내용 구현");
	}
	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리 내용 구현");
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 " + result);
	}
	public void 나누기(double no1, double no2) {
		System.out.println("나누기 기능 처리 내용 구현");
		double result3 = no1 / no2 ;
		System.out.println("두 수의 나누기 결과는 " + result3);
	}
}
