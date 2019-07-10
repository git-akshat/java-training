package com.cruds.demo;

public class TestCounter {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println(Counter.objCount);
		
		c1 = null;
		c2 = null;
		
		
		
		//System.gc();
		
	}

}
