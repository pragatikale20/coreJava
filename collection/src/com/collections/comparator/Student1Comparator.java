package com.collections.comparator;
import java.util.Comparator;

import entities.Student;
public class Student1Comparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1,Student obj2) {
		
		return obj1.getAge()-obj2.getAge();
	}

	
}
