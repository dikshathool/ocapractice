package com.capgemini.set2;

public class Q71 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("java");
		//if (str2.equals(str1.toLowerCase())) {
		str1 = str1.toLowerCase();
		if (str1.contentEquals(str2) ) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
