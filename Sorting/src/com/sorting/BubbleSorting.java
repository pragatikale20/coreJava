package com.sorting;

public class BubbleSorting {

	public static void printAraay(int arr[]) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,1,6,7,9,2};
		
		for(int i = 0; i<arr.length-1 ; i++) { 
			for(int j= 0; j<arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
		printAraay(arr);
	}
}
