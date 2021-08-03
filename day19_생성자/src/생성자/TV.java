package 생성자;

public class TV {
	String color;
	int price;
	
	//클래스 이름과 동일한 메서드를 생성자라고 부름
	//파라메터(입력값)없는 생성자는 기본생성자
	//기본 생성자는 자동으로 만들어진다. 
	//묵시적으로 생성됨, 생성자는 리턴이 없으므로 리턴을 명시하지 않음
	//public TV() {
		//객체생성할 때 마다 무엇을 하고싶은 경우, 
		//클래스이름과 동일한 이름을 가진 메서드를 만들어주면 자동호출되어 객체생성할 때 마다
		//특정한 기능을 처리하게 할 수 있다.
	//	System.out.println("객체 하나 만들어짐");
	//}
	
	//메서드이름을 동일하게 쓸수있음, ()소괄호안의 입력값에 따라 해당하는 메서드를 찾아서 적용됨
	public TV(String c, int p) {
		color = c;
		price = p;
	}
	
	public String toString() {
		return color + ", " + price;
	}

}
