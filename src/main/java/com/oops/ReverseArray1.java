package com.oops;

public class ReverseArray1 {
	public static void main(String[] args) {
		
		int[] arr = { 15, 8, 9, 2, 11, 4, 7 };
		
		ReverseArray1 t = new ReverseArray1();
		
		t.reverseArray(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

	int[] reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
}
