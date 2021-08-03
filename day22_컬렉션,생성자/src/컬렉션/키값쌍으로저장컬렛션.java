package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렛션 {

	public static void main(String[] args) {
		//Map => 다른언어에서는 dictionaty라고 부르기도 함.
		
		HashMap dic = new HashMap();
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("메론", "melon");
		System.out.println(dic);//키(="사과")는 유니크(중복되면안됨) 밸류("apple")는 중복되도OK.
		//dic.clear();
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put("사과", "tkrhk");
		System.out.println(dic.get("사과"));
		dic.remove("바나나");
		System.out.println(dic);

	}

}
