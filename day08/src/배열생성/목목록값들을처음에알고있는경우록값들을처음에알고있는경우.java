package 배열생성;

public class 목목록값들을처음에알고있는경우록값들을처음에알고있는경우 {

	public static void main(String[] args) {
		// 배열을 만들때는 처음부터 값들을 알고있는 경우/모르는경우로 나누어짐
		String[] names = {"홍길동","홍ㅂㅂ","홍ㅇㅇ","홍ㅁㅁ","홍ㄱㄱ"};
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		} System.out.println(" ");
		for (String s : names) {
			System.out.print(s);
		}System.out.println(" ");
				
		int[] ages = {100,88,55,10,4};
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		} 
		for (int x : ages) {
			System.out.println(x);
		}//foreach문에서 for(int i: 배열)의 i는 인덱스의 i가 아니라 정수int의 i임.
		System.out.println(" ");
		
		double[] eyes = {2.0, 1.5, 1.7, 1.4, 0.8};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}
		
		char[] gen = {'남','여','남','여','여'};
		for (int i = 0; i < gen.length; i++) {
			System.out.println(gen[i]);
		}
		for (char c : gen) {
			System.out.println(c);
		}
		boolean[] food = {true, true, false, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (boolean b : food) {
			System.out.println(b);
	}
 
    }
  }
