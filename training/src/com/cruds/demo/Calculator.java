package com.cruds.demo;

public class Calculator {
	
	public int divide(int x, int y) {
		
		int result = 0;
		int[] num = new int[3];
		Student s = null;
		
		System.out.println("Before division");
		
		try {
			s.getName();
			num[3] = 90;
			result = x/y;
			System.out.println("After division");
		}catch(ArithmeticException ae) {
			System.out.println("Invalid divisor!");
		}
		finally {
			System.out.println("Finally block");
			s.getRollNo(); // error
			System.out.println("This line won't get printed and is handled by main's try catch block");
		}
		return result;
	}

}
