package com.stringvideos;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfLargeNumber115 {
	public static void main(String[] args) {
		
		System.out.print("Enter your number: ");
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		BigInteger fact = BigInteger.ONE;
		
		for (int i = 1; i <= number; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fact);
		
		s.close();
	}
}
