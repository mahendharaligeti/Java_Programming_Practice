package com.stringvideos;

public class LargestSmallestValueInArray110 {
	public static void main(String[] args) {
		
		int[] arr = {1, 100, 20, 30, 40};
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for (int num1 : arr) {
			
			if (num1 > largest) {
				largest = num1;
			}
		}
		System.out.println("Largest Number in Array: " + largest);
		
		for(int num2 : arr) {
			if (num2 < smallest) {
				smallest = num2;
			}
		}
		
		
		System.out.println("Smallest Number in Array: " + smallest);
	}
}
