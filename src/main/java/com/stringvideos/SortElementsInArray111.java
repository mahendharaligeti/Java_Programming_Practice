package com.stringvideos;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsInArray111 {
	public static void main(String[] args) {

		String[] str = { "one", "two", "three", "four" };

		System.out.println("Before Sorting the Array:");

		for (String arr : str) {
			System.out.println(arr);
		}

		Arrays.sort(str);

		System.out.println("After Sorting the Array:");

		for (String arr : str) {
			System.out.println(arr);
		}
		
		Arrays.sort(str, Collections.reverseOrder());
		
		
	}
}
