package com.stringvideos;

public class FibonacciSequence12 {
	
	public static void main(String[] args) {

		int n = 10;

		int firstNum = 0;
		int secNum = 1;

		System.out.println("Fibonacci series till " + n + " terms");

		for (int i = 1; i <= n; i++) {
			int nextInt = firstNum + secNum;
			
			System.out.println(firstNum + " ");

			firstNum = secNum;
			secNum = nextInt;
		}
	}
}
