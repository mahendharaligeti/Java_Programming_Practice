package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            number = reader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(isPrime(number));
    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        return !div(number);
    }

    static boolean div(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}