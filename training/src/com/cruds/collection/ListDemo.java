package com.cruds.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("akshat");
		names.add("aditya");
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
		names.add(1, "tom");
		
		System.out.println("----Iterator---");
		ListIterator<String> iter = names.listIterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println();
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	}

}
