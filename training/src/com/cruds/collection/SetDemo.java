package com.cruds.collection;

import java.util.*;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
							// doesn't maintain order
		Set<String> names1 = new HashSet<>();
		names1.add("Mahesh");
		names1.add("Akshat");
		names1.add("Aditya");
		names1.add("mahesh");
		names1.add("Akshat");
		
					// maintain order
		Set<String> names2 = new LinkedHashSet<>();
		names2.add("Mahesh");
		names2.add("Akshat");
		names2.add("Aditya");
		names2.add("mahesh");
		names2.add("Akshat");

						// arrange alphabatically
		Set<String> names3 = new TreeSet<>();

		names3.add("Mahesh");
		names3.add("Akshat");
		names3.add("Aditya");
		names3.add("mahesh");
		names3.add("Akshat");
		
		System.out.println("----HashSet------");
		for(String s : names1)
		{
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("----LinkedHashSet------");
		for(String s : names2)
		{
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("----TreeSet------");
		for(String s : names3)
		{
			System.out.println(s);
		}
		System.out.println();
		
	}

}
