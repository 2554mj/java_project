package 컬렉션;

import java.util.HashSet;

public class 중복없는컬렉션 {

	public static void main(String[] args) {
		//=>set
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag);
		//인덱스를 쓰지않음. 순서를 가지지 않음.
		for (Object object : bag) {
			System.out.println(object);
			
		}

	}

}
