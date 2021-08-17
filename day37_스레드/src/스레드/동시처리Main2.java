package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		AtThread_연습 thread1 = new AtThread_연습();
		DollarThread_연습 thread2 = new DollarThread_연습();
		PercentThread_연습 thread3 = new PercentThread_연습();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
	}

}
