package com.stringvideos;

import java.util.Scanner;

public class ReplaceElementInArray {
public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		System.out.println("Enter your Elements:");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
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
		
		arr[location] = value;
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
