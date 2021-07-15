package 메서드반환값;

import java.util.Date;

public class 다양한리턴 {
	//객체 리턴되면 완전히 다른세상
	public int add() { //double, float, long => int자리에 다 가능 .0이 같이나옴
		return 100;
	}
	public double add2() {//float
		return 11.11;
	}
	public char add3() {
		return 'a';
	}
	public boolean add4() {
		boolean result = true;
		return result;
	}
	public String add5() {
		return "OK";
	}
	public Date add6() {
		Date date = new Date();
		return date;
	}
	public int[] add7() {
		int[] num = {1,2,3};
		return num;
	}
	public 계산기 add8() {
		계산기 cal = new 계산기();
		return cal;
	}
}
