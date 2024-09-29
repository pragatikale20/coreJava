package com.exception_handling.classes;

public class ThrowDemo {
public void division(int num1, int num2) {
	if(num2 == 0)
		throw new ArithmeticException("second num is not divised by zeero");
	else {
		System.out.println("div is : " + (num1/num2));
	}
	
}
public void setName(String name) {
	if(name.matches("[A-Z][a-z][2,14]"))
		System.out.println("valid data");
	else 
		throw new RuntimeException("Invalid data / name");
	
}
}
