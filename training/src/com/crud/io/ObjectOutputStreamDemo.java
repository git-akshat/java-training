package com.crud.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.crud.exception.StudentException;
import com.cruds.demo.Student;

public class ObjectOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser"));
			Student s1 = new Student(101, "Anil");
			os.writeObject(s1);
			os.close();
			System.out.println("Object written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
