package com.capgemini.set2;

public class Q73 {
	int i;
	static int j;
	public static void main(String[] args) {
		Q73 x1 = new Q73();
		Q73 x2 = new Q73();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		
		System.out.println(
				x1.i+" "+
				x1.j+" "+
				x2.i+" "+
				x2.j);
	}
}
