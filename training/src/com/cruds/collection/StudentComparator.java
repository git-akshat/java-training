package com.cruds.collection;

import java.util.Comparator;

import com.cruds.demo.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int rollDiff = o1.getRollNo() - o2.getRollNo();
		if(rollDiff != 0) {
			return rollDiff;
		}
		else {
			int nameDiff = o1.getName().compareTo(o2.getName());
			return nameDiff;
		}
		
	}

	
	

}
