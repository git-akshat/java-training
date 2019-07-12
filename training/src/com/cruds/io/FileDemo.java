package com.cruds.io;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File file = new File("states1.txt");
		
		if(file.exists() && file.canRead()) {
			System.out.println("Exists");
		}
		else {
			System.out.println("Does not exists");
		}
	}

}
