package shop.dto;

public class DTOtest {

	public static void main(String[] args) {
		회원Bag bag = new 회원Bag();
		//new 할때 램의 힙영역에 값이 들어갈 공간이 만들어짐
//		bag.id = "apple";
//		bag.pw = "apple";
//		bag.name = "apple";
//		bag.tel = "apple";
		bag.setId("apple");
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);
		
		회원Bag bag2 = new 회원Bag();
//		bag.id = "melon";
//		bag.pw = "melon";
//		bag.name = "melon";
//		bag.tel = "melon";
		bag.setId("melon");
		bag.setPw("melon");
		bag.setName("melon");
		bag.setTel("melon");
		System.out.println(bag2);
	}

}
