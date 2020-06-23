package com.capgemini.set1;

public class Q3 {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50};
		int x = array.length;
		
		while (x >= 0) {
			System.out.println(array[--x]);
		}
		
//		do {
//			System.out.println(array[x]);
//			x--;
//		} while (x >= 0);
	}
}
