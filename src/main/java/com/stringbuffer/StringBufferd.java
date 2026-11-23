package com.stringbuffer;

public class StringBufferd {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		
		sb.append(" hi");
		System.out.println(sb);
//		System.out.println(sb.append("hi")); // either direct append or append while printing
		
		StringBuffer sb1 = new StringBuffer("java");
		System.out.println(sb1.reverse());
		
		String s1 = "ashok";
		
		s1.concat("it");	//string is immutable so it won't add "it" to the string
		System.out.println(s1); // still it prints "ashok" only.
		
		s1 = s1.concat("it"); // Now s1 refers to the new string
		System.out.println(s1); // Output: ashokit
		
	}
}
