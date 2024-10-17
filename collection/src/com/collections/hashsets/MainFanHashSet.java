package com.collections.hashsets;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class MainFanHashSet {

	public static void main(String[] args) {
		Set<Fan> fanSet= new HashSet<>();
		
		fanSet.add(new Fan(3,500,6," Black"));
		fanSet.add(new Fan(4,700,8," Red"));
		fanSet.add (new Fan(5,5000,5,"White"));
		fanSet.add (new Fan(5,5000,5,"White"));
		fanSet.add (null);
		
		System.out.println(new Fan(5,5000,5,"White").hashCode());
		System.out.println(new Fan(5,5000,5,"White").hashCode());
		
		fanSet.forEach(System.out::println);
	}
}
