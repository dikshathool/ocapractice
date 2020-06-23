package com.capgemini.set2;

public class Q50 {
	int count;
	public static void displayMsg() {
		//Q50 s = new Q50();
		System.out.println("Welcome Visit Count "+count++);
	}
	public static void main(String[] args) {
		Q50.displayMsg();
		displayMsg();
	}
}
