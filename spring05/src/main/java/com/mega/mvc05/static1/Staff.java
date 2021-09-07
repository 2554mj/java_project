package com.mega.mvc05.static1;

public class Staff {
	String name;
	String gender;
	int age;
	static int no;
	static int sumAge;
	
	public Staff(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		no++;
		sumAge += age;
	}



	@Override
	public String toString() {
		return "Staff [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	

}
