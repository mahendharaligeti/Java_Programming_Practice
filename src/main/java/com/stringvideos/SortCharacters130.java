package com.stringvideos;

import java.util.Arrays;

public class SortCharacters130 {
	public static void main(String[] args) {
		
		String s = "java";
		
		char[] ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		String str = new String(ch);
		
		System.out.println(str);
	}
}
