package com.generics.upperbiunds;

//import java.util.Iterator;

public class GenericUpperBoundSorting <T extends Comparable<T>>{

	private T[] tArray;
	public void setTArray(T... tArray) {
		
		this.tArray = tArray;
		
		
	}
	public void sortTArray() {
		for(int i = 0; i<tArray.length ; i++) {
			for(int j = 0; j<tArray.length-1 ; j++) {
				if(tArray[i].compareTo(tArray[j])<0) {
					T temp = tArray[i];
					tArray[i] = tArray[j];
					tArray[j] = temp;
					
				}
				
				
			}
		}
			for(int i=0; i<tArray.length; i++) {
				System.out.println(tArray[i]);
			}
			
			
		
	}
	public void printTArray() {
		for ( T element :tArray)
		{	
			System.out.println(element);
		}
	}
	}
	
	
