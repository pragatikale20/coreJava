package com.abstractions.networkbill;
public class Network implements BillGenerator{

	@Override
	public float generateBill(int networkUsage) {
		return networkUsage * 8;
	}
}
