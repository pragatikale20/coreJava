package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainHashMaps {

public static void main(String[] args) {
		Map<Integer , String> pinCodeMap = new HashMap<>();
		pinCodeMap.put(413106, "Indapur");
		pinCodeMap.put(413107, "Malshiras");
		pinCodeMap.put(413101, "Akluj");
		pinCodeMap.put(413101, "Akluj");
		pinCodeMap.put(null, null);
		
		//System.out.println(pinCodeMap.remove(413107));
		//System.out.println(pinCodeMap.containsKey(413107));
		//clear method - clear all the elements from collection objects
		//isEmpty - returns boolean 
		for(Integer key:pinCodeMap.keySet())
			System.out.println(key);
		System.out.println();
		for(String value:pinCodeMap.values())
			System.out.println(value);
		
		System.out.println();
		
		for(Map.Entry<Integer, String> entry : pinCodeMap.entrySet())
			System.out.println(entry);
		
		System.out.println();
		
		
		Iterator<Integer> keyIterator = pinCodeMap.keySet().iterator();
		while(keyIterator.hasNext())
			System.out.println(keyIterator.next());
		
		
		Iterator<String> valueIterator = pinCodeMap.values().iterator();
		while(valueIterator.hasNext())
			System.out.println(valueIterator.next());
		
		Iterator<Entry<Integer,String>> keyValue = pinCodeMap.entrySet().iterator();
        while(keyValue.hasNext())
	    System.out.println(keyValue.next());
        System.out.println();

		pinCodeMap.keySet().forEach(System.out::println);
		pinCodeMap.values().forEach(System.out::println);
		
		pinCodeMap.entrySet().forEach(System.out::println);		
		//pinCodeMap.entrySet().forEach(MainHashMaps::printEntry);		
		
		//System.out.println(pinCodeMap);
}


        public static void printEntry(Map.Entry<Integer, String> entry) {
        	System.out.println(entry);
        }
        }
