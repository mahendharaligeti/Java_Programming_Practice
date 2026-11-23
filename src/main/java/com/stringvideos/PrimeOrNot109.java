package com.stringvideos;

import java.util.Scanner;

public class PrimeOrNot109 {
	public static void main(String[] args) {
		
		System.out.print("Enter a number to check weather the number is Prime or not: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		sc.close();
		
		if (num <= 1) {
			System.out.println("is not a prime: " + num);
			return;
		}

		if (2 == num) {
			System.out.println("is a prime: " + num);
			return;
		}

		int i = 2;

		while (i < num) {
			if (num % i == 0) {
				System.out.println("is not a prime: " + num);
				return;
			}
			i++;
		}
		System.out.println("is a prime: " + num);
	}
}
