package com.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeePF {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Basic Salary: ");
		String str = br.readLine();

		double basicSalary = Double.parseDouble(str);

		double pf = basicSalary * 12 / 100;

		System.out.println(pf);

	}

}
