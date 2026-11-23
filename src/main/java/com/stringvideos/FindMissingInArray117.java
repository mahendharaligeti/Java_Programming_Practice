package com.stringvideos;

import java.util.Arrays;

public class FindMissingInArray117 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		
		int missingNumber = getMissingNumber(arr, 6);
		System.out.println("Missing Number in " + Arrays.toString(arr) + " is: " + missingNumber);
	}
	
	static int getMissingNumber(int[] arr, int n) {
		int actualSum = 0;
		int expectedTotal = (n*(n+1)/2);
		
		for(int i : arr) {
			actualSum = actualSum + i;
		}
		
		return expectedTotal - actualSum;
	}
}
