package com.capg.set164;

public class EBook extends Book {
	public void readBook() {
		System.out.println("Read Ebook");
	}
	public static void main(String[] args) {
		Book book1 = new EBook();
		book1.readBook();
	}
}
