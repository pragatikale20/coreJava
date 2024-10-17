package com.abstraction.transactions;

public class Operations extends Transactions {
int bal;
	public Operations(int bal) {
		this.bal = bal;
	}
	@Override
	public void creditAmt(float amt) {
		 bal += amt;
		System.out.println("The Total balance is : " + bal);
		
	}
	public void debitAmt(float amt) {
		bal -= amt;
		System.out.println("The Total balance is : " + bal);
		
	}
}
