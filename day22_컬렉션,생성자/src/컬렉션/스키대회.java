package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class 스키대회 {

	public static void main(String[] args) {
		// 3.스키대회에서 1등이 박스키, 2등이 송스키, 3등이 김스키, 4등이 정스키, 2등이 반칙하여 탈락함.
		// 스키대회 시상자 목록을 프린트!
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		// System.out.println(ski);
		ski.remove(1);
		for (int i = 0; i < ski.size(); i++) {
			System.out.print((i + 1) + "등:" + ski.get(i) + " ");
		}
		for (Object o : ski) { // o는 변수임
			// System.out.print(o);
		}

		// 1.팀을 구성하려고 합니다. 한 명씩만 필요하고 디자이너, 프로그래머, DB관리자, 팀원 목록을 프린트!
		// =>Set
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("팀원");
		// System.out.println(team);
		for (Object object : team) {
			System.out.print(object);
		}

		// 2.냉장고에 어제, 오늘 우유를 사다 놓았음. 어제 우유이름은 상한우유, 오늘 우유이름은 싱싱우유.
		// 어제의 우유를 먼저 먹음. 현재남은 우유 이름을 프린트! => Queue
		LinkedList refri = new LinkedList();
		refri.add("상한우유");
		refri.add("싱싱우유");
		for (int i = 0; i < refri.size(); i++) {
			refri.remove();
			System.out.println(refri);
		}

		// 4.휴대폰 단축키 1번은 엄마, 2번은 아빠, 3번은 친구, 4번은 동생
		// 휴대폰 2번은 누구? 프린트 => Map
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		System.out.println(phone.get(2));
	}
}