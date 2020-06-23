package com.capgemini.corrected.ex7;

public class Car extends Vehicle {
	String trans;
	
	Car(String trans) {
		this.trans = trans;
	}

	Car(String type, int maxSpeed) {
		super(type, maxSpeed);
		this(trans);
	}
}
