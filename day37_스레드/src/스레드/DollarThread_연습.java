package 스레드;
import java.lang.*;//묵시적 import
import java.util.Iterator;

public class DollarThread_연습 extends Thread {
	
	@Override
	   public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시2>> " + "$");
		}
	}
}
