package com.generics.upperbiunds;

import java.util.Arrays;

public class MainGenericUpperBiund {

	public static void main(String[] args) {
//		GenericUpperBound<Integer> intVal = new GenericUpperBound<>();
//		
//		intVal.setVal(10);
//		System.out.println(intVal.getVal());
		
		
		
		GenericUpperBoundSorting<String> stringSorting = new GenericUpperBoundSorting<String>();
		stringSorting.setTArray("a","c","b", "e", "d");
		
		System.out.println("Before sorting: ");
		
		stringSorting.printTArray();
		System.out.println("Array after Sorting: ");
	    stringSorting.sortTArray();
		
		
	}
}
