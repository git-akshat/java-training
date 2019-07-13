package com.cruds.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("Karnataka", "Bangalore");
		prop.put("Tamil Nadu", "Chennai");
		prop.put("Maharashtra", "Mumbai");
		
		System.out.println(prop.getProperty("Karnataka"));
		System.out.println(prop.getProperty("Tamil Nadu"));
		System.out.println(prop.getProperty("Maharashtra"));
		
		try {
			prop.store(new FileOutputStream("capitals.properties"), "state capitals");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Stored Successfully");

		
		
	}

}
