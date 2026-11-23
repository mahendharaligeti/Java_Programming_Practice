package com.stringvideos;

import java.util.Arrays;

public class DeleteElementFromArray7 {
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 7, 9, 15, 4, 1 };
		
		int removeElement = 15;
		
		int[] newArray = remove(arr, removeElement);
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		System.out.println("New Array: " + Arrays.toString(newArray));
		
		
	}
	
	public static int[] remove(int[] array, int element) {
		
		int[] newArray = new int[array.length - 1];
		
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]!=element) {
				newArray[index] = array[i];
				index++;
			}
			
		}
		
		return newArray;
	}
}
