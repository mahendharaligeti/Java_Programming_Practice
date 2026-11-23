package com.stringvideos;

import java.util.Scanner;

public class ReverseOfNumber120 {
	public static void main(String[] args) {
		
//		Integer number = 123;
		
		System.out.println("ENter your Number");
		
		Scanner scanner = new Scanner(System.in);
		
		String number = scanner.nextLine();
		
		String numberString = String.valueOf(number);
		String reverse = "";
		
		for (int i = numberString.length()-1; i >= 0; i--) {
			reverse = reverse + numberString.charAt(i);
			
		}
		
		System.out.println(Integer.valueOf(reverse));
		scanner.close();
	}

}
