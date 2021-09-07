package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		Boy2 boy1 = Boy2.getInstance();
		Boy2 boy2 = Boy2.getInstance();
		
		System.out.println("싱글톤타입 주소 1: " + boy1);
		System.out.println("싱글톤타입 주소 2: " + boy2);
		
//		21.프로토타입과 싱글톤으로 객체 생성시 각각 생성된 객체수를 프린트해보세요.
//		Boy1객체 생성됨@@
//		Boy1객체 생성됨@@
//		프로토타입 주소 11 : com.mega.mvc07.test.Boy1@15db9742
//		프로토타입 주소 12 : com.mega.mvc07.test.Boy1@6d06d69c
//		
//		Boy2객체 생성됨@@
//		싱글톤타입 주소 1: com.mega.mvc07.test.Boy2@15db9742
//		싱글톤타입 주소 2: com.mega.mvc07.test.Boy2@15db9742
//		
//		22.서버프로그래밍시 프로토타입으로 객체를 계속 생성하면 어떤 일이 발생할 것 같은가요?
//		위의 예를 들어서 설명해주세요.
//		클라이언트가 계속 객체를 생성하면 램에 계속 저장공간이 생기게 되고, 서버가 과부화된다. 
//		
//		
//		23.서버프로그래밍시 DAO, Controller등과 같은 것은 싱글톤으로 객체를 계속 생성하고
//		DTO는 프로토타입으로 객체를 생성한다. 이 둘의 차이점이 무엇일까요?
//		DTO는 데이터의 값이 계속 바뀌기 때문에 
//		싱글톤사용 => 클래스 위에 @(어노테이션)다는 애들
		
		//싱글톤 => 클래스 단위
		//프로토 => 메서드 단위

	}

}
