package com.abstractions.networkbill;

public class MainNetwork extends Network {

	public static void main(String[] args) {
		BillGenerator obj = new Network();
		System.out.println(obj.generateBill(100));
		
	}

}
