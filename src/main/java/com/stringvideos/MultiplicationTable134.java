package com.stringvideos;

import java.util.Scanner;

public class MultiplicationTable134 {
	public static void main(String[] args) {
		
		System.out.print("Enter the number to print multiplication table: ");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		sc.close();

		for (int j = 1; j <= 10; j++) {
//			int result = i * j;
//			System.out.println(i + " * " + j + " = " + result);
			
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}
}
