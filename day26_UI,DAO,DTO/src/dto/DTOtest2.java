package dto;

public class DTOtest2 {
	public static void main(String[] args) {
	회원Bag bag = new 회원Bag();
		bag.setId("hello!");
		bag.setPw("hello!");
		bag.setName("hello!");
		bag.setTel("hello!");
		System.out.println(bag);
	
		회원Bag bag2 = new 회원Bag();
		bag2.setId("bye~");
		bag2.setPw("bye~");
		bag2.setName("bye~");
		bag2.setTel("bye~");
		System.out.println(bag2);
		
	}
}
