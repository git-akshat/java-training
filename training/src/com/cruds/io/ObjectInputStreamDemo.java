package com.cruds.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.cruds.demo.Student;

public class ObjectInputStreamDemo {
	
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
			Student s1 = (Student) ois.readObject();
			ois.close();
			System.out.println(s1.getName() + " " + s1.getRollNo());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
