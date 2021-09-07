package com.mega.mvc08.box;



public class 볼펜 extends 학용품{
	double thick;
	
	public void write() {
		System.out.println("글을 써요!");
	}

	@Override
	public String toString() {
		return "볼펜 [thick=" + thick + ", price=" + price + ", company=" + company + "]";
	}
	

	
	

}
