package 스레드;
import java.lang.*;//묵시적 import
import java.util.Iterator;

public class 동시프로그램1 extends Thread {
	//String, System, Thread, Inteager 처럼 자주 사용하는 부품 => 묵시적 import 
	//Thread의 내용을 보고싶다면 Thread위에서 ctrl+클릭
	//Thread->Runnable
	//부모클래스를 상속받은 자식클래스에서 입력값을 바꿔서 메서드를 사용하고 싶다 => 오버라이드 사용!!
	//run을 오버라이드 해주자
	//abstract=추상적
	//public abstract void run(); => 추상메서드
	
	@Override
	//run메서드를 오버라이드해서 구현해주면, run메서드 내의 구현부분이 동시에 처리가 된다.
	   public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시1>> "+ i);
		}
	}
	

	

}
