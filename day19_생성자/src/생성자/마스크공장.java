package 생성자;

public class 마스크공장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		마스크 m1 = new 마스크("white", 2500);
		마스크 m2 = new 마스크("brwon", 3000);
		System.out.println(m1);
		System.out.println(m2);

		m1.color = "white";
		m1.price = 2500;

		m2.color = "brwon";
		m2.price = 3000;

		System.out.println(m1.color);
		System.out.println(m1.price);
		System.out.println(m2.color);
		System.out.println(m2.price);
		//각 변수의 주소값이 아닌 실제 값을 보고 싶다!
		//위의 4줄을 쓰면 됨.이 과정을 매번 다해주기 어려움=> 마스크 파일에 toString사용
		System.out.println(m1);
		System.out.println(m1);
	}

}
