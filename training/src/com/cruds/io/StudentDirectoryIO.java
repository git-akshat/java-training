package com.cruds.io;

import java.util.Scanner;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class StudentDirectoryIO {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int count = 0;
		int rollno;
		String name;
		
		Student[] student = new Student[25];
		
		while(true) {
			System.out.println("1.Add student\n2.Search student by roll no\n3.Search student by name\n4.List all students\n5.Delete student\n6.Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1:	if(count == 25) {
						System.out.println("Memory full! Can't add more students.");
					}
					else {
						System.out.print("\nEnter Roll No: ");
						rollno = sc.nextInt();
						//student[count].setRollNo(rollno);
						
						System.out.print("Enter Name: ");
						name = sc.next();
						//student[count].setName(name);
						try {
							student[count] = new Student(rollno, name);
						} catch (StudentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.out.println("\nStudent record added.");
						
						count++;
					}
					break;
					
			case 2: System.out.print("\nEnter Roll No: ");
					rollno = sc.nextInt();
					boolean flag = false;
					
					for(int i=0; i<count; i++) {
						if(student[i].getRollNo() == rollno) {
							flag = true;
							System.out.println("Student name : " + student[i].getName());
							break;
						}
					}
					
					if(flag == false) {
						System.out.println("\nStudent record not found.");
					}
					break;
					
			case 3: System.out.print("\nEnter Name: ");
					name = sc.next();
					boolean flag2 = false;
			
					for(int i=0; i<count; i++) {
						if( (student[i].getName()).equals(name) ) {
							flag2 = true;
							System.out.println("Roll No		 : " + student[i].getRollNo());
							break;
						}
					}
					
					if(flag2 == false) {
						System.out.println("\nStudent record not found.");
					}
					break;
					
			case 4:	if(count == 0) {
						System.out.println("\nThere is no student.");
						break;
					}
					for(int i=0; i<count; i++) {
						System.out.println("\nRoll No :" + student[i].getRollNo());
						System.out.println("Student name : " + student[i].getName());
					}
					break;
					
			case 5: System.out.print("\nEnter name or roll number: ");
					String str = sc.next();
					int del_idx = -1;
					if( Character.isDigit(str.charAt(0)) ) {
						for(int i=0; i<count; i++)
						{
							if(student[i].getRollNo() == Integer.parseInt(str)) {
								del_idx = i;
								break;
							}
						}
					}
					else  {
						for(int i=0; i<count; i++)
						{
							if(student[i].getName().equals(str)) {
								del_idx = i;
								break;
							}
						}
					}
					
					if(del_idx == -1) {
						System.out.println("No such record found.");
						break;
					}
					else {
						Student[] studNew = new Student[25];
						int k = 0;
						for(int i=0; i<del_idx; i++) {
							studNew[k++] = student[i];
						}
						for(int j=del_idx + 1; j<count; j++) {
							studNew[k++] = student[j];
						}
						student = studNew;
						count--;
						System.out.println("\nStudent Record deleted.");
					}
					break;
					
			case 6:	sc.close();
					System.out.println("Program terminated.");
					System.exit(0);
			
			default: System.out.println("Invalid choice");
					 break;
			}
			
			System.out.println();
		}
		
	}


}
