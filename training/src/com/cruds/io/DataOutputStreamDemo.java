package com.cruds.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("files/emp.dat"));
			dos.writeInt(101);
			dos.writeFloat(3.1415f);
			dos.writeUTF("akshat");
			dos.close();
			System.out.println("Data written Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
