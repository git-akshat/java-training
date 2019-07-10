package com.cruds.demo;

public class Counter {
	
	public static int objCount;
	
	public Counter() {
		objCount++;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method Entered " + objCount);
		objCount--;
		System.out.println("Finalize method Exit " + objCount);
	}
	
}
