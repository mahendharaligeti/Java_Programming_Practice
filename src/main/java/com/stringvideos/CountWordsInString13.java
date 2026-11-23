package com.stringvideos;

import java.util.Arrays;

public class CountWordsInString13 {
	public static void main(String[] args) {
		
		String str = "Iam learning Java";
		
		long count = Arrays.stream(str.split(" ")).count(); // use when knowing how many whitespaces in string
		
//		long count = Arrays.stream(str.split("\\s+")).count(); // use when we dont know whitespaces in string
		
		System.out.println(count);
	}
}
