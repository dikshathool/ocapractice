package com.capgemini.set2;

public class Q44 {
	String myStr = "9009";
	int myNum = 0;

	public void doStuff(String str) {
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.out.println("Error");
		}
		System.out.println("myStr: "+myStr+", myNum: "+myNum);
	}

	public static void main(String[] args) {
		Q44 obj = new Q44();
		obj.doStuff("7007");
	}
}
