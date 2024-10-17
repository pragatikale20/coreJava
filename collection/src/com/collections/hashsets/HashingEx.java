package com.collections.hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashingEx {
public static void main(String[] args) {
	Set<String> stringSet = new HashSet<>();
	
	stringSet.add("ABC");
	stringSet.add("ABCD");
	stringSet.add("ABC");
	stringSet.add("BCA");
	stringSet.add("ABCE");
	stringSet.add("ABCA");
	stringSet.add(null);
	boolean str = stringSet.contains("ABCC");
	System.out.println(str);
	//System.out.println(stringSet.remove("ABC"));
	
//	for(String str1:stringSet) {
//		System.out.println(str1);
//	}
	
	//System.out.println(stringSet);
	//stringSet.forEach(str -> System.out.println(str););
	
	//void accept(T t)
	//stringSet.forEach(System.out::println);
	
	Iterator<String> stringIterator = stringSet.iterator();
	while(stringIterator.hasNext()) {
		System.out.println(stringIterator.next());
	}
	
}
}
