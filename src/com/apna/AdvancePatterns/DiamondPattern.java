package com.apna.AdvancePatterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void Diamond(int n) {
        // Upper part of the Pattern
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the Pattern
        // Logic of Printing reverse of a pattern is:
        // Only change the outer loop (the first for loop with i) to go decrementing
        // start the loop from 'n' and go upto 1
        // & the rest of the code remains same
        for(int i=n; i>=1; i--) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(); // go to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Diamond(n);
    }
}
