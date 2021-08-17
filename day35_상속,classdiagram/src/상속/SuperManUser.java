package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();//Syntax error on token "super", delete this token 
		//=> 예약어 이미 프로그램에서 명령어로 사용중이므로 변수명이나 메서드명으로 사용불가
		//super class = parent class
		//sub class
		sMan.name = "클라크";
		sMan.age = 1000;
		sMan.power = 3000;
		sMan.fly = true;
		
		System.out.println(sMan);
		
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();
	}

}
