package 스레드;

public class 동시처리Main3 {

	public static void main(String[] args) {
		Image1 thread1 = new Image1();
		Count1 thread2 = new Count1();
		Timer1 thread3 = new Timer1();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
	}

}
