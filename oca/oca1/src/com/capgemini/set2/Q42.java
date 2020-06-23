package com.capgemini.set2;

public class Q42 {
	public static void main(String[] args) {
		String[] strs = {"A", "B" };
		int idx = 0;
		for (String s : strs) {
			String j = strs[idx].concat("Elements "+idx);
			System.out.println(j);
			idx++;
		}
		for(idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
