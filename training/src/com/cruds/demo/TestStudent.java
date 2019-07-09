package com.cruds.demo;

public class TestStudent {
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Akshat");
		
//		s1.setRollNo(2);
//		s1.setName("Rave");
		
		System.out.print(s1.getRollNo());
		System.out.println(s1.getName());
		
		Student s2 = new Student(2, "Ravi", "sharma");
		
		System.out.print(s2.getRollNo());
		System.out.println(s2.getName());
		
		//System.out.println(s1.getCount());
		
		
	}
	
	

}
