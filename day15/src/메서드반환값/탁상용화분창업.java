package 메서드반환값;

public class 탁상용화분창업 {
	
	public static void main(String[] args) {
		int 화분_price = 10000;
		int 삽_price = 5000;
		//두 개의 합을 구해보자.
		
		계산기 cal = new 계산기();
		int result1 = cal.add(화분_price, 삽_price);

		
		int 물조리개_price = 3000;
		int 식물_price = 9000;
		int result2 = cal.add(물조리개_price, 식물_price);
		
		//계산기가 main메서드에게 더한 결과값을 반환하다.
		int result3 = cal.add(result1, result2);
		System.out.println("최종 결제금액은 " + result3 ); 
		//처리한 결과를 호출한 곳에 그 값을 가져와서 사용하고 싶을 때 리턴을 사용함
		
	}

}
