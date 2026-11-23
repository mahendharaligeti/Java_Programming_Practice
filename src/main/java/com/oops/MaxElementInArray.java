package com.oops;

public class MaxElementInArray {

	public static void main(String[] args) {

		MaxElementInArray t = new MaxElementInArray();
		int max = t.findMaxElement(new int[] { 3, 5, 9, 1, 12 });
		System.out.println("max element: " + max);
	}

	int findMaxElement(int[] arr) {

		int maxElement = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
		}

		return maxElement;
	}
}
