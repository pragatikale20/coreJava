package com.exception_handling.customs;

public class MainDemoException {
public static void main(String[] args) {
	try {
		int num = 10/0;
	} catch (ArithmeticException e) {
		throw new DemoException("This is cuatom exception" , e);
		
	}
}
}
