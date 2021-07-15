package 메서드반환값;

public class 계산기 {
//	성질 : 멤버변수
//	동작 : 멤버메서드(이게중요!)
//	cal.add(100, 200)
//	기능정의, 함수정의, 메서드 정의
//	x,y는 add에서만 사용가능 => 지역변수
//	메서드를 사용하는 것 = 메서드를 호출, call 한다 ( 메서드를 호출하지않으면 변수는 생기지도 않음)
//	즉, 메서드 안에서 값을 전달할 목적으로 생성되는 변수 = 매개변수 (여기선 int x , int y )
//	매개변수 = parameter(파라메터)는 아래의 지역변수와 차이가 있음 
//	데이터분석에서는 파라메터가 입력값의 개념으로 사용됨
//  void : 없다라는 의미, 반환값이 없다.
	
//	public static void main(String[] args) {
//		int x = 100;
//		int y = 100;}
//		main안에서만 생존할 수 있는 지역변수로 매개변수는 아님
	
	
	public int add(int x , int y) {
		int result = x + y;
		System.out.println("두 수의 더한 값은" + result);
		return result;
		//void와 return은 같이 올 수 없음 -> return의 데이터타입을 void자리에 써줘야함
		
	}

}
