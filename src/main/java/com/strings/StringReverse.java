package com.strings;

public class StringReverse {
	public static void main(String[] args) {
		String s = "java";
		
//		String s = args[0]; // this declaration will read the string from the console.
		
		String rev = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	}
}
