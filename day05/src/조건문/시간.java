package 조건문;

import java.util.Date;

public class 시간 {

	public static void main(String[] args) {
		//25년 Date(util에 있는 애로 쓰기)
		//이클립스는 최신의 부품을 선호함
		//가운데 줄쳐진거는 deprecated = 없어질거야,사장될거야 오래되어서 그런것
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초");

		
		int year = date.getYear() + 1900;
		//기준이 1900년이였음, 이후의 부품들은 숫자를 더하지않아도됨.
		int month = date.getMonth() + 1;
		//달은 음력으로 나와서 +1을 해줘야함
		int today = date.getDate();
		int day = date.getDay();
		System.out.println(year + "년" + month + "월" + today + "일"); 
		if (day==0) {
			System.out.println("일요일");
		}else if (day==1) {
			System.out.println("월요일");
		}else if (day==2) {
			System.out.println("화요일");
		}else if (day==3) {
			System.out.println("수요일");
		}else if (day==4) {
			System.out.println("목요일");
		}else if (day==5) {
			System.out.println("금요일");
		}else if (day==6) {
			System.out.println("토요일");
		}
	
		
		
	}

}
