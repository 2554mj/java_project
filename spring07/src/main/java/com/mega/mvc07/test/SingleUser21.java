package com.mega.mvc07.test;

public class SingleUser21 {

	public static void main(String[] args) {
		
			SingleObject2 single2 = SingleObject2.getInstance(); 
		System.out.println("21주소: " + single2);
		System.out.println(SingleObject2.count + "개");
		System.out.println("싱글톤 사용으로 저장된 램의 용량 >>" + ((SingleObject2.count * 8) + 4));
		
	}

}
