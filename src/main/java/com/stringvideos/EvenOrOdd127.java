package com.stringvideos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd127 {
public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(isr);

		System.out.print("Enter number: ");
		String str = br.readLine ( );

		int num = Integer.parseInt(str);
		
		if (num%2 == 0) {
			System.out.println(num + " is an even Number");
		} else {
			System.out.println(num + " is an odd Number");
		}
	}
}
