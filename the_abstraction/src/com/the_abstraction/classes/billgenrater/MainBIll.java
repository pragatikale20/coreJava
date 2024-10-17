package com.the_abstraction.classes.billgenrater;

public class MainBIll {

	public static void main(String[] args) {
		Bill obj = new IndustrialBill();
		Bill obj1 = new StatewiseBIll();
		System.out.println("The Statewise bill is : " + obj1.generateBill(10));
		System.out.println("The industrial bill is : " + obj.generateBill(5));
		
	}
}
