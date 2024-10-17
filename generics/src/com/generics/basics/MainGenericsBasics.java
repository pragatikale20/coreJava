package com.generics.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenericsBasics {
	
	public static void main(String[] args) {
	
		List arrayList = new ArrayList();
		
		MainGenericsBasics obj = new  MainGenericsBasics();
		obj.getData("Abc", 10, 10.76F, 10.8D, 90L);
		//obj.getData(2);
		
		
}
	public void getData(Object... data) {
		float val =(float)data[2];
		//float val2 = (float)data[0]; //Runtime error
		System.out.println(val);
		
		//System.out.println(val2);
		System.out.println(Arrays.toString(data));
	}
}
