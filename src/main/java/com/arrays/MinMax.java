package com.arrays;

import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {

		// 1
		int arr[] = { 15, 8, 9, 2, 11, 4 };

		Arrays.sort(arr);

		System.out.println("Min Element : " + arr[0]);

		System.out.println("Max Element : " + arr[arr.length - 1]);

		// 2
		int arr2[] = { 15, 8, 9, 2, 11, 4 };

		int min = arr2[0];
		int max = arr2[0];

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
			}
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		System.out.println("Min Element : " + min);
		System.out.println("Max Element : " + max);
	}
}
