package com.apna.Methods;

import java.util.Scanner;

public class Prime {
    // Find a num is prime or not

    // method 1: for only n >= 2
    public static boolean isPrime(int n) {
        // Corner cases
        // for 2
        if(n == 2) {
            return true;
        }

        for(int i=2;i<=n-1;i++) {
            if(n % i==0) { // dividing the number to check whether it has other factors
                return false; // no need to wait to get out of the loop
//                break; // alternate approach
            }// IMP: Do not write else condition in Prime
            // Only one division is enough to prove the number is not prime
        }
        return true; // when returning inside loop, return true here
    }

    // method 2: More optimized solution
    public static boolean isPrime2(int d) {
        if (d == 2)
            return true;
        for(int i=2; i <= Math.sqrt(d);i++) {
            if(d % i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
        int d = sc.nextInt();

//        boolean checkIPrime = isPrime(i);
        boolean checkDPrime = isPrime2(d);

//        System.out.println("Is num "+i+" prime: "+checkIPrime);
        System.out.println("Is num "+d+" prime: "+checkDPrime);
    }
}
