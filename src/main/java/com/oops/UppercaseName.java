package com.oops;

public class UppercaseName {
	public static void main(String[] args) {

		UppercaseName t = new UppercaseName();
		String name = t.ConvertToUppercase("ManiMan");
		System.out.println(name);
//		System.out.println(t.ConvertToUppercase("ManiMan")); // this also considered
	}

	String ConvertToUppercase(String fullName) {

		return fullName.toUpperCase();
	}
}
