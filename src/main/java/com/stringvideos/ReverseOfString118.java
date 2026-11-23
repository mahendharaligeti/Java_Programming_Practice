package com.stringvideos;

import java.util.Scanner;

public class ReverseOfString118 {
	public static void main(String[] args) {
		
		String reverse = "";
		
		System.out.print("Enter the String: ");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		
		System.out.print("String Reverse: " + reverse);
		
		sc.close();
	}
}
