package com.capgemini.set2;

public class Q6 {
	private char var;
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		Q6 obj1 = new Q6();
		Q6 obj2 = obj1;
		obj1.var = 'o';
		obj2.var = 'i';
		System.out.println(var1 + " "+var2);
		System.out.println(obj1.var+", "+obj2.var);
	}
}
