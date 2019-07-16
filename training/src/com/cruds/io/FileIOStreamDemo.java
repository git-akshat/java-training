package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {
	
public static void main(String[] args) {
		
		//boiler plate code
		byte data[] = null;
		try {
			FileInputStream fis = new FileInputStream("C:/Program Files (x86)/Java/jdk1.8.0_91/README.html");
			int size = fis.available();
			data = new byte[size];
			fis.read(data);
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("files/Output.txt");
			fos.write(data);
			fos.close();
			
			System.out.println("File written successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
