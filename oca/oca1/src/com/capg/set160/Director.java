package com.capg.set160;

public class Director extends Manager {
	public int stockOption;
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		
		director.salary = 80_000;
		//director.stockOption = 1_000;
		employee.salary = 50_000;
		//employee.budget = 200_000;
		//manager.budget = 1_000_000;
		//manager.stockOption = 500;
		
	}
}
