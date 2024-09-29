package in.sbp.arithmaticoperation.interfaces.mainclasses;

import in.sbp.arithmaticoperation.interfaces.*;

public class MainArithmaticOperations {
	
	public static void main(String[] args) {
		ArithmaticOperations addition =(operand1,operand2)-> operand1+operand2;
		ArithmaticOperations sub = (operand1,operand2)-> operand1-operand2;
		ArithmaticOperations multi = (operand1,operand2)-> operand1*operand2;
		ArithmaticOperations division = (operand1,operand2)-> operand1/operand2;
		ArithmaticOperations reminder = (operand1,operand2)-> operand1%operand2;
		System.out.println("addition is "+addition.doOperation(10,20));
	    System.out.println("substraction is: "+ sub.doOperation(10,20));
	    System.out.println("multiplication is: "+ multi.doOperation(10,20));
		System.out.println("division is: "+ division.doOperation(10,20));
		System.out.println("reminder is: "+ reminder.doOperation(10,20));
//		ArithmaticOperations obj1 = new ArithmaticOperations() {
//			@Override
//			public int doOperation(int operand1,int operand2) {
//				return operand1+operand2;
//			}
//			public int doOperation1(int operand1,int operand2) {
//				return operand1-operand2;
//			}
//			public int doOperation2(int operand1,int operand2) {
//				return operand1*operand2;
//			}
//			public int doOperation3(int operand1,int operand2) {
//				return operand1/operand2;
//			}
//			public int doOperation4(int operand1,int operand2) {
//				return operand1%operand2;
//			}
//		};
		
		
		
		
		
		
		
	}

}
