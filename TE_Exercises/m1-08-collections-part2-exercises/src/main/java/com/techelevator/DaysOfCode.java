package com.techelevator;

public class DaysOfCode {
	
//	Day 1: SwapEnds
//	Create an integer array method called SwapEnds that takes in an integer array "nums". 
//	Given an array of ints, swap the first and last elements in the array. 
//	Return the modified array. The array length will be at least 1.
//
//	For example:
//
//	swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//	swapEnds([1, 2, 3]) → [3, 2, 1]
//	swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	
	public DaysOfCode() {
		
	}
	
	public int[] reverse(int[] firstArray) {
		int[] secondArray = new int[] {};
		int j = 0;
		for (int i = firstArray.length-1; i > -1; i--) {
			secondArray[j] = firstArray[i];
			j++;
		}
		return secondArray;
	}
	
	public int[] swapEnds(int[] firstArray) {
		int[] secondArray = firstArray;
		int j = 0;
		for (int i = firstArray.length-1; i > -1; i--) {
			secondArray[j] = firstArray[i];
			j++;
		}
		return secondArray;
	}
	
}
