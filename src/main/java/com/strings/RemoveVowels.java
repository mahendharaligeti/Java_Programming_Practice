package com.strings;

public class RemoveVowels {
	public static void main(String[] args) {
		
		String s = "hello, how are you man!";
		s = s.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(s);
	}
}
