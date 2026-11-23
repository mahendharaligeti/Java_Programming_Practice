package com.loops;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        String prime = PrimeCheck.isPrime(i);

        System.out.println(prime);
    }

    public static String isPrime(int A) {

        if (A <= 1) return A + " - is Not prime";

        if (A == 2) return A + " - is Prime";

        if(A % 2 == 0) return A + " - is not Prime";

//        for (int i = 3; i < A; i++) {
//            if (A % i == 0) return A + " - is Not Prime";
//        }

        // optimized logic
        for (int i = 3; i * i < A; i += 2) {
            if (A % i == 0) return A + " - is Not Prime";
        }

        return A + " - is Prime";
    }
}
