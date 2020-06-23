package com.capgemini.set1;

public class Q28 {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}
	public static void main(String[] args) {
		Q28 ex = new Q28();
		int cardNo = 12344;
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
	}
}
