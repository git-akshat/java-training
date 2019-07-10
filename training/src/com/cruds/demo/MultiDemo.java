package com.cruds.demo;


public class MultiDemo {

	public static void main(String[] args) {

		printSallary(new Director(100, "Ravi"));
		
	}
	
	private static void printSallary(Object obj) {
		if(obj instanceof Director) {
			System.out.println("Salary is 1 lakh");
		}
		else if(obj instanceof Manager) {
			System.out.println("Salary is 50K");
		}
		else if(obj instanceof Employee) {
			System.out.println("Salary is 10K");
		}
	}

}
