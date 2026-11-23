package com.strings;

public class WordCount2 {
	public static void main(String[] args) {
		String s = "    hello my   friend   howw   ";
		
		String[] arr = s.trim().split("\\s+");
		
		System.out.println(arr.length);
	}
}
