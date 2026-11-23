package com.stringvideos;

import java.util.Scanner;

public class LeapYear116 {
	public static void main(String[] args) {
		
		System.out.print("Enter year: ");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		sc.close();
		
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
