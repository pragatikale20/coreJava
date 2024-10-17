package com.sorting;

public class InsertionSort {
	
	//Printing Array
public static void printArr(int arr[]) {
	for(int i = 0 ;i<arr.length ;i++) {
		System.out.println(arr[i] + " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		//Insertion sort
		int arr[] = {5,2,7,8,1,3,9};
		for(int i = 1; i<arr.length; i++) {
			int curr = arr[i];
			int j = i-1; 
			while(j>=0 && curr < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
				//placing element 
			arr[j+1] = curr;
		
	}
		printArr(arr);
}
}
