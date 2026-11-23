package com.oops;

public class LengthOfName {
	public static void main(String[] args) {
		
		LengthOfName t = new LengthOfName();
		int fullName = t.findLength("Mani");
		System.out.println(fullName);
	}

	int findLength(String name) {

		int length = name.length();

		return length;
	}
}
