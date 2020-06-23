package com.capgemini.corrected;

public class StringCompare {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		System.out.println(sb.toString());
		System.out.println(s.toString());
		
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
	}
}