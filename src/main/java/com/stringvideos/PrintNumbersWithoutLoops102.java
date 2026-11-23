package com.stringvideos;

public class PrintNumbersWithoutLoops102 {
	
	public static void main(String[] args) {
		
//		PrintNumbersWithoutLoops102 p = new PrintNumbersWithoutLoops102();
		
//		p.printNumbers(1); 
		
		printNumbers(1); //you can access this method without creating obj for class by making the method static.
	}
	
	static void printNumbers(int n) {
		
		if (n <= 10) {
			System.out.println(n);
			printNumbers(n + 1);
		}
	}
}
