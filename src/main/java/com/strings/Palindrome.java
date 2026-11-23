package com.strings;

public class Palindrome {
	public static void main(String[] args) {
		
		// type 1
		String s = "sos";
//		String s = args[0];
		String rev = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if (s.equals(rev)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		// type 2
		String a = "amm";
//		String a = args[0];
		
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		
		String a1 = sb.toString();
		
		if (a.equals(a1)) {
			System.out.println("Is a Palindrome");
			
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
