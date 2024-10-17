package com.wrapper.classes;

public class BinaryToDecimalWrapper {
	
	//binary to decimal
	public Integer BinaryToDecimal(String no) {
		return Integer.parseInt(no,2);
	}
	
	///Decimal to binary
		public String decimalToBinary(int no) {
			return Integer.toBinaryString(no);
			
		
	}
}
