package com.capgemini.set1;

import java.util.ArrayList;

public class Q23 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeExpetion");
		}catch(Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
}
