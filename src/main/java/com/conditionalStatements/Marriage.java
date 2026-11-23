package com.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marriage {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Your Age: ");
		String str1 = br.readLine();
		int age = Integer.parseInt(str1);

		System.out.print("Enter Your Salary: ");
		String str2 = br.readLine();
		double salary = Double.parseDouble(str2);
		
		if (age < 30 && salary > 100000 ) {
			System.out.println("You're Eligible for Marriage.");
		}
		else {
			System.out.println("You're not Eligible for Marriage.");
		}
	}

}
