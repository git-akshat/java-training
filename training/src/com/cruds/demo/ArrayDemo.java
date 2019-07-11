package com.cruds.demo;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] runs = new int[5];
		
//		runs[0] = 99;
//		runs[1] = 22;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<runs.length; i++) {
			System.out.print("Enter the number: ");
			runs[i] = sc.nextInt();
		}
		
		while(true) {
			
			System.out.print("\nPlease enter a number to search: ");
			int searchNum = sc.nextInt();
		
			if(searchNum == -1)
			{
				break;
			}
			
			boolean flag = false;
			for(int i=0; i<runs.length; i++) {
				if(runs[i] == searchNum) {
					System.out.println("found at positon:"+ i+1);
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
