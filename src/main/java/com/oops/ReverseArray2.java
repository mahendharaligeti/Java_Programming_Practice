package com.oops;

public class ReverseArray2 {
	
	int xyz;
	public static void main(String[] args) {

		int[] arr = { 15, 8, 9, 2, 11, 4, 7 };

		ReverseArray2 t = new ReverseArray2();

		t.reverseArray(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
	
	void reverseArray(int[] arr) {
		int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
	}
}
