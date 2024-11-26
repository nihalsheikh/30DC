package com.apna.Loops;
import java.util.Scanner;

public class PrimeNumMeth1 {
    public static void main(String[] args) {
        // Checking if a num is Prime or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("Prime");
        }
        else {
            boolean isPrime = true;
            for(int i=2; i < (n-1); i++) {
            /* checking if n is a multiple of i
             (meaning i = i*n)
             n can be divided by other numbers other than 1 and itself
            */
                if(n % i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
