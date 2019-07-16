package com.cruds.jdbc;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;
import com.cruds.jdbc.StudentDAO;

import java.util.List;
import java.util.Scanner;
public class TestStudentDAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int roll;
		String name;
		Student student;
		StudentDAO dao = new StudentDAO();

		while(true) {
			System.out.println("\n1.Add student\n2.Search student by roll no\n3.Search student by name");
			System.out.println("4.List all students\n5.Delete student");
			System.out.println("6.Update name");
			System.out.println("7.Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.print("Enter rollNo : ");
					roll = sc.nextInt();

					
					System.out.print("Enter name : ");
					name = sc.next();

					try {
						if(dao.create(new Student(roll, name)))
						{
							System.out.println("Student created successfully");
						}
					} catch (StudentException e) {
						e.printStackTrace();
					}
					break;
			
			
			case 2: System.out.print("\nEnter Roll No: ");
					roll = sc.nextInt();
					student = dao.getByRollNo(roll);
					System.out.println(student.toString());
					break;
			
			case 3: System.out.print("\nEnter Name: ");
					name = sc.next();
					student = dao.getByName(name);
					System.out.println(student.toString());
					break;
			
			case 4: List<Student> slist = dao.getAllStudent();
					for(Student s : slist)
					{
						System.out.println(s.toString());
					}
					break;
					
			case 5: System.out.print("\nEnter Roll No: ");
					roll = sc.nextInt();
					if(dao.deleteByRollNo(roll))
					{
						System.out.println("Deleted Successfully");
					}
					break;
					
			case 6: System.out.print("\nEnter Roll No: ");
					roll = sc.nextInt();
					
					
					System.out.print("Enter name : ");
					name = sc.next();
					
					if(dao.updateName(roll, name))
					{
						System.out.println("Updated Successfully");
					}
					break;
			
			case 7: System.exit(0);
			}
			
		}





		
	}

}
