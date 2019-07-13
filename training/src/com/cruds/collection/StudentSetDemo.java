package com.cruds.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class StudentSetDemo {
	
	public static void main(String[] args) {
		
		Set<Student> s= new TreeSet<>(new StudentComparator());

		//Set<Student> s= new TreeSet<>();
		
		try {
			s.add(new Student(101, "Anil"));
			s.add(new Student(311, "bill"));
			s.add(new Student(312, "dell"));

			s.add(new Student(311, "bill"));


		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Student stud : s)
		{
			System.out.println(stud);
		}
	}

}
