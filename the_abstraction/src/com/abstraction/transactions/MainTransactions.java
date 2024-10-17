package com.abstraction.transactions;

public class MainTransactions {
public static void main(String[] args) {
	Operations obj = new Operations(1000);
	obj.creditAmt(1000);
	obj.debitAmt(500);
	
}
}
