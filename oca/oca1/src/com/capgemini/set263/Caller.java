package com.capgemini.set263;

public class Caller {
	private void init() {
		System.out.println("Initialized");
	}
	protected void start() {
		init();
		System.out.println("Started");
	}
}
