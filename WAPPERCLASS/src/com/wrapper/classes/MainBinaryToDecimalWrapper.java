package com.wrapper.classes;

public class MainBinaryToDecimalWrapper {


	public static void main(String[] args) {
		
		BinaryToDecimalWrapper num = new BinaryToDecimalWrapper();
		Integer num1 = num.BinaryToDecimal("1111");
		String num2 = num.decimalToBinary(14);
	
	    System.out.println( " Binary to decimal is : "+ num1);
	    System.out.println( " Decimal to binary is : "+ num2);

	    
	}
}
