package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		//++ -- => 증감연산자
		for (int i = 500; i >= 0; i = i-2) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);}
			 catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
  }
}

