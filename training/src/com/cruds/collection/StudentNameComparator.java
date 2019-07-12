package com.cruds.collection;

import java.util.Comparator;

import com.cruds.demo.Student;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
