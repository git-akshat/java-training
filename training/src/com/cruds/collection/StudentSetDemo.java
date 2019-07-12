package com.cruds.collection;

import java.util.Set;
import java.util.TreeSet;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class StudentSetDemo {
	
	public static void main(String[] args) {
		
		Set<Student> s= new TreeSet<>(new StudentNameComparator());
		
		try {
			s.add(new Student(101, "Anil"));
			s.add(new Student(211, "tom"));
			s.add(new Student(311, "bill"));
			s.add(new Student(312, "bill"));


		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Student stud : s)
		{
			System.out.println(stud.getName() + " " + stud.getRollNo());
		}
	}

}
