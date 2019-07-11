package com.cruds.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		String msg = "Hello World!";
		byte[] data = msg.getBytes();
		
		try(FileOutputStream fos = new FileOutputStream("Output.txt")){
			fos.write(data);
			fos.close();
			System.out.println("File written successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
