package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);
		}
		// 1.수능 만점자는 몇 명일까요?
		// 2.만점자 번호는 몇 번?
		int man = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				man++;
				System.out.println("만점자> " + i);
			}

		}
		System.out.println("만점자는 " + man + "명");

//		int man = 0;

//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331);
//			if (jumsu[i] == 330) {
//				man++;
//				System.out.println("만점자> " + i);	
//			}
//			
//		}
//		System.out.println("만점자는 " + man + "명");

	}
}
