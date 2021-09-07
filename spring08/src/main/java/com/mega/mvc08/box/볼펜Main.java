package com.mega.mvc08.box;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		pen.company = "모나미";
		pen.price = 1000;
		pen.thick = 0.7;
		
		System.out.println(pen);
		pen.buy();
		pen.write();
	
		

	}

}
