package com.capgemini.set1;

public class Q54 {
	public static void main(String[] args) {
		Q54 ts = new Q54();
		System.out.println(isAvailable+" ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = true;
}
