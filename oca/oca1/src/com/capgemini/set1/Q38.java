package com.capgemini.set1;

public class Q38 {
	public static void main(String[] args) {
		int nums1[] = {1, 2, 3};
		int nums2[] = {1, 2, 3, 4, 5};
		nums2 = nums1;
		for (int x : nums2) {
			System.out.println(x+ ":");
		}
	}
}
