package com.capgemini.corrected;

public class Example23 {
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a<b) ?a :  (a<c) ? b : c;
		//int d = (a<b) ? (a<c) ? a : (b<c) ? b : c;
		System.out.println(d);
	}
}
