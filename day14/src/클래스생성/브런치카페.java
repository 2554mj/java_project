package 클래스생성;

public class 브런치카페 {

	public static void main(String[] args) {
		int coffePrice = 3500;
		int coffeCount = 5;
		
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		계산기 cal = new 계산기();
		cal.곱하기(coffePrice, coffeCount);
		cal.곱하기(bagelPrice, bagelCount);

		//커피와 베이글을 주문해보세요.
		cal.order("커피");
		cal.order("베이글");
		
		cal.더하기(1000, 2000);
		cal.나누기(55.5, 11.2);
		

	}

}
