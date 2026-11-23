package com.strings;

public class CMDArgs {
	public static void main(String[] a) {
		
//		String s1 = a[0];
//		String s2 = a[1];
//		String s3 = a[2];
//		
//		System.out.println(s1 + s2 + s3);
		
		System.out.println ("Total Cmd Args :: " + a.length );

		String s1 = a [0];

		String s2 = a [1];

		int x = Integer.parseInt (s1);
		int y = Integer.parseInt(s2);

		System.out.println (x + y);
	}
}
