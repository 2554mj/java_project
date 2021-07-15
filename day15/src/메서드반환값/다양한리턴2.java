package 메서드반환값;

import java.util.Date;
import java.util.Random;

public class 다양한리턴2 {
	//메서드가 4개 필요함
	
	public int get(int x) { 
		return x + 100;
	}
	public double get() {
		return 11.11;
	}//위와 아래의 메서드명이 get으로 동일
	//위 : get(int x)
	//아래 : get() 소괄호안의 값이 있는지 없는지에 따라 형식이 동일한 메서드를 사용함!!
	public int[] get3() {
		int[] num = {10, 20, 30, 40, 50};
		return num;
	}
	public Random get4() {
		//Random r; => 초기화시켜주지 않으면 쓰레기값이 들어가 초기화해!
		//Random r = null; => 변수 r을 만들어서 넣을 공간만 만듬 
		//널포인트익셉션/반환값이 없어! 그러니까 이 부품이 만들어졌는지 안만들어졌는지 확인해!
		Random random = new Random();//=>부품을 만들어서 주소까지 넣어둔 상태
		return random;
	}
	}
