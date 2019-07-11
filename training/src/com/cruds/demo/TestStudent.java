package com.cruds.demo;

import com.crud.exception.StudentException;

public class TestStudent {
	
	
	
	public static void main(String[] args) {
		
		Student s1 = null;
		Student s2 = null;
		try {
			s1 = new Student(10, "");
			System.out.print(s1.getRollNo());
			System.out.println(s1.getName());
		
			s2 = new Student(-2, "Ravi", "sharma");
			System.out.print(s2.getRollNo());
			System.out.println(s2.getName());
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getDetails());
		}
		
//		s1.setRollNo(2);
//		s1.setName("Rave");
		
		
		//System.out.println(s1.getCount());
		
		
	}
	
	

}
