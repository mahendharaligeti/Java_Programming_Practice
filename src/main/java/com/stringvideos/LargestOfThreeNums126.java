package com.stringvideos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestOfThreeNums126 {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(isr);

		System.out.print("Enter the first number: ");
		String str1 = br.readLine ( );
		System.out.print("Enter the second number: ");
		String str2 = br.readLine ( );
		System.out.print("Enter the third number: ");
		String str3 = br.readLine ( );

		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		int z = Integer.parseInt(str3);
		
		if (x>y && x>z) {
			System.out.println(x + "(First Number) is the greater number");
		}
		else if (y>x && y>z) {
			System.out.println(y + "(Second Number) is the greater number");
		}
		else if (z>x && z>y) {
			System.out.println(z + "(Third Number) is the greater number");
		}
	}
}
