package com.capgemini.corrected;

public class Example101 {
	String name;
	int age = 25;
	
	public Example101(String name) {
		this(); //there is no constructor without arguments
		setName(name);
	}
	
	public Example101(String name, int age) {
		// use this(name) or create object and then call
		Example101(name); // we cannot called constructor directly
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
		return name+" "+age;
	}
	public static void main(String[] args) {
		Example101 p1 = new Example101("Jesse");
		Example101 p2 = new Example101("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
