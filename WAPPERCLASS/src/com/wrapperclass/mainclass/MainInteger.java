package com.wrapperclass.mainclass;

import com.mywrapperclass.MyInteger;

public class MainInteger {

	public static void main(String[] args) {
		MyInteger integer = new MyInteger();
		int num1 = integer.boxing(100);
		System.out.println(num1);
		System.out.println(integer.unBoxing(num1));
		System.out.println(integer.stringToNumber("56"));
	}
}
