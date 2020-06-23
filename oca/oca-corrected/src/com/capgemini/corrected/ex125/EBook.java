package com.capgemini.corrected.ex125;

public class EBook extends Book {
	public void readBook() {
		System.out.println("Read E-Book");
	}
	
	public static void main(String[] args) {
		Book book1 = new EBook();
		book1.readBook();
		book1.download();
	}
}
