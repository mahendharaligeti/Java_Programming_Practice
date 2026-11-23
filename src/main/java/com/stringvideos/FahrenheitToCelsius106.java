package com.stringvideos;

import java.util.Scanner;

public class FahrenheitToCelsius106 {
	public static void main(String[] args) {

		System.out.print("Enter Fahrenheit temp to convert into Celsius: ");

		Scanner sc = new Scanner(System.in);

		float temp = sc.nextFloat();
		sc.close();

		temp = ((temp - 32) * 5) / 9;

		System.out.println("temp in Celsius is: " + temp);
	}
}
