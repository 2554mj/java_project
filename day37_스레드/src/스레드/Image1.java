package 스레드;

public class Image1 extends Thread {
	@Override
	public void run() {
		String[] list= {"1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png","10.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(1000);}//()안에 sleep을 적용할 시간을 적음=>1초를 재워라=1000(밀리세컨즈)
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			//Thread.sleep(1000);
			//위 코드 작성시,자바프로그램을 벗어나서 cpu한테 일을 시키면 위험하다고 인식 뜨는 에러 => try/catch
			
		}
		

	}

}
}
