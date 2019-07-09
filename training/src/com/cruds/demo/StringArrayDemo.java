package com.cruds.demo;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			System.out.print("Please enter a name: ");
			names[i] = sc.next();
		}
		
		while(true) {
			
			System.out.print("\nPlease enter a name to search: ");
			String searchName = sc.next();
		
			if(searchName == "exit")
			{
				break;
			}
			
			boolean flag = false;
			for(int i=0; i<names.length; i++) {
				if(names[i].equals(searchName)) {
					System.out.println("found at positon:" + i+1));
					flag = true;
				}	
			}
		
			if(flag == false) {
				System.out.println("Not found");
			}
		}
		sc.close();
		

	}

}
