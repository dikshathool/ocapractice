package com.capgemini.corrected;

public class Example93Test {
	public static void main(String[] args) {
		Example93 e1 = new Example93();
		Example93 e2 = new Example93("Jack", 50);
		Example93 e3 = new Example93("Chloe", 40, 5000);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}
}
