package com.stringvideos;

import java.util.Arrays;

public class Anagram132 {
	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		
		if (s1.length() != s2.length()) {
			System.out.println("Strings are not Anagram");
			return;
		}
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if (result) {
			System.out.println("Both the Strings are Anagram");
		} else {
			System.out.println("Both Strings are not Anagram");
		}
	}
}
