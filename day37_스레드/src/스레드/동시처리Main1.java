package 스레드;

public class 동시처리Main1 {

	public static void main(String[] args) {
		//thread객체 생성
		동시프로그램1 thread1 = new 동시프로그램1();
		동시프로그램2 thread2 = new 동시프로그램2();
		
		//cpu에 thread를 등록해줘야함
		thread1.start();
		thread2.start();
		
		System.out.println("스레드 종료");
		
		//메인안에 스레드를 만들어주면 동시에 돌아가는 프로그램의 개수 : 3개

	}

}
