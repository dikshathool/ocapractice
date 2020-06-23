package com.capgemini.corrected;

public class Example118 {
	public static int stVar = 100;
	public int var = 200;
	public String toString() {
		return var+ ": "+stVar;
	}
	
	public static void main(String[] args) {
		Example118 t1 = new Example118();
		t1.var = 300;
		System.out.println(t1);
		
		Example118 t2 = new Example118();
		t2.stVar = 300;
		System.out.println(t2);
	}
}
