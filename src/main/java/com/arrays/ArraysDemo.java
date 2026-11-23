package com.arrays;

public class ArraysDemo {
	public static void main(String[] args) {

		// 1
		int[] arr = new int[3];

		arr[0] = 100;
		arr[1] = 101;
		arr[2] = 102;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// 2
		int[] arr2 = new int[5];
		arr2[0] = 100;
		arr2[1] = 101;
		arr2[2] = 102;

		System.out.println(arr2.length);

		// 3
		int arr3[] = new int[3];

		arr3[0] = 100;
		arr3[1] = 101;
		arr3[2] = 102;

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		// 4
		boolean[] arr4 = new boolean[3];

		arr4[2] = true;

		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		// 5
		int arr5[] = { 101, 102, 103, 104 };

		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}

		// 6
		int arr6[] = { 101, 102, 103, 104 };

		arr6[0] = 200;

		arr6[1] = 300;

		System.out.println(arr6[1]);
	}
}
