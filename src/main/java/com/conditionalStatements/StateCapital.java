package com.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateCapital {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the Name of an Indian State: ");
		String state = br.readLine();

		switch (state) {
		case "andhra pradesh":
			System.out.println("Capital: Amaravati");
			break;
		case "arunachal pradesh":
			System.out.println("Capital: Itanagar");
			break;
		case "assam":
			System.out.println("Capital: Dispur");
			break;
		case "bihar":
			System.out.println("Capital: Patna");
			break;
		case "chhattisgarh":
			System.out.println("Capital: Raipur");
			break;
		case "goa":
			System.out.println("Capital: Panaji");
			break;
		case "gujarat":
			System.out.println("Capital: Gandhinagar");
			break;
		case "haryana":
			System.out.println("Capital: Chandigarh");
			break;
		case "himachal pradesh":
			System.out.println("Capital: Shimla");
			break;
		case "jharkhand":
			System.out.println("Capital: Ranchi");
			break;
		case "karnataka":
			System.out.println("Capital: Bengaluru");
			break;
		case "kerala":
			System.out.println("Capital: Thiruvananthapuram");
			break;
		case "madhya pradesh":
			System.out.println("Capital: Bhopal");
			break;
		case "maharashtra":
			System.out.println("Capital: Mumbai");
			break;
		case "manipur":
			System.out.println("Capital: Imphal");
			break;
		case "meghalaya":
			System.out.println("Capital: Shillong");
			break;
		case "mizoram":
			System.out.println("Capital: Aizawl");
			break;
		case "nagaland":
			System.out.println("Capital: Kohima");
			break;
		case "odisha":
			System.out.println("Capital: Bhubaneswar");
			break;
		case "punjab":
			System.out.println("Capital: Chandigarh");
			break;
		case "rajasthan":
			System.out.println("Capital: Jaipur");
			break;
		case "sikkim":
			System.out.println("Capital: Gangtok");
			break;
		case "tamil nadu":
			System.out.println("Capital: Chennai");
			break;
		case "telangana":
			System.out.println("Capital: Hyderabad");
			break;
		case "tripura":
			System.out.println("Capital: Agartala");
			break;
		case "uttar pradesh":
			System.out.println("Capital: Lucknow");
			break;
		case "uttarakhand":
			System.out.println("Capital: Dehradun");
			break;
		case "west bengal":
			System.out.println("Capital: Kolkata");
			break;
		default:
			System.out.println("Invalid or unknown state name.");
		}
	}

}
