package com.capgemini.set1;

import java.time.LocalDate;

public class Q59 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 1, 30);
		date = date.plusDays(10);
		System.out.println(date);
	}
}
