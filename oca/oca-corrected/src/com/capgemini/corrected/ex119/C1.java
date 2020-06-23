package com.capgemini.corrected.ex119;

public class C1 extends C2 implements I {
	public void displayI() {
		System.out.println("C1");
	}
	
	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		
		C2 s = obj2; //cannot convert from I to C2 (add cast C2)
		I t = obj1; //cannot convert from C2 to I
		
		t.displayI();
		s.displayC2();
	}
}
