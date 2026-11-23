package com.stringvideos;

import java.util.Arrays;

public class SecondLargestElementInArray103 {
	public static void main(String[] args) {

		int[] arr = { 1, 8, 14, 3, 6 };
		
		Arrays.sort(arr);
		
		System.out.println("The Second largest element in the array is: " + arr[arr.length - 2]);
	}
}
