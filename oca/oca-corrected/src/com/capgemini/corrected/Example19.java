package com.capgemini.corrected;

public class Example19 {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) {
		Example19 ex = new Example19();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
	}
}
