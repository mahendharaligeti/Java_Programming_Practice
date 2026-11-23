package com.strings;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {

		//1 charAt method
		String s1 = "ashokit";
		System.out.println(s1.charAt(0));

		//2 Length method
		String t1 = "ashokit";
		System.out.println(t1.length());

		//3 Concat Method
		String u1 = "ashok";
		String u2 = "it";
		String u3 = u1.concat(u2);

		System.out.println(u3);

		//4 Equals Method
		String v1 = "hi";
		String v2 = "hello";

		System.out.println(v1.equals(v2));
		
		// 5 Replace method
		String a1 = "hyderabad";
		String str = "	hello	";
		String a2 = a1.replace("bad", "good");

		System.out.println(a2);
		
		a1.toUpperCase( ) ; //toUpper Method
		
		a1.toUpperCase( ) ; // toLower Method
		
		System.out.println ( a1.indexOf('a') ) ; // indexOf method
		
		System.out.println ( a1.lastIndexOf('a') ) ; // lastIndexOf method
		
		System.out.println( a1.substring(0,5)); // SubString method
		
		// 6
		String b1  = "hi@hello@how are@you";
		String [ ] arr = b1.split ("@");
		
		System.out.println(Arrays.toString(arr));
		
		//7 ValueOf
		int a = 10 ;
		int b = 20 ;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(a) + String.valueOf(b));
		
		System.out.println(a1.startsWith("a")); // StartsWith Method ---- false
		System.out.println(a1.startsWith("hy")); // checks whether string starts with given char or not --- true
		
		System.out.println(a1.endsWith("a")); // EndsWith Method ---- false
		System.out.println(a1.endsWith("bad"));
		
		System.out.println(str.trim()); //trims the starting and ending spaces of the string
		
		String aa = a1.intern();
		System.out.println(aa);
		
		char[] arra = a1.toCharArray();
		System.out.println(arra);
	}	
}
