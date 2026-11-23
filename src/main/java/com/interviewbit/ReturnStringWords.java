package com.interviewbit;

import java.util.Scanner;

public class ReturnStringWords {
    public static void main(String[] args) {

        System.out.print("Enter your String: ");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String iLoveYou = ReturnStringWords.solve(s);
        System.out.println(iLoveYou);
    }

    public static String solve(String s) {
        String[] str = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            result.append(str[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
