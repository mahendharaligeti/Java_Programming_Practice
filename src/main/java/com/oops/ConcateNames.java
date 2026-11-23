package com.oops;

public class ConcateNames {
	public static void main(String[] args) {

		ConcateNames t = new ConcateNames();
		String fullName = t.ConcatNames("Mani", "Money");
		System.out.println(fullName);
	}

	String ConcatNames(String fName, String lName) {

		return fName + lName;
	}
}
