package 알고리즘입문;

import java.util.ArrayList;
import java.util.HashSet;

public class 배열셋리스트_문제 {

	public static void main(String[] args) {
		// 1.동계 올림픽 피겨 순위
		// 1위:김연아 2위:김영아 3위:김양아 4위:김용아 4위가 반칙을 하여 탈락 전체 명단을 다시 프린트
//		String s = "김연아,김영아,김양아,김용아";
//		String[] s2 = s.split(",");
//		for (int i = 0; i < s2.length; i++) {
//			System.out.println(s2[i]);
//		}
		//배열은 크기변경 불가!!
		
		ArrayList list = new ArrayList();
		list.add("1위 : 김연아");
		list.add("2위 : 김영아");
		list.add("3위 : 김양아");
		list.add("4위 : 김용아");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		System.out.println("==========");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
		System.out.println("========== >> 가방");
		
		// 2. 아침에 가방에 넣은 물건들
		// 하나씩만 넣으려고 함. 같은 물건은 들어가지 않음. 실제로 내가 넣은 것 : 휴지,휴대폰,볼펜,휴지
		// 내 가방에 들어간 물건의 개수와 물건들을 쓰시오.
		HashSet set = new HashSet();
		set.add("휴지");
		set.add("휴대폰");
		set.add("볼펜");
		set.add("휴지");

		System.out.println("가방에 들어간 물건의 개수 > " + set.size());
		System.out.println("가방에 들어간 물건 > " + set);

	}

}
