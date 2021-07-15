package 메서드반환값;

import java.util.Date;

public class 다양한반환값사용 {

	public static void main(String[] args) {
		다양한리턴 r = new 다양한리턴();
		int result1 = r.add();
		double result2 = r.add2();
		char result3 = r.add3();
		boolean result4 = r.add4();
		String result5 = r.add5();
		//**Date date = new Date(); 이렇게 만들필요X 다양한리턴에서 만들어진 값을 넘겨주므로
		//**여기서 또 만들필요 없음
		Date result6 = r.add6();
		System.out.println(result6);
		int[] result7 = r.add7();
		for (int x : result7) {
			System.out.print(x + " ");
		}
		계산기 result8 = r.add8();
		result8.add(200, 100);
		

	}

}
