package com.stringbuilder;

public class StringBuilders {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ( "java" );
		System.out.println(sb.length());
		
		sb.append("program");

		System.out.println(sb);	
		System.out.println(sb.length());
	}
}
