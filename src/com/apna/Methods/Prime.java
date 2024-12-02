package com.apna.Methods;

import java.util.Scanner;

public class Prime {
    // Find a num is prime or not
    public static boolean isPrime(int n) {

        for(int i=2;i<=n-1;i++) {
            if(n % i==0) { // dividing the number to check whether it has other factors
                return false; // no need to wait to get out of the loop
//                break; // alternate approach
            }
            // IMP: Do not write else condition in Prime
            // Only one division is enough to prove the number is not prime
        }
        return true; // when returning inside loop, return true here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean checkPrime = isPrime(n);
        System.out.println("Is num "+n+" prime: "+checkPrime);
    }
}
