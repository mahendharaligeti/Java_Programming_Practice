package com.oops;

public class VoteEligibility {
	public static void main(String[] args) {

		VoteEligibility t = new VoteEligibility();
		
		t.check(19);
		
		boolean voter = t.checkAge(17);
		System.out.println(voter);
	}

	void check(int age) {
		if (age >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not Eligible");
		}
	}

	boolean checkAge(int age) {
		return age >= 18;
	}
}
