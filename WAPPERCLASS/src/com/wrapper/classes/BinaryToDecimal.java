package com.wrapper.classes;

public class BinaryToDecimal {
    public static void main(String[] args) {
       
        String binaryString = "1010";
        
        
        int decimal = Integer.parseInt(binaryString, 2);
        
       
        System.out.println("Binary: " + binaryString + " -> Decimal: " + decimal);
    }
}
