package com.collections.hashsets;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainStudentQueue {

	public static void main(String[] args) {
		Set<Student> studentData = new TreeSet<>();
		studentData.add(new Student("Pragati", "Ramchandra ", "Kale" ,50000," Computer"));
		studentData.add(new Student("Mayurii", "m ", "Kshirsagar" ,80000," Electrical"));
		studentData.add(new Student("Pragati", "Ramchandra ", "Kale" ,50000," Entc"));
		studentData.add(new Student("Ashwini", "Dev ", "Magar" ,50000,"  Electrical"));
		studentData.add(new Student("Ashwini", "Dev ", "Magar" ,80000,"  Electrical"));
		studentData.add(new Student("Vaishnavi", "v ", "Upase" ,60000," Computer"));
		studentData.add(new Student("Divya", "Shrimant ", "Mane" ,10000," Computer"));
		studentData.add(new Student("Namrata", "Surendra ", "Kamble" ,20000," Computer"));
		studentData.add(new Student("Atharv", "Amol ", "Rajmane" ,30000," Computer"));
		
		//System.out.println(studentData);
		
		studentData.forEach(System.out::println);
		
		
	}
}
