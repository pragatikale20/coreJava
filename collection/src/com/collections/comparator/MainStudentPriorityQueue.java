package com.collections.comparator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import entities.Student;

public class MainStudentPriorityQueue {

	public static void main(String[] args) {
		Student1Comparator nameComparator = new Student1Comparator();
//		Comparator<Student> ageComparator1= (obj1,obj2) -> obj1.getAge()-obj2.getAge();
//		Comparator<Student> nameComparator1= (obj1,obj2) -> obj1.getName().compareTo(obj2.getName());
//		Comparator<Student> rollNoComparator1= (obj1,obj2) -> obj1.getRollNo()-obj2.getRollNo();
	
		
		Queue<Student> studentQueue = new PriorityQueue<>((obj1,obj2) -> obj1.getAge()-obj2.getAge());
		studentQueue.add( new Student(1,"Pragati",20));
	    studentQueue.add( new Student(2,"Divya  ",10));
	    studentQueue.add( new Student(3,"Namrata",40));
		studentQueue.add( new Student(4,"Sakshii",50));
		
		//studentQueue.remove();
		//studentQueue.peek();
		//System.out.println(studentQueue);
		studentQueue.forEach(System.out::println);
		
		
	}
}
