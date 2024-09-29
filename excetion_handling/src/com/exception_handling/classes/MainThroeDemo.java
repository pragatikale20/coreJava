package com.exception_handling.classes;

public class MainThroeDemo {
public static void main(String[] args) {
	ThrowDemo obj = new ThrowDemo();
	//obj.division(0, 0);
	try {
		obj.setName("Ab3");
	} catch (RuntimeException e) {
		// TODO: handle exception
		
		
	}
	System.out.println("Continued");
	
}
}
