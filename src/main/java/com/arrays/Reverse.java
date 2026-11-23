package com.arrays;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		
		// reverse of an array 
		int arr[] = { 15, 8, 9, 2, 11, 4, 7 };

		int temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		for (int n : arr) { // enhanced for loop
			System.out.print(n + " ");
		}
		
		System.out.println();

		// printing array in 3 - ways
		int arr2[] = { 5, 8, 2, 6, 9, 3 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		for (int x : arr2) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(arr));

		// reverse of an array
		int arr3[] = { 5, 8, 2, 6, 9, 3 };
		
		int temp2 = 0;
		
		for (int i = 0; i < arr3.length; i++) {

			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] < arr3[j]) {
					temp2 = arr[i];
					arr3[i] = arr3[j];
					arr3[j] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
