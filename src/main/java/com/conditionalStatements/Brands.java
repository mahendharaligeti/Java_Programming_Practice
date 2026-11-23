package com.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brands {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the Name of a Brand: ");
		String brand = br.readLine();

		switch (brand) {
		case "Nike":
			System.out.println("Just Do It!");
			break;
		case "Puma":
			System.out.println("Forever Faster.");
			break;
		case "Adidas":
			System.out.println("Impossible is Nothing!");
			break;
		case "Rebok":
			System.out.println("I am what I am!");
			break;
		default:
			System.out.println("Brand not found!");
		}
	}

}
