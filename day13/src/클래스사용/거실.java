package 클래스사용;

import 클래스생성.Car;
import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.volum();
		phone.screen();
		
		phone.color = "회색";
		phone.number = 5027;
		System.out.println(phone.color);
		System.out.println(phone.number);
		
		Dog dal = new Dog();
		dal.bark();
		dal.run();
		
		dal.color = "brown";
		dal.size = "5kg";
		System.out.println(dal.color);
		System.out.println(dal.size);

	}

}
