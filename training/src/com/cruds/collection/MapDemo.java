package com.cruds.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "sada");
		map.put(102, "akshat");
		map.put(103, "joe");
		map.put(104, "tom");
		
		System.out.println(map.get(102));
		
		map.put(102, "akarsh");
		
		System.out.println(map.get(102));
		
		System.out.println("\n----KeySet----");
		Set<Integer> keyset = map.keySet();
		for(int k : keyset)
		{
			System.out.println(k);
		}
		
		System.out.println("\n----values----");
		Collection<String> values = map.values();
		for(String c : values)
		{
			System.out.println(c);
		}
		
		
		System.out.println("\n----Entry----");
		Set<Entry<Integer, String>> mapentries = map.entrySet();
		for(Entry<Integer, String> entry : mapentries)
		{
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}

}
