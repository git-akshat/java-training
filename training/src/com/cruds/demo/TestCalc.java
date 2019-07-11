package com.cruds.demo;

public class TestCalc {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int result = 0;
		try {
			result = c.divide(10, 0);
		}catch(RuntimeException re){
			System.out.println(re.getMessage());
		}
		finally {
			System.out.println("In main's finally");
		}
		
		System.out.println("The result is " + result);
		
		
	}

}
