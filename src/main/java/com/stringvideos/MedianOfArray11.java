package com.stringvideos;

import java.util.Arrays;

public class MedianOfArray11 {

	public static void main(String[] args) {

		int[] arr = { 12, 4, 5, 9, 8, 6 };

		double median = findMedian(arr);

		System.out.println(median);
	}

	public static double findMedian(int[] array) {

		Arrays.sort(array);

		int n = array.length;

		if (n % 2 == 1) {
			return array[n / 2];
		} else {
			return (array[(n - 1) / 2] + array[n / 2]) / 2.0;
		}
	}
}
