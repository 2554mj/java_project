package com.mega.mvc07.test;

public class SingleUser2 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			//SingleObject2 single = new SingleObject2();
			SingleObject2 single2 = SingleObject2.getInstance(); 
		}
		System.out.println(SingleObject2.count + "개");
		System.out.println("싱글톤 사용으로 저장된 램의 용량 >>" + ((SingleObject2.count * 8) + 4));
        //싱글톤, 프로토 : 메서드단위? 클래스 단위?? => 클래스 단위
		
	}

}
