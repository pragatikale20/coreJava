package com.sorting;

public class SelectionSorting {
	//printing array
 public static void printArr(int arr[]) {
	 for(int i = 0; i<arr.length; i++) {
		 System.out.println(arr[i] + " ");
	 }
	 System.out.println();
 }
 
 public static void main(String[] args) {
	 //Selection sort
	int arr[] = {1,5,9,7,8,3,2};
	for(int i = 0; i<arr.length-1 ;i++) {
		int smallest = i;
		for(int j = i+1 ; j<arr.length; j++) {
			if(arr[j] < arr[smallest]) {
				smallest = j;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[i] ;
		arr[i] = temp;
	}
	printArr(arr);
}
}
