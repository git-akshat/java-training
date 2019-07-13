package com.cruds.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GreetingDemo {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Welcome to " + prop.getProperty("COLLEGE_NAME"));
		System.out.println("Hearty Welcome by " + prop.getProperty("PRINCIPAL"));
		
		
	}

}
