package com.stringvideos;

public class EvenLengthWords8 {
	public static void main(String[] args) {
		
		String str = "Hell World make me fly";
		
		for(String s : str.split(" ")) {
			if(s.length()%2 == 0) {
				System.out.println(s);
			}
		}
	}
}
