package com.stringvideos;

import java.util.Scanner;

public class InsertElementsInArray2 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		System.out.println("Enter your Elements:");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing elements before inserting.");
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("Enter the Location which we want to insert the element:");
		int location = sc.nextInt();
		
		System.out.println("Enter the Value which we want to insert the element in the Location:");
		int value = sc.nextInt();
		
		for (int i = arr.length - 1; i > location; i--) {
			arr[i] = arr[i-1];
		}
		arr[location] = value;
		
		for(int j : arr) {
			System.out.println(j);
		}
		
		sc.close();
	}
}
