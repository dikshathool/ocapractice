package com.capgemini.set2;

public class Q75 {
	public static void main(String[] args) {
		int n[][] = {{1,3}, {2,4}};
		System.out.println(n.length);
		for (int i = n.length - 1; i >= 0; i--) {
			for (int j = n[i].length - 1; j >= 0; j--) {
				System.out.println(n[i][j]);
			}
		}
	}
}
