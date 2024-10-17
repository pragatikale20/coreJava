package com.generics.classes;

public class MainBox {
public static void main(String[] args) {
	
	Box<String> obj = new Box("Strings");
	
	String val = obj.getContent();
	System.out.println(val);
	
	Box<Integer> obj1 = new Box(15);
	int val2 = obj1.getContent();
	System.out.println(val2);
	
	
}
}
