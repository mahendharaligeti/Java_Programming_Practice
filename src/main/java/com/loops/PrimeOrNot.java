package com.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrNot {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter your number: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

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
