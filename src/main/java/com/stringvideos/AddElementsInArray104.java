package com.stringvideos;

import java.util.Scanner;

public class AddElementsInArray104 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Size of the Array: ");
		
		int size = s.nextInt();
		
		s.close();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Array Elements: ");
		
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i : arr) {
			sum = sum + i;
		}
		
		System.out.println("The sum of the Elements in the Array is: " + sum);
	}
}
