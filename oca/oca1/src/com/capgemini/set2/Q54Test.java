package com.capgemini.set2;

import java.util.ArrayList;
import java.util.List;

public class Q54Test {
	public static void main(String[] args) {
		List ps = new ArrayList();
		Q54 p2 = new Q54("Mike");
		ps.add(p2);
//		Q54 p = new Q54("Mike");
//		ps.add(p);
//		int f = ps.indexOf(p);
		int f = ps.indexOf(p2);
		if (f >= 0) {
			System.out.println("Mike Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
