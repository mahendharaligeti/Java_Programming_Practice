package com.stringvideos;

import java.util.Scanner;

public class SortNamesInArray3 {
	public static void main(String[] args) {
		int n;
		String temp;
		
		System.out.print("Enter the number of names you want to sort: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		String[] names = new String[n];
		System.out.println("Enter the names you want to sort:");
		Scanner sca = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			names[i] = sca.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted names:");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		sc.close();
		sca.close();
	}
}
