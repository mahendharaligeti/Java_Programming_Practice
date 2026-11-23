package com.oops;

public class VoteEligibility2 {
	public static void main(String[] args) {
		
		VoteEligibility2 t = new VoteEligibility2();
		boolean voter = t.check(29);
		System.out.println(voter);
	}

	boolean check(int age) {

		return age >= 18;
	}
}
