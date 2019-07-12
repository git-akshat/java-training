package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	
	
	static byte[] getData(byte[] data) {
		return data;
	}

	public static void main(String[] args) {
		
		//boiler plate code
		
		try (FileInputStream fis = new FileInputStream("Output.txt")){
			int size = fis.available();
			System.out.println(size);

			
			byte[] data = new byte[size];
			
			fis.read(data);
			
			System.out.println(new String(data));
			
			/*String fileData = new String(data);
			fileData = fileData.replaceAll("\n"," ");
			String[] fileArr = fileData.split(" ");
			System.out.println(fileArr[3]);*/
			
			
			/*for(int i=0; i<size; i++) {
				System.out.print((char) fis.read()); //reads character by character
			}*/
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
