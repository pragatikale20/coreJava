package com.abstractn.arithmaticOperations.interfaces;

public class MainArithmaticOperations {
public static void main(String[] args) {
	ArithmaticOperations add = (op1 , op2) -> (op1 + op2);
	ArithmaticOperations sub = (op1 , op2) -> (op1 - op2);
	ArithmaticOperations mul = (op1 , op2) -> (op1 * op2);
	ArithmaticOperations div = (op1 , op2) -> (op1 / op2);
	ArithmaticOperations mod = (op1 , op2) -> (op1 % op2);
	
	System.out.println("The Addition is : " + add.doOperation(50, 7));
	System.out.println("The Substraction is : " + sub.doOperation(50, 7));
	System.out.println("The MUltiplication is : " + mul.doOperation(50, 7));
	System.out.println("The Division is : " + div.doOperation(50, 7));
	System.out.println("The Remainder is : " + mod.doOperation(50, 7));
	
	
}
}
