package com.exception_handling.classes;

public class MaintryCatchDemo {
	public static void main(String[] args)  {
		MultiCatchDemo obj = new MultiCatchDemo();
		try {
			obj.printTable(5);
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}catch(NullPointerException ex) {
			System.out.println();
		}
		
	}
}
