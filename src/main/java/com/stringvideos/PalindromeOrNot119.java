package com.stringvideos;

import java.util.*;

public class PalindromeOrNot119 {
	public static void main(String[] args) {
		String reverse = "";
		
		System.out.print("Enter a String: ");
		Scanner scanner = new Scanner(System.in);
		
		String original = scanner.nextLine();
		
		for (int i = original.length()-1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if (original.equals(reverse)) {
			System.out.println("Entered string is Palindrome.");
		} else {
			System.out.println("Entered String is not Palindrome.");
		}
		scanner.close();
	}
}
