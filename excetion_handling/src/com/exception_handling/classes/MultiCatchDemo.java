package com.exception_handling.classes;


public class MultiCatchDemo {

	public void printTable(int num) throws InterruptedException {
		
	for(int i = 1 ; i<= 10; i++) {
		Thread.sleep(1000);
		System.out.println(i*num);
	}
	}
	
}
