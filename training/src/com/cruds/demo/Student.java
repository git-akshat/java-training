package com.cruds.demo;

public class Student {
	
	private int rollNo;
	private String name;
	//private String lastName;
	private static int count; // to keep track of the number of object instance
	
//	static {
//		System.out.println("Static block 1");
//	}
	
	public Student() {
		rollNo = -1;
		name = null;
	}
	
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		//System.out.println("2 arg constructor");
		count++;
	}
	
	public Student(int rollNo, String name, String lastName) {
		this(rollNo, name);
		//this.lastName = lastName;
		count++;
		//System.out.println("3 arg constructor");
	}
	
	
	//access
	public int getRollNo() {
		return rollNo;
	}
	
	//mutant
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Student.count = count;
	}

//	static {
//		System.out.println("Static block 2");
//	}

	
	

}
