package com.stringvideos;

import java.util.Scanner;

public class AlphabetOrNot133 {
	public static void main(String[] args) {
		
		System.out.print("Enter a Character: ");

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("It is an Alphabet");
		} else {
			System.out.println("It is not an Alphabet");
		}
	}
}
