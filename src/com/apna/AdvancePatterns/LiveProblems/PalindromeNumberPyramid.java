package com.apna.AdvancePatterns.LiveProblems;

import java.util.Scanner;

public class PalindromeNumberPyramid {
    public static void Num_Palindrome(int n) {
        // MAIN OUTER LOOP
        for(int i=1; i<=n; i++) { // outer loop of lines
            // 1st Inner Loop
            for(int j=1; j<=n-i; j++) { // loop for spaces
                System.out.print(" ");
            }

            // 2nd Inner Loop: Descending Number: 1st Way using if else
//            for(int j=1; j<=i; j++) { // loop to print right sided num pyramid (i)
//                if(j == 1) {
//                    System.out.print(i);
//                }
//                else {
//                    System.out.print(i-j+1);
//                }
//            }

            // 2nd Inner Loop: Descending Number: 2nd Way by Decrementing j
            for(int j=i; j>=1; j--) { // use this instead of 1st Way, less code
                System.out.print(j);
            }

            // 3rd Inner Loop: Ascending Number
            for(int j=2; j<=i; j++) { // loop for left sided num pyramid (j)
                System.out.print(j);
            }

            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Num_Palindrome(n);
        sc.close();
    }
}
