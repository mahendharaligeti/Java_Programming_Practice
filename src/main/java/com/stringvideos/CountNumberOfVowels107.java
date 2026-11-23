package com.stringvideos;

import java.util.Scanner;

public class CountNumberOfVowels107 {
	public static void main(String[] args) {
		
		System.out.print("Enter some string: ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		int count = 0;
		
		char[] arr = str.toCharArray();
		
		for (char c : arr) {
			
			switch(c) {
			
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			
				count ++;
				
				break;
			
			}
		}
		
		System.out.println("Number of vowels in a given string: " + count);
	}
}
