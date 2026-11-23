package com.strings;

public class WordCount1 {
	public static void main(String[] args) {
		String s = "Hello    my      dear friend";
		
		String[] arr = s.split("\\s+");
		
		System.out.println(arr.length);
	}
}
