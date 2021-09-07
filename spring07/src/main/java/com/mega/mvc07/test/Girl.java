package com.mega.mvc07.test;

public class Girl {
	
	String name;
	int age;
	static int ageTotal;
	static int count;

	public Girl(String name, int age){
	  this.name = name;
	  this.age = age;
	  ageTotal += age;
	  count++;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

}
