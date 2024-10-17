package com.collections.hashsets;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		Set<Test> test = new LinkedHashSet<>();
		
		
		test.add(new Test(2,"Question 2 ",5));
		test.add(new Test(3,"Question 3 ",10));
		test.add(new Test(4,"Question 4 ",7));
		test.add(new Test(4,"Question 4 ",7));
		test.add(new Test(1,"Question 1 ",3));
		

		test.forEach(System.out::println);
		
		Test[] testArray = test.toArray(new Test[0]);
	for(int i = 0 ; i<testArray.length; i++) {
		System.out.println(testArray[i]);
		
	}
		
	}
}
