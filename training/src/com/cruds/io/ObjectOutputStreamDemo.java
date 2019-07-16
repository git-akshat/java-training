package com.cruds.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class ObjectOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("files/student.ser"));
			Student s1 = new Student(101, "Anil");
			os.writeObject(s1);
			Student s2 = new Student(102, "ravi");
			os.writeObject(s2);
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
