package com.apna.Methods;

import java.util.Scanner;

public class RangePrime {
    // check primes in a given range

    // check prime method
    public static boolean isPrime(int n) {
        if (n == 2)
            return true;

        for(int i=2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // primes in a given range
    public static void PrimeInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        PrimeInRange(50);
//        sc.close();
    }
}
