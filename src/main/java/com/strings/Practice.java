package com.strings;

public class Practice {
	public static void main(String[] a) {
		
		String s = "java";

        String reversed = reverseString(s);
        System.out.println(reversed);
	}
	
	public static String reverseString(String s) {
        String rev = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
