package 문제풀이;

import java.util.Date;

public class 시간구하기 {

	public static void main(String[] args) {
		// 문제)10시전 굿모닝
		// 문제)15시전 굿애프터눈
		// 문제)20시전 굿이브닝
		// 문제)나머지 굿나잇
		
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour<10) {
			System.out.println("굿모닝");
		}else if (hour<15) {
			System.out.println("굿애프터눈");
		}else if (hour<20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
		// 문제)토/일이면 쉬어요
		// 문제)나머지요일 달려요
		int day = date.getDay();
		 
		if (day==0) {
			System.out.println("쉬어요");
		}else if (day==1) {
			System.out.println("달려요");
		}else if (day==2) {
			System.out.println("달려요");
		}else if (day==3) {
			System.out.println("달려요");
		}else if (day==4) {
			System.out.println("달려요");
		}else if (day==5) {
			System.out.println("달려요");
		}else if (day==6) {
			System.out.println("쉬어요");
		}
		
		// 문제)3월~5월 봄
		// 문제)6월~8월 여름
		// 문제)9월~11월 가을
		// 문제)나머지 겨울
		int month = date.getMonth()+1;
		 
		if (month==3) {
			System.out.println("봄");
		}else if (month==4) {
			System.out.println("봄");
		}else if (month==5) {
			System.out.println("봄");
		}else if (month==6) {
			System.out.println("여름");
		}else if (month==7) {
			System.out.println("여름");
		}else if (month==8) {
			System.out.println("여름");
		}else if (month==9) {
			System.out.println("가을");
		}else if (month==10) {
			System.out.println("가을");
		}else if (month==11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
  }//main
}//class