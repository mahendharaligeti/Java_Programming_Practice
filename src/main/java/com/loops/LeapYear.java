package com.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the Year: ");
		String str = br.readLine();

		int year = Integer.parseInt(str);

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
					return;
				} else {
					System.out.println(year + " is not a Leap Year");
					return;
				}
			} else {
				System.out.println(year + " is a Leap Year");
				return;
			}
		} else {
			System.out.println(year + " is not a Leap Year");
			return;
		}
	}
}
