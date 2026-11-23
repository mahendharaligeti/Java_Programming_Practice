package com.oops;

public class SumOfTwoNumbers {
	public static void main(String[] args) {

		SumOfTwoNumbers t = new SumOfTwoNumbers();

		int result = t.add(10, 21);

		System.out.println(result);
	}

	int add(int a, int b) {
		return a + b;
	}
}
