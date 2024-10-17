package com.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> intLinkedList = new LinkedList<>();
		
		intLinkedList.add(10);
		intLinkedList.add(20);
		intLinkedList.add(30);
		intLinkedList.add(40);
		intLinkedList.add(50);
		intLinkedList.add(null);
		intLinkedList.add(null);
		
		System.out.println(intLinkedList);
		
		intLinkedList.set(5, 60);
		intLinkedList.set(1, 50);
		System.out.println(intLinkedList);
		
		intLinkedList.remove(6);
		System.out.println(intLinkedList);
		
		List<Integer> intList = new LinkedList<>();
		intList.add(80);
		intList.add(90);
		intList.add(100);
		System.out.println(intList);
		intLinkedList.addAll(intList);
		System.out.println(intLinkedList);
		
		
		System.out.println( " Index of : "+ intLinkedList.indexOf(50));
		System.out.println(" Last Index of: "+ intLinkedList.lastIndexOf(50));
		System.out.println();
		
		List<Integer> subList = intLinkedList.subList(5, intLinkedList.size()-1);
		System.out.println(" Sublist : "+ subList);
		
		//Traditional for loop
		for(int i = 0; i<intLinkedList.size() ; i++) {
			System.out.print(intLinkedList.get(i) + " ");
		}
		System.out.println();
		
		//Advanced For loop
		for(Integer i : intLinkedList) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//using for each method 
		//intLinkedList.forEach((val) -> System.out.print(val + "   "));
		intLinkedList.forEach(System.out::println);
		System.out.println("   ");   
		
		//stram api 
		intLinkedList.stream().forEach(System.out::println);
		
		//Iterator cursor
		Iterator<Integer> intIterator = intLinkedList.iterator();
		while(intIterator.hasNext()) {
			System.out.print(intIterator.next() + " ");
		}
	}
}
