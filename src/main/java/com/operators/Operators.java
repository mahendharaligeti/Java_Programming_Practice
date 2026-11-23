package com.operators;

public class Operators {
	public static void main(String[] args) {
		int a = 7;
		int b = ++a + a++ + a++ + ++a + a++ + a++ + a + a++;
		System.out.println(b);

		System.out.println();

		int x = 5;
		int y = 2;

		int sum = x + y;
		int diff = x - y;
		double div = x / y;
		int mul = x * y;
		int mod = x % y;

		int postInc = x++;
		int preInc = ++x;

		int postDec = x--;
		int preDec = --x;

		System.out.println("Addition of x and y: " + sum);
		System.out.println("Difference of x and y: " + diff);
		System.out.println("Division of x and y: " + div);
		System.out.println("Multiplication of x and y: " + mul);
		System.out.println("Modulas of x and y: " + mod);

		System.out.println();

		System.out.println("Post Increment of x: " + postInc);
		System.out.println("Pre Increment of x: " + preInc);
		System.out.println("Post Decrement of x: " + postDec);
		System.out.println("Pre Decrement of x: " + preDec);

		System.out.println();

		System.out.println("x is: " + x + ", y is: " + y);

		System.out.println();

		System.out.println("x == y: " + (x == y));
		System.out.println("x != y: " + (x != y));
		System.out.println("x > y: " + (x > y));
		System.out.println("x < y: " + (x < y));
		System.out.println("x >= y: " + (x >= y));
		System.out.println("x <= y: " + (x <= y));

		System.out.println();

		int i = 10;
		int j = 11;

		if (i < j && j > i) {
			System.out.println("Both conditions are true");
		} else {
			System.out.println("Either one is flase or none is true");
		}

		System.out.println();

		if (i > j || j > i) {
			System.out.println("Either one condition is true.");
		} else {
			System.out.println("none is true");
		}

		System.out.println();

		if (i > j) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println();

		if (i >= j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("i is less than j");
		}
	}

}
class  Test{

}
