package com.cruds.collection;

import java.util.*;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
							// doesn't maintain order
		//Set<String> names = new HashSet<>();
		
					// maintain order
		//Set<String> names = new LinkedHashSet<>();

						// arrange alphabatically
		Set<String> names = new TreeSet<>();

		names.add("Mahesh");
		names.add("Akshat");
		names.add("Aditya");
		names.add("mahesh");
		names.add("Akshat");
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
	}

}
