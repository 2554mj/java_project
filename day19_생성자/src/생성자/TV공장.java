package 생성자;

public class TV공장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TV tv1 = new TV("black", 100);
	TV tv2 = new TV("white", 200);
	
	System.out.println(tv1);//tv1꺼 color, price 초기화 되어서 자리가 만들어짐
	System.out.println(tv2);//tv2꺼 color, price 초기화 되어서 자리가 만들어짐
	//tv1.color="black"; => 이렇게 넣어주고 싶다면 
	//TV tv1 = new TV();소괄호 사이에 넣을 값을 입력하고 클래스에 메서드 만들기
	//public TV(String c, int p) {
	//	color = c;
	//	price = p;
	//}
	}
	

}
