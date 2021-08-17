package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame {
	
	//static 객체생성(new)하지 않아도 cpu가 바로 호출 할 수 있음! 메인은 항상 static!
	//멤버변수가 있으면, static메서드에서 바로 사용 불가능...
	//=>(해결책)멤버변수에도 static을 붙여주면, 객체생성하지 않아도 static메서드안에서 접근 가능!!
	//static은 RAM에 상주하고 있어서 언제든지 CPU가 접근해서 사용가능!!
	//static을 많이 사용하면 안돼!!!!!!!!!!!!!!!! 메모리 폭발>0< ->우리는 cpu, ram사용을 최소화해야함
	//그래서 사실은 메인안에 뭘 많이 만들지 않음. 이 코드가 훨씬 좋음!! 
	
	//=>(방법1 : 일반메서드)main밖에 static없이 만들어서 메인에서 객체생성을 해서 사용함.
	/*
	 * public void start() {
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { ThreadGraphic1 s= new
	 * ThreadGraphic1(); s.start();
	 * 
	 * }
	 */
	
	//=>(방법2 : 생성자)생성자 이용하는 코드
	
	
	//접근이 가능하도록 전역변수로 선언!! 
	JLabel count, image, timer;

	public ThreadGraphic1() {
		setSize(1300, 500);
		setTitle("나의 스레드 프로그램");
		
		
		count = new JLabel("카운트 들어가는 부분");
		image = new JLabel("");
		timer = new JLabel("타이머 들어가는 부분");
		
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		
		Font font = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("바탕체", Font.BOLD, 35);
		count.setFont(font);
		timer.setFont(font2);
		
		Image1 thread1 = new Image1();
		Count1 thread2 = new Count1();
		Timer1 thread3 = new Timer1();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		setVisible(true);
		
	}
	
	//클래스간 변수를 공유할 목적으로 클래스내에 클래스를 끼워넣을 수 있음.
	//내부 클래스(inner class, 이너클래스)
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	public class Count2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i >= 0; i = i - 2) {
				count.setText("count>>" + i);
				try {
					Thread.sleep(500); //밀리세컨즈(1/1000초)
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}

	
	/*
	 * public class Image2 extends Thread {
	 * 
	 * @Override public void run() { String[] list = { "1.jpg", "2.jpg", "3.jpg",
	 * "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg" }; for (int i
	 * = 0; i < list.length; i++) { ImageIcon icon = new ImageIcon(list[i]);
	 * image.setIcon(icon); //image.setText(list[i]); try { Thread.sleep(5000);
	 * //밀리세컨즈(1/1000초) } catch (InterruptedException e) { e.printStackTrace(); } }
	 * } }
	 */

	
	
		
	public static void main(String[] args) { 
		ThreadGraphic1 s= new ThreadGraphic1(); 
   }
}


