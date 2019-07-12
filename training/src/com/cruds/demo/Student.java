package com.cruds.demo;

import java.io.Serializable;

import com.cruds.exception.StudentException;

public class Student implements Serializable, Comparable<Student>{
	
	private int rollNo;
	private transient String name;
	//private String lastName;
	private static int count; // to keep track of the number of object instance
	
//	static {
//		System.out.println("Static block 1");
//	}
	
	public Student() {
		rollNo = 0;
		name = null;
	}
	
	
	public Student(int rollNo, String name) throws StudentException{
		if(rollNo < 0) {
			throw new StudentException("Roll number cannot be negative " + rollNo);
		}
		
		if(name != null & name.equals("")) {
			throw new StudentException("Name cannot be empty");
		}
		this.rollNo = rollNo;
		this.name = name;
		//System.out.println("2 arg constructor");
		count++;
	}
	
	public Student(int rollNo, String name, String lastName) throws StudentException{
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


	@Override
	public int compareTo(Student o) {
		return rollNo - o.getRollNo();
	}

//	static {
//		System.out.println("Static block 2");
//	}

	
	

}
